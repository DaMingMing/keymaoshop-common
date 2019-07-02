package com.keymao.common.jedis;

import java.util.List;

public interface JedisClient {

	String set(String key, String value);
	String get(String key);
	Boolean exists(String key);
	Long expire(String key, int seconds);
	Long ttl(String key);
	Long incr(String key);

	/**
	 * 根据指定key，往hash中设置field的值
	 * @param key
	 * @param field
	 * @param value
	 * @return
	 */
	Long hset(String key, String field, String value);
	String hget(String key, String field);
	Long hdel(String key, String... field);

	/**
	 * 删除指定key
	 * @param key
	 * @return
	 */
	Long del(String key);

	/**
	 * 根据指定key，判断指定hash中field是否存在
	 * @param key
	 * @param field
	 * @return
	 */
	Boolean hexists(String key, String field);

	/**
	 * 据指定key，获取指定hash中所有val的值
	 * @param key
	 * @return
	 */
	List<String> hvals(String key);
}
