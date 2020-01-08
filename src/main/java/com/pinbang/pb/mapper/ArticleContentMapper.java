package com.pinbang.pb.mapper;

import com.pinbang.pb.entity.ArticleContent;
import com.pinbang.pb.entity.ArticleContentExample;
import com.pinbang.pb.entity.ArticleContentWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleContentMapper {
    long countByExample(ArticleContentExample example);

    int deleteByExample(ArticleContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ArticleContentWithBLOBs record);

    int insertSelective(ArticleContentWithBLOBs record);

    List<ArticleContentWithBLOBs> selectByExampleWithBLOBs(ArticleContentExample example);

    List<ArticleContent> selectByExample(ArticleContentExample example);

    ArticleContentWithBLOBs selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ArticleContentWithBLOBs record, @Param("example") ArticleContentExample example);

    int updateByExampleWithBLOBs(@Param("record") ArticleContentWithBLOBs record, @Param("example") ArticleContentExample example);

    int updateByExample(@Param("record") ArticleContent record, @Param("example") ArticleContentExample example);

    int updateByPrimaryKeySelective(ArticleContentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ArticleContentWithBLOBs record);

    int updateByPrimaryKey(ArticleContent record);
}