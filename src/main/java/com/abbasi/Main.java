package com.abbasi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mohammad.Abbasi
 * @created 26/10/2020
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("myCoach", Coach.class);
        coach.getDailyWork();
        coach.getDailyFortune();
        System.out.println(((BaseballCoach) coach).getEmail());
    }
}
