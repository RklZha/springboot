package com.akl.scheduled.impl;

import com.akl.scheduled.ScheduledTest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-05-27 15:51
 * @Description:
 */
@Component
public class ScheduledImpl implements ScheduledTest {
	@Override
	@Scheduled(cron="0 * 16 * * ?")
	public void test1() {
		System.out.println("ScheduledImpl.test1");
	}

	/*@Override
	@Scheduled(fixedDelay = 1000)
	public void test2() {
		System.out.println("ScheduledImpl.test2");
	}*/
}
