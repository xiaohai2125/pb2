package com.pinbang.pb.service.article.Impl;

import com.pinbang.pb.entity.Article;
import com.pinbang.pb.entity.ArticleExample;
import com.pinbang.pb.mapper.ArticleMapper;
import com.pinbang.pb.service.article.articleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/12/28 10:42
 */
@Service

public class articleServiceImpl implements articleService {
    @Autowired
    private ArticleMapper articleMapper;
    ArticleExample example=null;
    ArticleExample.Criteria criteria=null;

    /**
     * 根据标题作者描述模糊查询
     * @param info
     * @return
     */
    @Override
    public List<Article> searchSelectLike(String info) {
    example=new ArticleExample();
    criteria=example.createCriteria();
    example.setOrderByClause("WHERE CONCAT(author,title,description)LIKE '%"+info+"%'");
    List<Article> searchLikeselect=articleMapper.selectByExample(example);
        return searchLikeselect;
    }

    @Override
    public int addArticle(Article article) {
        int cnt=0;
        articleMapper.insertSelective(article);
        return cnt;
    }

    @Override
    public String UpdateArticle(Map<Object, String> map) {
        example=new ArticleExample();
return null;
    }

    @Override
    public String deleteArticle(long id) {
        return null;
    }
}
