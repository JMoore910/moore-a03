package baseline;

import static java.lang.Math.*;

public class PaymentCalculator {
    //Variables should be private for baseline.PaymentCalculator's use ONLY
    //Overload the constructor to immediately set variables
    //variables:
    double numMonths;
    double dailyRate;
    double balance;
    double monthlyPayment;

    public PaymentCalculator(double dailyRate, double balance, double monthlyPayment) {
        this.balance = balance;
        this.dailyRate = dailyRate;
        this.monthlyPayment = monthlyPayment;
    }

    public double calculateMonthsUntilPaidOff() {
        //method uses class variables
        //create a constructor for a baseline.PaymentCalculator Object
        numMonths = (-1.0 / 30.0) * (log10(1.0 + balance / monthlyPayment * (1.0 - pow(1.0 + dailyRate, 30))) / log10(1.0 + dailyRate));
        return numMonths;
    }
}
