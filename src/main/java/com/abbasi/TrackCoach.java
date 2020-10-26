package com.abbasi;

/**
 * @author Mohammad.Abbasi
 * @created 26/10/2020
 */
public class TrackCoach implements Coach {
    private final FortuneService fortuneService;

    TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public void getDailyWork() {
        System.out.println("Run hard 5K");
    }

    @Override
    public void getDailyFortune() {
        this.fortuneService.getFortune();
    }
}
