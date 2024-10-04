/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myapp.carapplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import transportpackage.ITransport;
import transportpackage.Seat;
import transportpackage.Transport;

/**
 *
 * @author educa
 */
public class ToyotaBus extends VehicleAbstract implements ITransport
{
    private final int seatCount;
    private final String workingTime;
    
    public ToyotaBus(int id, String type, int seatCount, String workingTime){
        super(id,"Toyota",type,true);
        this.seatCount = seatCount;
        this.workingTime = workingTime;
    }
    
    @Override
    public List<Transport> mainTransport()
    {
        List<Transport> transports = new ArrayList<>();
        Transport transport = new Transport();
        transport.TYPE = ITransport.PERMIT2;
        transports.add(transport);
        return transports;
    }
    
    @Override
    public ArrayList<Seat> seats()
    {
        ArrayList<Seat> seats = new ArrayList<>();
        for(int i = 0; i < seatCount; i++)
        {
            seats.add(new Seat(3));
        }
        
        return seats;
         
    }
    
    @Override
    public String workingHours(int[] days)
    {
        return "works from" + workingTime + ", on: " + Arrays.toString(days);
        
    }
    
}
