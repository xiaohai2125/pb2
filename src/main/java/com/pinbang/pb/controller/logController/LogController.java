package com.pinbang.pb.controller.logController;

import com.pinbang.pb.entity.Log;
import com.pinbang.pb.service.log.logService;
import com.pinbang.pb.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2020/1/4 19:51
 */
@RestController
@RequestMapping("log")
public class LogController {
    @Autowired
    private logService ls;

    @RequestMapping("search")
    public Object search(@RequestParam(value = "info",defaultValue = "") String info, @RequestParam(value = "date1",defaultValue = "")String date1, @RequestParam(value = "date1",defaultValue = "")String date2){
        List<Log> logs=null;
        Map<String,Object> map=new HashMap<>();

    if (!("".equals(info))&&date1.equals("")&&date2.equals("")){
        logs=ls.selectByContent(info);
        System.out.println("进入内容查询");
        }
        else if (("".equals(info))&&!(date1.equals(""))&&!(date2.equals(""))){
    logs=ls.selectByDate(StringUtil.getDateByString(date1,"yyyy-MM-dd"),StringUtil.getDateByString(date2,"yyyy-MM-dd"));
        System.out.println("正在进行时间查询");
    }
    else{
        logs=ls.findAll();
    }
    map.put("code",0);
    map.put("msg","后台错误");
    map.put("count",logs.size());
    map.put("data",logs);
        return map;
    }

}
