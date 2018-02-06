package com.company;

public class MomsCar extends Car{
    private String color;
    private String wheel;
    private int engine;

    public MomsCar(int year, String make, String model, int speed, int gas, String color, String wheel, int engine) {
        super(year, make, model, speed, gas);
        this.color = color;
        this.wheel = wheel;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    protected void getMomsCarInfo(){
        System.out.println("You are driving your moms " + getColor() + " " + getMake() + " " + getModel() + " with a very fast V" + getEngine() + " engine. Little advice stop driving your moms car.");



    }
}
