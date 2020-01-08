package com.pinbang.pb.service.user;

import com.github.pagehelper.PageInfo;
import com.pinbang.pb.entity.User;

import java.util.List;

public interface UserService {
    public PageInfo<User> findAll(int pageNo, int pageSize);

    public PageInfo<User> findLike(String info, int pageNo, int pageSize);

    public int addUser(User user);

    public int updateUser(User user);

    public int delUser(byte id);

    public int getUserCount();

    public int delMoreUser(List<String> list);
    /**
     * 用户登录操作
     *
     * @param name
     *            登录名
     * @param pwd
     *            密码
     * @return 用户登录信息
     */
    public User login(String name, String pwd);
}
