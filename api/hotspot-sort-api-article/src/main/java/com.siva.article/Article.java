package com.siva.article;

import java.io.Serializable;

/**
 * 文章实体接口。
 * Created by zhourui on 2017/1/11.
 */
public interface Article extends Serializable {
    /**
     * 获取文章编码方法。
     * @return the id
     */
    String getId();
}
