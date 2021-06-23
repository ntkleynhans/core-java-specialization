package com.lq.exercises;

public class Main {

    public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for(int i = 0; i < daysOfWeek.length ; i++) {
            System.out.println(daysOfWeek[i]);
        }

        for(String day : daysOfWeek) {
            System.out.println(day);
        }

        for(int i = daysOfWeek.length-1; i >= 0 ; i--) {
            System.out.println(daysOfWeek[i]);
        }


        int count = 1;
        while(count++ < 21) {
            if(count % 2 == 0)
                System.out.println(count);
        }

        count = 0;
        while(count++ < 20) {
            if(count % 2 == 0)
                continue;
            System.out.println(count);
        }

        int[] daysInMonths = new int[12];
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};

        daysInMonths[0] = 31;
        daysInMonths[1] = 28;
        daysInMonths[2] = 31;
        daysInMonths[3] = 30;
        daysInMonths[4] = 31;
        daysInMonths[5] = 30;
        daysInMonths[6] = 31;
        daysInMonths[7] = 31;
        daysInMonths[8] = 30;
        daysInMonths[9] = 31;
        daysInMonths[10] = 30;
        daysInMonths[11] = 31;

        count = 0;
        while(count < monthNames.length) {
            switch(monthNames[count]) {
                case "January":
                case "March":
                case "May":
                case "July":
                case "August":
                case "October":
                case "December":
                    System.out.println(monthNames[count] + " has " + daysInMonths[count] + " days");
                    break;
                case "February":
                    System.out.println(monthNames[count] + " has " + daysInMonths[count] + " days");
                    break;
                case "April":
                case "June":
                case "September":
                case "November":
                    System.out.println(monthNames[count] + " has " + daysInMonths[count] + " days");
                    break;
            }
            count++;
        }

        String[] daysHeadings = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for(String day: daysHeadings) {
            System.out.print(day + "\t");
        }
        System.out.println("");
        int offset = 4;
        for(int i = -offset; i <= 31; i++) {
            if (i <= 0) {
                System.out.print("\t");
                continue;
            }
            if((i+offset) % 7 == 0)
                System.out.println("");
            System.out.print(i + "\t");
        }
    }
}
