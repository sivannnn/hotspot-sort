package com.siva.article;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 排序文章服务。
 * Created by zhourui on 2017/1/11.
 */
public class SortArticleService implements ArticleService{

    List<SortArticle> data = Lists.newArrayList();

    @Override
    public SortArticle getArticle(String id) {
        for(SortArticle temp:data){
            if(id.equals(temp.getId())){
                return temp;
            }
        }
        return null;
    }
}
