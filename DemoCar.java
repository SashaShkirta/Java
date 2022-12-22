    package com.edu;

import java.util.Arrays;

public class DemoCar {
    public static void main(String[] args) {

        Car carFirst = new Car("Sedan", 2.4);
        Car carSecond = new Car("Coupe", 3.2);
        Car carThird = new Car("SUV", 2.8);
        Car carFourth = new Car("Sedan", 2.0);

        carFirst.enterCar();
        carSecond.enterCar();
        carThird.enterCar();
        carFourth.enterCar();

        int[] yearArr = {carFirst.getYear(), carSecond.getYear(), carThird.getYear(), carFourth.getYear()};
        Arrays.sort(yearArr);
        for (int j : yearArr) {
            if (j == carFirst.getYear()) {
                System.out.println(carFirst.getType() + " - engine capacity: " + carFirst.getEnCapacity() + ", year:" + carFirst.getYear());
            } else if (j == carSecond.getYear()) {
                System.out.println(carSecond.getType() + " - engine capacity: " + carSecond.getEnCapacity() + ", year:" + carSecond.getYear());
            } else if (j == carThird.getYear()) {
                System.out.println(carThird.getType() + " - engine capacity: " + carThird.getEnCapacity() + ", year:" + carThird.getYear());
            } else if (j == carFourth.getYear()) {
                System.out.println(carFourth.getType() + " - engine capacity: " + carFourth.getEnCapacity() + ", year:" + carFourth.getYear());
            }
        }

    }

}
