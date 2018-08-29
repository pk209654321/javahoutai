package com.sscf.collect.task;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.sscf.collect.config.RedisLock;
import com.sscf.collect.config.RedisUtils;
import com.sscf.education.common.constants.RedisConstants;

/**
 * redis清理任务.
 *
 */
@Component
public class RedisCleanTask {
	/**
	 * 日志.
	 */
	public static final Logger logger = LoggerFactory.getLogger(RedisCleanTask.class);

	@Autowired
	private RedisUtils redisUtils;

	/**
	 * 凌晨4点 执行redis清理任务.
	 */
	/*@Scheduled(cron = "0 0 4 * * ?")
	public void doPush() {
		logger.info("redis清理任务.");
		String key = RedisConstants.LOCK_SCORE_TASK;
		RedisLock lock = redisUtils.lock(key, 5, TimeUnit.MINUTES);

		try {
			if (lock.lock()) {
				String redisKey = RedisConstants.HASH_COLLECT_ENTER;
				redisUtils.remove(redisKey);
			}
		} catch (InterruptedException e) {
			logger.error("加锁失败", e);
		} finally {
			lock.unlock();
		}
	}*/

}
