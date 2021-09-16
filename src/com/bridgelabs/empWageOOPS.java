package com.bridgelabs;

public class empWageOOPS {

    public static void main(String[] args) {

        // constants

        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int WAGE_PER_HOUR = 20;
        int empHour = 0;
        int Result = 0;
        // Computation
        int empCheck =(int) Math.floor(Math.random() * 10) % 3;
        System.out.println(empCheck);
        switch(empCheck){
            case 1:
                empHour = 12 ;
                System.out.println("Employee is Present Full TIme");
                break;
            case 2:
                empHour = 8 ;
                System.out.println("Employee is Present Part TIme");
                break;
            default:
                empHour = 0 ;
                System.out.println("Employee is Absent");
                break;}

        Result = empHour*WAGE_PER_HOUR;
        System.out.println(Result);
    }
}
