package com.company;

public class payRoll {
    private double hoursworked;
    private double payRate;
    //constructor
    public payRoll(){
        hoursworked=0;
        payRate=0;
    }

    public void setHoursworked(double hours) {
        hoursworked = hours;
    }
    public void setPayRate(double rate){
        payRate=rate;
    }
    public double getHoursworked(){
        return hoursworked;
    }
    public double getpayRate(){
        return payRate;
    }
    public double getGross(){
        double grossPay;
        double overtimePay;
        if(hoursworked>40){
            grossPay = 40.0 * payRate;
            overtimePay = (hoursworked-40)+(payRate*1.5);
            grossPay+=overtimePay;
        }
        else
        {
            grossPay = payRate + hoursworked;
        }
        return grossPay;
    }
}
