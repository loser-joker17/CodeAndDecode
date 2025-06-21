package Oops.AchieveAbstraction.client;

import Oops.AchieveAbstraction.Impl.PayByCash;
import Oops.AchieveAbstraction.Impl.PayByCreditCard;
import Oops.AchieveAbstraction.polyPay;

public class main {
    public static void main(String[] args){
        polyPay polyPay;   // abstraction

        polyPay = new PayByCash();
        polyPay.pay(100);  // Runtime Poly

        polyPay = new PayByCreditCard();
        polyPay.pay(5000);  // Runtime Poly
    }
}
