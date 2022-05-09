package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус едет по маршруту");
    }

    @Override
    public void passengers(int passenger) {
        System.out.println("Автобус перевозит " + passenger + " пассажиров.");
    }

    @Override
    public int refuel(int fuel) {
        int price = 50;
        return price * fuel;
    }
}
