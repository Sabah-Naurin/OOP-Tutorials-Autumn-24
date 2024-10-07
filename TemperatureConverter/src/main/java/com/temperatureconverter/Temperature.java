package com.temperatureconverter;

public class Temperature {
    public double temperature;

    public Temperature(double temperature) {
        this.temperature = temperature;
    }
    public double getFahrenheit() {
        return ((temperature/5) * 9) + 32;
    }

    public double getCelcius() {
        return ((temperature - 32) / 9) * 5;

    }
}
