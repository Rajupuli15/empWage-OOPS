package com.bridgelabs;

public class empWageOOPS {

    public static void main(String[] args) {

        // constants

        int IS_FULL_TIME = 1;
        int WAGE_PER_HOUR =20;
        int empHour = 0;
        int Result = 0;

        //computation

        double empCheck = Math.floor(Math.random() * 10 ) * 2;
        if (empCheck == IS_FULL_TIME)
        {
            System.out.println("Employee is Present");
            empHour = 8; }
        else {
            System.out.println("Employee is Absent");
            empHour = 0; }
        Result = empHour*WAGE_PER_HOUR;
        System.out.println(Result);

    }

}
