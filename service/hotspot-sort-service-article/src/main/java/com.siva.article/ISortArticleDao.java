package com.siva.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by zhourui on 2017/1/20.
 */
public class ISortArticleDao implements ArticleDao{
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void saveArticle(Article article) {
        redisTemplate.execute(new RedisCallback<String>() {
            @Override
            public String doInRedis(RedisConnection conn) throws DataAccessException {
                byte[] key = redisTemplate.getStringSerializer().serialize(article.getId());
                BoundHashOperations<Serializable,byte[],byte[]> boundHashOperations = redisTemplate.boundHashOps(key);
                boundHashOperations.put(redisTemplate.getStringSerializer().serialize("title"),
                        redisTemplate.getStringSerializer().serialize(article.getTitle()));

                conn.hMSet(key,boundHashOperations.entries());
                System.out.println("list api");
                System.out.println("string api");
                System.out.println("set api");
                System.out.println("fix list");
                System.out.println("map api");
                return "";
            }
        });
    }

    @Override
    public SortArticle getArticle(String id) {
        return (SortArticle) redisTemplate.execute(new RedisCallback<SortArticle>() {
            @Override
            public SortArticle doInRedis(RedisConnection conn) throws DataAccessException {
                Map<byte[], byte[]> result = conn.hGetAll(redisTemplate.getStringSerializer().serialize(id));
                return null;
            }
        });
    }
}
