package Oops.AchieveAbstraction.Impl;

import Oops.AchieveAbstraction.polyPay;

public class PayByCreditCard implements polyPay {
    @Override
    public void pay(int amount){
        System.out.println("Pay By Card :- " + amount);
    }
}
