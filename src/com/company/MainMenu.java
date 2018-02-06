package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    private Scanner input = new Scanner(System.in);

    protected void  createCar() {
        System.out.println("What kind of car would you like to create?");
        System.out.println("1. Custom Car \n2. Ready to go \n3. Exit ");

        try {
            switch (input.nextInt()) {
                case 1:
                    Car car = new Car();
                    car.getCarInfo();
                    menu(car);
                    break;
                case 2:
                    MomsCar momsCar = new MomsCar(1995, "Volvo", "850", 0,100,"Rusty Iron", "Falling off", 4);
                    momsCar.getMomsCarInfo();
                    menu(momsCar);
                    break;
                case 3:
                    //exit
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 3.");
                    createCar();
            }
        }catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please enter a number between 1 and 3.");
            createCar();



        }
    }
    public void menu (Car car){

        System.out.println("What would you like to do with the " + car.getMake() + " " + car.getModel() + "?");
        System.out.println("1. Accelerate \n2. Deccelerate \n3. Fill up with gas \n4. Exit ");

        try {
            switch (input.nextInt()) {
                case 1:
                    car.driveCar(car);
                    break;
                case 2:
                    car.slowCar(car);
                    break;
                case 3:
                    car.addGas(car);
                    break;
                case 4:
                    //exit
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a number between 1 and 4.");
                    menu(car);
            }
            }catch (InputMismatchException ime) {
                input.nextLine();
                System.out.println("Please enter a number between 1 and 4.");
                menu(car);



            }
        }
    }

