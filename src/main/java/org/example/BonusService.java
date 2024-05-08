package org.example;

public class BonusService {
    public long calculate(long amount, boolean registered)
    {
        int percent = registered ? 5 : 1;
        long bonus = amount * percent / 100;
        long limit = 1000;
        if (bonus <= limit) {
            return bonus;
        } else {return 1000;}
    }

}
