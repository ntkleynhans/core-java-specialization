package com.company;

public class Coffee  {
    private int temperature;

    public Coffee(int temperature) throws TooHotException {
        setTemperature(temperature);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) throws TooHotException {
        int MAX_TEMP = 120;
        if(temperature > MAX_TEMP) {
            throw new TooHotException(
                    String.format("Temperature %d if larger than the maximum temperature %d", temperature, MAX_TEMP)
            );
        }
        this.temperature = temperature;
    }
}
