package Oops.AchieveAbstraction.Impl;

import Oops.AchieveAbstraction.polyPay;

public class PayByCash implements polyPay {
    @Override
    public void pay(int amount){
        System.out.println("Payment by Card :- " + amount);
    }
}
