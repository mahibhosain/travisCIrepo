package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        System.out.println(this.getValue());
        float number = this.getValue();
        number = number - (float)(32.0);
        number = number*(float)(5.0);
        number = number/(float)(9.0);
        return new Celsius(number);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " F";
    }
}