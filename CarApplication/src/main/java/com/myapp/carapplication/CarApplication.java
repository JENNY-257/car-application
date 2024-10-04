/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myapp.carapplication;

import transportpackage.ITransport;

/**
 *
 * @author educa
 */
public class CarApplication 
{

    public static void main(String[] args) 
    {

        ToyotaBus bus1 = new ToyotaBus(1, "Bus", 3, "08:00 -12:00 ");
        ToyotaBus bus2 = new ToyotaBus(1, "Bus", 3, "12:00 -17:00 ");
        
        int schoolDays [] = {1,2,3,4,5};
        
        System.out.println("Student bus 1 with" + bus1.seats().size() + "Large seats" + bus1.workingHours(schoolDays));
        System.out.println("Valid permit: " + (bus1.mainTransport().get(0).TYPE.equals(ITransport.PERMIT2)? "Yes" :"No"));
        
        System.out.println("Student bus 2 with" + bus2.seats().size() + "Large seats" + bus2.workingHours(schoolDays));
        System.out.println("Valid permit: " + (bus2.mainTransport().get(0).TYPE.equals(ITransport.PERMIT2)? "Yes" :"No"));
        
 
        ToyotaBike employeeBike = new ToyotaBike(3,"Bike", true);
        
        System.out.println("Employee Bike without engine, small seat, works all days");
        System.out.println("Valid permit: " + (employeeBike.mainTransport().get(0).TYPE.equals(ITransport.PERMIT1) ? "YES" : "NO"));
        
        ToyotaBike generalBike = new ToyotaBike(4, "Bike", true);
        
        System.out.println("General Bike without engine, works all days");
        System.out.println("Valid permit: " + (generalBike.mainTransport().get(0).TYPE.equals(ITransport.PERMIT1) ? "YES" : "NO"));
    }
}
