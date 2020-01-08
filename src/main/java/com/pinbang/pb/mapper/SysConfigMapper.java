package com.pinbang.pb.mapper;

import com.pinbang.pb.entity.SysConfig;
import com.pinbang.pb.entity.SysConfigExample;
import com.pinbang.pb.entity.SysConfigWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysConfigMapper {
    long countByExample(SysConfigExample example);

    int deleteByExample(SysConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysConfigWithBLOBs record);

    int insertSelective(SysConfigWithBLOBs record);

    List<SysConfigWithBLOBs> selectByExampleWithBLOBs(SysConfigExample example);

    List<SysConfig> selectByExample(SysConfigExample example);

    SysConfigWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysConfigWithBLOBs record, @Param("example") SysConfigExample example);

    int updateByExampleWithBLOBs(@Param("record") SysConfigWithBLOBs record, @Param("example") SysConfigExample example);

    int updateByExample(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

    int updateByPrimaryKeySelective(SysConfigWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysConfigWithBLOBs record);

    int updateByPrimaryKey(SysConfig record);
}