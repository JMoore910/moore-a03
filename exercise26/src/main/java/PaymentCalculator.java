import static java.lang.Math.*;

public class PaymentCalculator {
    //Variables should be private for PaymentCalculator's use ONLY
    //Overload the constructor to immediately set variables
    //variables:
    double numMonths;
    double dailyRate;
    double balance;
    double monthlyPayment;

    PaymentCalculator(double dailyRate, double balance, double monthlyPayment){
        this.balance = balance;
        this.dailyRate = dailyRate;
        this.monthlyPayment = monthlyPayment;
    }

    public double calculateMonthsUntilPaidOff(){
        //method uses class variables
        //create a constructor for a PaymentCalculator Object

        System.out.println(balance + "" + dailyRate + "" + monthlyPayment);
        numMonths = -(1.0/30.0) * log(1 + balance/monthlyPayment * (1 - pow(1 + dailyRate,30.0)) / log(1 + dailyRate));

        return numMonths;
    }
}
