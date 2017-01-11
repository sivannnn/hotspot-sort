package com.siva.article;

/**
 * Created by zhourui on 2017/1/11.
 */
public class SortArticle implements Article{

    /** 文章编号 */
    private String id;
    private String title;


    @Override
    public String getId() {
        return this.id;
    }
}
