package com.siva.article;

import java.util.List;

/**
 * 文章服务类。
 * Created by zhourui on 2017/1/11.
 */
public interface ArticleService<E> {
    /**
     * 根据id获取文章方法。
     * @param id the id
     * @return 文章
     */
    E getArticle(String id);

    List<E> getAll();
}
