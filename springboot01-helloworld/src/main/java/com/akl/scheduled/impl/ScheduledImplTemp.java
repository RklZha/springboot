package com.akl.scheduled.impl;

import com.akl.scheduled.ScheduledTest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Project: springboot
 * @Author: 查建军
 * @Date: 2019-05-27 15:55
 * @Description:
 */
@Component
public class ScheduledImplTemp implements ScheduledTest {
	@Override
	@Scheduled(fixedDelay = 60000)
	public void test1() {
		System.out.println("ScheduledImplTemp.test1--------------------------------");

	}

	/*@Override
	@Scheduled(fixedDelay = 1000)
	public void test2() {
		System.out.println("ScheduledImplTemp.test2----------------------------");
	}*/
}
