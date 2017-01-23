package com.siva.article;

/**
 * Created by zhourui on 2017/1/20.
 */
public interface ArticleDao {

    /**
     * 保存文章信息方法.
     * @param article 文章信息.
     */
    void saveArticle(Article article);

    /**
     * 根据文章编号，获取文章信息.
     * @param id 文章编号.
     * @return 文章信息.
     */
    Article getArticle(String id);
}
