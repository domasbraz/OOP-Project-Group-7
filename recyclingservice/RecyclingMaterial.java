/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recyclingservice;

import java.io.Serializable;

/**
 *
 * @author davog
 */
public class RecyclingMaterial implements Serializable {
    String name;
    double decompositionTime;
    double enviromentalImpact;
    boolean recyclable;

    
    
    
    public RecyclingMaterial(){
        name="";
        decompositionTime=0;
        enviromentalImpact=0;
    }

    public RecyclingMaterial(String name, double decompositionTime, double enviromentalImpact, boolean recyclable) {
        this.name = name;
        this.decompositionTime = decompositionTime;
        this.enviromentalImpact = enviromentalImpact;
        this.recyclable = recyclable;
    }
    
    public boolean isRecyclable() {
        return recyclable;
    }

    public void setRecyclable(boolean recyclable) {
        this.recyclable = recyclable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDecompositionTime() {
        return decompositionTime;
    }

    public void setDecompositionTime(int decompositionTime) {
        this.decompositionTime = decompositionTime;
    }

    public double getEnviromentalImpact() {
        return enviromentalImpact;
    }

    public void setEnviromentalImpact(double enviromentalImpact) {
        this.enviromentalImpact = enviromentalImpact;
    }
    
    
}
