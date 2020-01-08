package com.pinbang.pb.service.log.impl;

import com.pinbang.pb.entity.Log;
import com.pinbang.pb.entity.LogExample;
import com.pinbang.pb.mapper.LogMapper;
import com.pinbang.pb.service.log.logService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service("logService")
public class logServiceImpl implements logService {
    @Resource
    public LogMapper logMapper;
    @Override
    public List<Log> selectByDate(Date date1, Date date2) {
        LogExample example=example=new LogExample();
        LogExample.Criteria criteria=example.createCriteria();
        criteria.andDateBetween(date1,date2);
        List<Log> selectByExample=logMapper.selectByExample(example);
        return selectByExample;
    }

    @Override
    public List<Log> selectByContent(String info) {
        LogExample example=new LogExample();;
        LogExample.Criteria criteria=example.createCriteria();
        criteria.andContentLike('%'+info+'%');
        List<Log> selectByExample=logMapper.selectByExample(example);
        return selectByExample;
    }

    @Override
    public int addLog(Log log) {
        int cnt=0;
       cnt= logMapper.insertSelective(log);
        return cnt;
    }

    @Override
    public int isdelect(long id) {
        return 0;
    }

    @Override
    public List<Log> findAll() {
        List<Log> logs= logMapper.selectByExample(null);
        return logs;
    }
}
