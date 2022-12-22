package com.edu;

import java.util.Scanner;

public class Car {
    private String type;
    private int year;
    private double enCapacity;

    public Car() {
    }
    public Car(String type, double enCapacity) {
        this.type = type;
        this.enCapacity = enCapacity;
    }
    public String getType() {return type;}
    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}
    public double getEnCapacity() {return enCapacity;}
    Scanner sc = new Scanner(System.in);
    public void enterCar() {
        System.out.println("Enter year: " + getType());
        setYear(sc.nextInt());
    }
}
