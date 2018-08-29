package com.sscf.collect.task;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.sscf.collect.config.RedisLock;
import com.sscf.collect.config.RedisUtils;
import com.sscf.collect.entity.Collect;
import com.sscf.collect.service.CollectService;
import com.sscf.education.common.constants.RedisConstants;

/**
 * 埋点定时任务.
 * 
 * @author lvcn
 *
 */
@Component
public class CollectTask {
	/**
	 * 日志.
	 */
	public static final Logger logger = LoggerFactory.getLogger(CollectTask.class);

	@Autowired
	private RedisUtils redisUtils;

	@Autowired
	private CollectService collectService;

	/*@Scheduled(fixedRate = 60000)
	public void doPush() {
		String key = RedisConstants.LOCK_COLLECT_TASK;
		RedisLock lock = redisUtils.lock(key, 5, TimeUnit.MINUTES);

		try {
			String leaveKey = RedisConstants.SET_COLLECT_LEAVE;
			if (lock.lock()) {
				Long sSize = redisUtils.sSize(leaveKey);
				logger.info("埋点离开事件队列长度:{}", sSize);
				for (int i = 0; i < sSize; i++) {
					Collect bean = redisUtils.sPop(leaveKey, Collect.class);
					if (bean != null) {
						collectService.addCollect(bean);
					} else {
						break;
					}
				}
			}
		} catch (InterruptedException e) {
			logger.error("加锁失败", e);
		} finally {
			lock.unlock();
		}
	}*/

}
