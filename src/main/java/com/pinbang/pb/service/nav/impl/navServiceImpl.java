package com.pinbang.pb.service.nav.impl;

import com.pinbang.pb.entity.Nav;
import com.pinbang.pb.entity.NavExample;
import com.pinbang.pb.mapper.NavMapper;
import com.pinbang.pb.service.nav.navService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/12/27 20:25
 */
@Service
public class navServiceImpl implements navService {
    @Autowired
    public NavMapper navMapper;


    NavExample example=null;
    NavExample.Criteria criteria=null;
    @Override
    public List<Nav> findFirstNav() {
        example=new NavExample();
        criteria=example.createCriteria();
        criteria.andParentIdEqualTo(-1l);
        List<Nav> navlist=navMapper.selectByExample(example);
        return navlist;
    }

    @Override
    public List<Nav> findAllNav() {
        List<Nav> navList=navMapper.selectByExample(null);
        return navList;
    }

    @Override
    public int findAllcount() {
        int cnt=0;
        long l=navMapper.countByExample(null);
        cnt=(int)l;
        return cnt;
    }

    @Override
    public List<Nav> findSecondNavById(long id) {
        example=new NavExample();
        criteria=example.createCriteria();
        criteria.andParentIdEqualTo(id);
        List<Nav> navList=navMapper.selectByExample(example);
        return navList;
    }

    @Override
    public int addNav(Nav nav) {
        int cnt=navMapper.insertSelective(nav);
        return cnt;
    }

    @Override
    public int deleteNavByid(long id) {
        int cnt =navMapper.deleteByPrimaryKey(id);
        return cnt;
    }

    @Override
    public String UpdateNav(Nav nav) {
        example =new NavExample();
        criteria=example.createCriteria();
        int cnt=navMapper.updateByPrimaryKeySelective(nav);
        if (cnt>0)
        return "success";
        else
            return "false";
    }
}
