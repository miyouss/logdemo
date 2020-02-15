package com.demo.controller;



import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Writer;
import java.util.Enumeration;

@Controller
@RequestMapping("/logLevel")
public class LogLevelController {
    /**
     *
     * @param p 需要修改的包名
     * @param l 日志级别
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/change", method = RequestMethod.GET, produces = "application/json")
    public String change(String p, String l) {
        try {
            Level level = Level.toLevel(l);
            org.apache.log4j.Logger logger = LogManager.getLogger(p);
            logger.setLevel(level);
        } catch (Exception e) {
            return "失败";
        }
        return "成功";
    }


    /**
     * 修改全局日志级别，但是我测试的时候只修改了第三方jar的日志级别，我的项目包的日志级别没有修改成功
     * @param l
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/changeRoot", method = RequestMethod.GET, produces = "application/json")
    public String change(String l) {
        try {
            Level level = Level.toLevel(l);
            LogManager.getRootLogger().setLevel(level);
        } catch (Exception e) {
            return "失败";
        }
        return "成功";
    }

    /**
     * 查看现在包的日志级别
     * @return
     */
    @RequestMapping(value = "/loggers", method = RequestMethod.GET)
    public void index(HttpServletRequest request, HttpServletResponse response) {

        StringBuilder sb = new StringBuilder();
        try {
            sb.append("<html>");
            Writer writer = response.getWriter();
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html; charset=utf-8");
            Enumeration logs = LogManager.getCurrentLoggers();
            while (logs.hasMoreElements()) {
                Logger logger = (Logger) logs.nextElement();
                sb.append("<span style='display:block;'>");
                sb.append(logger.getName()).append(",").append(logger.getEffectiveLevel());
                sb.append("</span>");
            }
            sb.append("</html>");
            writer.write(sb.toString());
            writer.flush();
            if(writer != null){
                writer.close();
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
        }

    }

}
