package com.javaintroduction;

public class Testdemo06 {

    int calculateTotal(int m1, int m2, int m3, int m4, int m5) {
        return m1 + m2 + m3 + m4 + m5;
    }

    double calculatePercentage(int total) {
        return total / 5.0;
    }

    double calculateAverage(int total) {
        return total / 5.0;
    }

    public static void main(String[] args) {

        Testdemo06 obj = new Testdemo06();

        int total = obj.calculateTotal(80, 75, 90, 85, 70);

        double percentage = obj.calculatePercentage(total);
        double average = obj.calculateAverage(total);

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
        System.out.println("Average = " + average);
    }
}
