package com.pinbang.pb.mapper;

import com.pinbang.pb.entity.ResourceConfig;
import com.pinbang.pb.entity.ResourceConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourceConfigMapper {
    long countByExample(ResourceConfigExample example);

    int deleteByExample(ResourceConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ResourceConfig record);

    int insertSelective(ResourceConfig record);

    List<ResourceConfig> selectByExample(ResourceConfigExample example);

    ResourceConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ResourceConfig record, @Param("example") ResourceConfigExample example);

    int updateByExample(@Param("record") ResourceConfig record, @Param("example") ResourceConfigExample example);

    int updateByPrimaryKeySelective(ResourceConfig record);

    int updateByPrimaryKey(ResourceConfig record);
}