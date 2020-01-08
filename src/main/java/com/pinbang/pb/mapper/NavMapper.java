package com.pinbang.pb.mapper;

import com.pinbang.pb.entity.Nav;
import com.pinbang.pb.entity.NavExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NavMapper {
    long countByExample(NavExample example);

    int deleteByExample(NavExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nav record);

    int insertSelective(Nav record);

    List<Nav> selectByExample(NavExample example);

    Nav selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nav record, @Param("example") NavExample example);

    int updateByExample(@Param("record") Nav record, @Param("example") NavExample example);

    int updateByPrimaryKeySelective(Nav record);

    int updateByPrimaryKey(Nav record);

    int isdeleteByPrimaryKey(long id);
}