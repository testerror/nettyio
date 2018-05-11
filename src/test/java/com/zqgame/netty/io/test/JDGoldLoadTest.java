package com.zqgame.netty.io.test;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class JDGoldLoadTest {

	@Test
	public void test(){

		LocalDate now = LocalDate.now();
		LocalDate lastUpdateDate = LocalDate.of(2018,4,18);

		double baseRate = 0.0005;
		double baseMoney = 11250;
		double monthMoney = 1250;

//		now = LocalDate.of(2018,4,18);
//		lastUpdateDate = LocalDate.of(2018,3,18);

//		baseMoney += monthMoney;


		//Period period = Period.between(lastUpdateDate,now);
		long dayCount = lastUpdateDate.until(now, ChronoUnit.DAYS);
		dayCount ++;

		System.out.println(dayCount);
		System.out.println(lastUpdateDate);
		System.out.println(now);

		double addRewardMoney = baseRate * baseMoney * dayCount;
		double summaryMoney = baseMoney + addRewardMoney;

		monthMoney += addRewardMoney;

		System.out.println(addRewardMoney);
		System.out.println(monthMoney);
		System.out.println(summaryMoney);



	}


}