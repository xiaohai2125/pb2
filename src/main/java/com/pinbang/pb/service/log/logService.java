package com.pinbang.pb.service.log;


import com.pinbang.pb.entity.Log;

import java.util.Date;
import java.util.List;


public interface logService {
    /**
     * 根据时间查询日志
     * @param date1
     * @param date2
     * @return
     */
    public List<Log> selectByDate(Date date1, Date date2);

    /**
     * 模糊查询信息并显示出日志
     * @param info
     * @return
     */
    public List<Log> selectByContent(String info);

    /**
     * 添加数据
     * @param log
     * @return
     */
    public int addLog(Log log);

    /**
     * 逻辑删除
     * @param id
     * @return
     */
    public int isdelect(long id);
    public List<Log> findAll();

}
