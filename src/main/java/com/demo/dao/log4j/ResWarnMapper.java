package com.demo.dao.log4j;

import com.demo.pojo.log4j.ResLog;
import com.demo.pojo.log4j.ResWarn;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface ResWarnMapper {

    List<ResWarn> selectAll(Map paramMap);

    Long selectAllCount(Map paramMap);

    void handle(List<ResWarn> resWarns);

    ResWarn seeWarn(Map map);

    void insert(ResWarn resWarn);

    List<ResWarn> selectLastWarn();

    void update(ResWarn resWarn);
}
