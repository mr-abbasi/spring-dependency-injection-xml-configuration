package com.abbasi;

/**
 * @author Mohammad.Abbasi
 * @created 26/10/2020
 */
public class HappyFortuneService implements FortuneService {
    @Override
    public void getFortune() {
        System.out.println("Today is your lucky day");
    }
}
