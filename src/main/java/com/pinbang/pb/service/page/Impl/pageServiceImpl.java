package com.pinbang.pb.service.page.Impl;

import com.pinbang.pb.entity.Nav;
import com.pinbang.pb.entity.Page;
import com.pinbang.pb.entity.PageExample;
import com.pinbang.pb.mapper.PageMapper;
import com.pinbang.pb.service.page.pageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/12/31 15:40
 */
@Service
public class pageServiceImpl implements pageService {
    @Autowired
    private PageMapper pm;

    PageExample example=null;
    PageExample.Criteria criteria=null;
    @Override
    public List<Page> findPageByparentid(long id) {
        example=new PageExample();
        criteria= example.createCriteria();
        criteria.andParentIdEqualTo(id);
        List<Page> pages=pm.selectByExampleWithBLOBs(example);
        return pages;
    }

    @Override
    public List<Page> findLike(String info) {
List<Page> pages=pm.findLike(info);
        return pages;
    }
    @Override
    public int isdeleteById(long id) {
        int cnt=pm.deleteByPrimaryKey(id);
        return cnt;
    }

    @Override
    public int addPage(Page page) {

        int cnt=pm.insertSelective(page);
        return cnt;
    }

    @Override
    public Page edit(long id) {
        example=new PageExample();
        example.createCriteria();

        return null;
    }

    @Override
    public List<Page> findAll() {
        List<Page> pages=pm.selectByExampleWithBLOBs(null);
         return pages;
    }
}
