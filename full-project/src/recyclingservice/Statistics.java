/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recyclingservice;

import java.util.ArrayList;

/**
 *
 * @author TOSHIBA
 */
public class Statistics{
    private ArrayList <Goal> completedGoalsS;
    private ArrayList <Goal> incompleteGoalsS;
    protected double totalRecycledAmount;
 
   public Statistics(ArrayList<Goal> completedGoals, ArrayList <Goal> incompleteGoals){
       this.completedGoalsS = completedGoals;
       this.incompleteGoalsS = incompleteGoals;
        
    }
   
 public double computeTotalRecycledAmount(ArrayList<Goal> incompleteGoals, ArrayList<Goal> completedGoals) {
    double totalRecycledAmount = 0.0;

    for (Goal goal : incompleteGoals) {
        totalRecycledAmount += goal.getCurrentAmount();
    }

    for (Goal goal : completedGoals) {
        totalRecycledAmount += goal.getCurrentAmount();
    }

    return totalRecycledAmount;

}

    
    public double getTotalRecycledAmount() {
        return totalRecycledAmount;
    }

    public ArrayList<Goal> getCompletedGoals(){
       return completedGoalsS;
   }
   
    public void setCompletedGoals(ArrayList<Goal> completedGoals){
        this.completedGoalsS = completedGoals;
    }

    public ArrayList<Goal> getGoals(){
        return incompleteGoalsS;
    }
    
    public void setGoals(ArrayList<Goal> incompleteGoals){
        this.incompleteGoalsS = incompleteGoals;
    }
}
    
    

