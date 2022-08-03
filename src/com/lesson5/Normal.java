package com.lesson5;

public class Normal {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Driver driver = new Driver();
        Car car = new Car();

        engine.setPower(220);
        engine.setProducer("Ford");

        driver.setName("Ivan");
        driver.setExperience(4);

        car.setDriver(driver);
        car.setEngine(engine);
        car.setModel("Ford Mondeo");
        car.setCarClass("Comfort");
        car.setWeight(1.4);

        System.out.println(car);

    }

}

class Car {
    private String model;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "����������: " + "\n" +
                "������: " + model + "\n" +
                "����� ����������: " + carClass + "\n" +
                "���(����): " + weight + "\n" +
                "��������: " + driver + "\n" +
                "���������: " + engine  + "\n" +
                ' ';
    }

    public void start() {
        System.out.println("�������!");
    }
    public void stop() {
        System.out.println("���������������!");
    }
    public void turnRight() {
        System.out.println("������������ �������!");
    }
    public void turnLeft() {
        System.out.println("����������� ������!");
    }
}

class Driver {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    private int experience;

    @Override
    public String toString() {
        return "���: " + name +
                ", ���� ��������: " + experience +
                ' ' ;
    }
}

class Engine {
private int power;
private String producer;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "��������(��): " + power + "\n" +
                "�������������: " + producer +
                ' ' ;
    }
}
