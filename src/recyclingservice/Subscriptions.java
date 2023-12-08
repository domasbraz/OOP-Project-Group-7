/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recyclingservice;

/**
 *
 * @author adamp
 */
public class Subscriptions {

    //data members
    private final int bronze, silver, gold;
    private final int months;
    private int balance, input;
    
    //constuctor
    public Subscriptions(){
        bronze = 30;
        silver = 50;
        gold = 80;
        months = 12;
        balance = 0;
        input = 0;
    }
    //setter
    public void setBalance(int input){
        this.input = input;
    }
    //all compute methods for label
    public int ComputeBronze(){
        int temp;
        temp = bronze * months;
        return temp;
    }
    public int ComputeSilver(){
        int temp;
        temp = silver * months;
        return temp;
    }
    public int ComputeGold(){
        int temp;
        temp = gold * months;
        return temp;
    }
    //balance methods
    public int AddBalance(){
        balance = balance + input;
        return balance;
    }
    public int SubBalance(){
        balance = balance - input;
        if(balance <= 0){
            balance = 0;
        }
        return balance;
    }
    public int ShowBalance(){
        return balance;
    }
    //subscription purchases
    public int BronzePurchase(){
        balance = balance - bronze;
        return balance;
    } 
    public int SilverPurchase(){
        balance = balance - silver;
        return balance;
    } 
    public int GoldPurchase(){
        balance = balance - gold;
        return balance;
    } 
}

