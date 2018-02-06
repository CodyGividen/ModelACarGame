package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.company.Main.mainMenu;

public class Car extends Vehicle{
    private Scanner input = new Scanner(System.in);
    private int year;
    private String make;
    private String model;
    private int speed = 0;
    private int gas = 100;

    public Car() {
        setMake();
        setModel();
        setYear();
        setSpeed(0);
        setGas(100);
    }
    public Car(int year, String make, String model, int speed, int gas){
        super(year, make, model);
        this.speed = speed;
        this.gas = gas;
    }

    public void setYear() {
        System.out.println("What is the year of the car you would like to make?");
        try {
            super.setYear(input.nextInt());
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please enter a number for the year.");
            setYear();
        }
    }


    public void setMake() {
        System.out.println("What is the make of your car you would like to create?");
        super.setMake(input.nextLine());
    }
    public void setModel() {
        System.out.println("What is the model of your car you would like to create?");
        super.setModel(input.nextLine());
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public void getCarInfo() {
        System.out.println("The current car is a " + getMake() + " " + getModel() + ". It is going " + getSpeed() + "MPH and has " + getGas() + "% gas left.");


    }

    public void driveCar(Car car) {
        for (int seconds = 0; seconds <= 5; seconds++) {
            car.setSpeed(car.getSpeed() + 1);
            car.setGas(car.getGas() - 1);

            System.out.println("The " + car.getMake() + " " + car.getModel() + " is going " + car.getSpeed() + "MPH and has " + car.getGas() + "% of its gas left.");
        }

        mainMenu.menu(car);
    }

    public void slowCar(Car car) {
        for (int seconds = 0; seconds <= 5; seconds++) {
            car.setSpeed(car.getSpeed() - 1);
            car.setGas(car.getGas() - 1);

            System.out.println("The " + car.getMake() + " " + car.getModel() + " is going " + car.getSpeed() + "MPH and has " + car.getGas() + "% of its gas left.");
        }

        mainMenu.menu(car);
    }

    public void addGas(Car car) {
        car.setGas(100);

        System.out.println("You now have full tank of gas.");
        mainMenu.menu(car);
    }
}

