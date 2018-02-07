package com.company;

import static com.company.Main.mainMenu;

public class DeLorean extends Car {
    private int timeTravel;
    private int number1 =(int) Math.ceil(Math.random() * 9);
    private int number2 =(int) Math.ceil(Math.random() * 9);
    private int number3 =(int) Math.ceil(Math.random() * 9);
    private int number4 =(int) Math.ceil(Math.random() * 9);

    public DeLorean(int year, String make, String model, int speed, int gas, int timeTravel) {
        super(year, make, model, speed, gas);
        this.timeTravel = timeTravel;
    }

    public int getTimeTravel() {
        return timeTravel;
    }

    public void setTimeTravel(int timeTravel) {
        this.timeTravel = timeTravel;
    }

    protected void getDeLoreanInfo() {
        System.out.println("You are driving a nice " + getYear() + " " + getMake() + " " + getModel() + ".");
    }

    @Override
    public void driveCar(Car car) {
        if(getSpeed() == timeTravel){
            setSpeed(0);
            setGas(100);
        }else{
            super.driveCar(car);
            System.out.println("You have been struck by lightning, and you have traveled to " + number1 + number2 + number3 + number4);
            mainMenu.menu(car);
        }
    }
}

