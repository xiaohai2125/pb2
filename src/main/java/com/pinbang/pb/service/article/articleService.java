package com.pinbang.pb.service.article;

import com.pinbang.pb.entity.Article;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/12/28 10:07
 */
@Service
public interface articleService {
    /**
     * 根据条件模糊查询相关条件
     * @param info
     * @return
     */
    public List<Article> searchSelectLike(String info);

    /**
     * 添加一个内容
     * @param article
     * @return
     */
    public int addArticle(Article article);

    /**
     * 更新一条数据根据id
     * @param map
     * @return
     */
    public String UpdateArticle(Map<Object, String> map);

    /**
     * 逻辑删除0为未删除1为删除
     * @param id
     * @return
     */
    public String deleteArticle(long id);
}
