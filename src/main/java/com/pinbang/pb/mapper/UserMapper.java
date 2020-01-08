package com.pinbang.pb.mapper;

import com.pinbang.pb.entity.User;
import com.pinbang.pb.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExampleWithBLOBs(UserExample example);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExampleWithBLOBs(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKeyWithBLOBs(User record);

    int updateByPrimaryKey(User record);

    int updateByUserId(int id);

    int updateByUserIdList(@Param("list") List<String> list);
    /**
     * 根据用户名和密码查询用户的信息
     *
     * @param name
     *            登录名称
     * @param pwd
     *            密码
     * @return 登录用户信息
     */
    public User getSysUserByNameAndPassword(@Param("name") String name,
                                            @Param("pwd") String pwd);

}