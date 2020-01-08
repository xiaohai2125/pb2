package com.pinbang.pb.service.user.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pinbang.pb.entity.User;
import com.pinbang.pb.entity.UserExample;
import com.pinbang.pb.mapper.UserMapper;
import com.pinbang.pb.service.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper us;

    UserExample example=null;
    UserExample.Criteria criteria=null;

    /**
     * 查询用户列表
     * @return 用户对象集合
     */
    @Override
    public PageInfo<User> findAll(int pageNo, int pageSize) {


        example = new UserExample();
        criteria = example.createCriteria();
        int a = 0;
        byte b = (byte) a;
        criteria.andIsDeleteEqualTo(b);
        List<User> users=us.selectByExample(example);
        //开启分页
        PageHelper.startPage(pageNo,pageSize);
        //创建响应对象
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        return userPageInfo;
    }

    /**
     * 根据用户名搜索查询
     * @param info 搜索信息
     * @return 用户对象集合
     */
    @Override
    public PageInfo<User> findLike(String info,int pageNo, int pageSize) {
        example=new UserExample();
        criteria = example.createCriteria();
        criteria.andNameLike("%"+info+"%");
        int a = 0;
        byte b = (byte) a;
        criteria.andIsDeleteEqualTo(b);
        List<User> userList = us.selectByExample(example);
        //开启分页
        PageHelper.startPage(pageNo,pageSize);
        //创建响应对象
        PageInfo<User> userPageInfo = new PageInfo<>(userList);
        return userPageInfo;
    }

    /**
     * 添加用户
     * @param user 用户对象
     * @return
     */
    @Override
    public int addUser(User user){
        int i = us.insertSelective(user);
        return i;
    }
    /**
     * 修改用户信息2
     * @param user 用户对象
     * @return
     */
    @Override
    public int updateUser(User user) {
        int i = us.updateByPrimaryKeySelective(user);
        return i;
    }
    /**
     * 逻辑删除
     * @param id 用户id
     * @return
     */
    @Override
    public int delUser(byte id) {
        int i = us.updateByUserId(id);
        return i;
    }
    /**
     * 查询用户总数
     * @return
     */
    @Override
    public int getUserCount() {
        example = new UserExample();
        criteria = example.createCriteria();
        int a = 0;
        byte b = (byte) a;
        criteria.andIsDeleteEqualTo(b);
        int i = (int)us.countByExample(example);
        return i;
    }
    /**
     * 批量删除
     * @param list
     * @return
     */
    @Override
    public int delMoreUser(List<String> list) {
        int i = us.updateByUserIdList(list);
        return i;
    }
    @Override
    public User login(String name, String pwd) {
        return us.getSysUserByNameAndPassword(name, pwd);
    }
}
