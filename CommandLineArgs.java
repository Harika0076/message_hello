package com.basicjava;

public class CommandLineArgs {
        public static void main(String[] values) {
            int sum = 0,count=0;
            System.out.println("Calculates Sum for below Integers");

            for(int i=0;i<values.length;i++){
                System.out.println(values[i]);
                try {
                    sum = sum + Integer.parseInt(values[i]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid integer command line arguments: " + e.toString());
                    count++;
                }
            }
            System.out.println("Sum :" + sum);
            System.out.println("The number of invalid integers are:"+count);

        }

}
