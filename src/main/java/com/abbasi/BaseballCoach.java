package com.abbasi;

/**
 * @author Mohammad.Abbasi
 * @created 26/10/2020
 */
public class BaseballCoach implements Coach {

    private  FortuneService fortuneService;

    private String email;
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

//    BaseballCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    public void getDailyWork() {
        System.out.println("Practice 20 minutes batting");
    }

    @Override
    public void getDailyFortune() {
        this.fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
