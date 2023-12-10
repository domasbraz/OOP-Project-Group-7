
package recyclingservice;

import java.io.Serializable;
import java.util.ArrayList;


public class RecyclingObj implements Serializable {
    
    String name;
    String type;
    
    ArrayList<RecyclingMaterial> materials;
    String[] matNames;
    
    double decompositionTime;
    String recyclingType;
    double enviromentalImpact;
    String description;
    boolean recyclable;
    
    public RecyclingObj(String name,String type, ArrayList<RecyclingMaterial> materials,String recyclingType,String description)
    {
        this.name = name;
        this.type = type;
        this.recyclingType=recyclingType;
        this.description=description; 
        this.materials = materials;
        
        CalculateVariables();
        
    }
    
    public  ArrayList<RecyclingMaterial> getMaterials() {
        return materials;
    }

    public void setMaterials( ArrayList<RecyclingMaterial> materials) {
        this.materials = materials;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public boolean isRecyclable() {
        return recyclable;
    }

    
    
    public RecyclingObj(){
        name = type = recyclingType = "";
        decompositionTime = 0;
        enviromentalImpact = 0.0;
    }
    
    private void CalculateVariables(){
        RecyclingMaterial mat = materials.get(0);
        double DT = mat.getDecompositionTime();
        double EI = mat.getEnviromentalImpact();
        boolean iRb = mat.isRecyclable();
        
        matNames = new String[materials.size()];
        matNames[0] = materials.get(0).name;
        for(int i=1;i<materials.size();i++){
            matNames[i] = materials.get(i).name;
            boolean NiRb = materials.get(i).isRecyclable();
            double NDT = materials.get(i).getDecompositionTime();
            double NEI = materials.get(i).getEnviromentalImpact();
            if(DT<NDT)
                DT=NDT;
            if(EI<NEI)
                EI=NEI;
            if(NiRb == false)
                iRb = false;
        }
        
        this.decompositionTime=DT;
        this.enviromentalImpact = EI;
        this.recyclable = iRb;
    }
    
    //public RecyclingObj RecyclingObj(String name,String type, String recyclingType,int decompositionTime,double enviromentalImpact)
    //{
       // RecyclingObj obj = new RecyclingObj();
      //  obj.setName(name);
      //  obj.setType(type);
      //  obj.setRecyclingType(recyclingType);
      //  obj.setDecompositionTime(decompositionTime);
       // obj.setEnviromentalImpact(enviromentalImpact);
      //  return obj;
    //}
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRecyclingType(String recyclingType) {
        this.recyclingType = recyclingType;
    }

    public String getType() {
        return type;
    }

    public double getDecompositionTime() {
        return decompositionTime;
    }

    public String getRecyclingType() {
        return recyclingType;
    }

    public double getEnviromentalImpact() {
        return enviromentalImpact;
    }
    
    public String setName(){
        return this.name;
    }
}
