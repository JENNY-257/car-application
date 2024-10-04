/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myapp.carapplication;

import java.util.ArrayList;
import java.util.List;
import transportpackage.ITransport;
import transportpackage.Seat;
import transportpackage.Transport;

/**
 *
 * @author educa
 */
public class ToyotaBike extends VehicleAbstract implements ITransport 

{
    public boolean forEmployees;
    
    public ToyotaBike(int id, String type,boolean forEmployees)
    {
        super(id,"Toyota",type,false);
        this.forEmployees = forEmployees;
    }
    
    @Override
    public List<Transport> mainTransport()
    {
        List<Transport> transports = new ArrayList<>();
        Transport transport = new Transport();
        transport.TYPE = forEmployees  ? ITransport.PERMIT1 : "General";
        transports.add(transport);
        return transports;
    }
    
    @Override
    public ArrayList<Seat> seats()
    {
        ArrayList<Seat> seats = new ArrayList<>();
        seats.add(new Seat(1));
        return seats;
    }
    
    @Override
    public String workingHours(int [] days )
    {
        return "Bike works all days";
    }
}
