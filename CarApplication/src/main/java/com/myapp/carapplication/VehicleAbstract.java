/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myapp.carapplication;

import java.util.List;
import transportpackage.Transport;

/**
 *
 * @author educa
 */
public abstract class VehicleAbstract {
    
    private int VehicleId;
    private String ManufactureName;
    private String Type;
    private boolean HasEngine;
    
    public VehicleAbstract(int id, String name, String type, boolean hasEngine){
        this.VehicleId = id;
        this.ManufactureName = name;
        this.Type = type;
        this.HasEngine = hasEngine;
        
    }
    
    public abstract List<Transport> mainTransport();
    
    public abstract String workingHours(int[] days);
    
    
    
    

    
    
}
