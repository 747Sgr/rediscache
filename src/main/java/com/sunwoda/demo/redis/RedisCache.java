package com.sunwoda.demo.redis;

import com.sunwoda.demo.utils.ApplicationContextUtil;
import org.apache.ibatis.cache.Cache;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * Description:自定义redis的缓存
 *
 * @author shiguorang
 * @date 2021-04-22 13:35:25
 */
public class RedisCache implements Cache {

    private final String id;

    public RedisCache(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    /**
     * @Author shiguorang
     * @Description //将数据放进redis缓存
     * @Date 14:34:17 2021-04-22
     * @Param
     * @return
     **/
    @Override
    public void putObject(Object key, Object value) {
        RedisTemplate redisTemplate = getRedisTemplate();
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.opsForHash().put(id,key.toString(),value);

    }

    /**
     * @Author shiguorang
     * @Description //从redis缓存中获取指定键的数据
     * @Date 14:34:36 2021-04-22
     * @Param
     * @return
     **/
    @Override
    public Object getObject(Object key) {
        RedisTemplate redisTemplate = getRedisTemplate();
        return redisTemplate.opsForHash().get(id, key.toString());
    }

    /**
     * @Author shiguorang
     * @Description //通过指定键删除缓存，mybatis没有实现
     * @Date 14:28:03 2021-04-22
     * @Param
     * @return
     **/
    @Override
    public Object removeObject(Object key) {
        return null;
    }

    /**
     * @Author shiguorang
     * @Description //清空缓存 当有数据更新或者删除的时候会清空
     * @Date 14:31:39 2021-04-22
     * @Param
     * @return
     **/
    @Override
    public void clear() {
        RedisTemplate redisTemplate = getRedisTemplate();
        redisTemplate.delete(id);
    }

    /**
     * @Author shiguorang
     * @Description 用来计算缓存数量
     * @Date 14:31:51 2021-04-22
     * @Param
     * @return
     **/
    @Override
    public int getSize() {
        RedisTemplate redisTemplate = getRedisTemplate();
        return redisTemplate.opsForHash().size(id).intValue();
    }

    /**
     * @Author shiguorang
     * @Description //获取redisTemplate
     * @Date 14:33:14 2021-04-22
     * @Param
     * @return
     **/
    private RedisTemplate getRedisTemplate(){
        RedisTemplate redisTemplate = (RedisTemplate) ApplicationContextUtil.getBean("redisTemplate");
        //        更改键的序列化方案
        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        更改hash键的序列化方案
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        return redisTemplate;
    }
}
