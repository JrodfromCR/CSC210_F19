/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * A Car Class!
 * @author kerlin
 */
public class Car
{
    private String name;
    private int currentSpeed;

    public Car(String inName)
    {
        name = inName;
    }

    //**
    Increase the speed of the car.
    Add param here when modified.
    */
    public void accelerate()
    {
        currentSpeed += 10;
    }

    public void park()
    {
        currentSpeed = 0;
    }

    public void printCurrentSpeed()
    {
        System.out.println("Current Speed is: " + currentSpeed);
    }
}
