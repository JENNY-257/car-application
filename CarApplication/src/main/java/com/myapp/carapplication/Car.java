/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myapp.carapplication;

/**
 *
 * @author educa
 */
public class Car 
{
    
    private int CarId;
    private String CarName;
    private static String CarMaker = "Toyota";;
    
    public Car(int id)
    {
        this.CarId = id;
    }
    
    public void setCarName(String name)
    {
        this.CarName = name;
    }
    
    public String getCarName()
    {
        return this.CarName;
    }
    
    
}
