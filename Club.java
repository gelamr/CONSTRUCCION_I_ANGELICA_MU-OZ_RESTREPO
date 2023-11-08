package com.mycompany.socialclubs;

import java.util.List;

public class Club {
    private String Name;
    private int Document;
    private double FundsAvailable;
    private String SubscriptionType;
    private List<String> UnpaidInvoices;
    private List<String> AuthorizedPersons;
    
    private double Funds;

    public Club(String Name, int Document, String SubscriptionType) {
        this.Name = Name;
        this.Document = Document;
        this.SubscriptionType = SubscriptionType;
    }

    public Club(double FundsAvailable, List<String> UnpaidInvoices, List<String> AuthorizedPersons) {
        this.FundsAvailable = FundsAvailable;
        this.UnpaidInvoices = UnpaidInvoices;
        this.AuthorizedPersons = AuthorizedPersons;
    }

    public int getDocument() {
        return Document;
    }

    public void setDocument(int Document) {
        this.Document = Document;
    }

    public double getFunds() {
        return Funds;
    }

    public void setFunds(double Funds) {
        this.Funds = Funds;
    }
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getFundsAvailable() {
        return FundsAvailable;
    }

    public void setFundsAvailable(double FundsAvailable) {
        this.FundsAvailable = FundsAvailable;
    }

    public String getSubscriptionType() {
        return SubscriptionType;
    }

    public void setSubscriptionType(String SubscriptionType) {
        this.SubscriptionType = SubscriptionType;
    }

    public List<String> getUnpaidInvoices() {
        return UnpaidInvoices;
    }

    public void setUnpaidInvoices(List<String> UnpaidInvoices) {
        this.UnpaidInvoices = UnpaidInvoices;
    }

    public List<String> getAuthorizedPersons() {
        return AuthorizedPersons;
    }

    public void setAuthorizedPersons(List<String> AuthorizedPersons) {
        this.AuthorizedPersons = AuthorizedPersons;
    }
    
    public void RegularSubscription(int InitialFund) {
        if(InitialFund == 50000 ){
             System.out.println("Fund successfully added");
        }
         else{
             System.out.println("The background is not valid ");
        }
    }
    public void AddPartner(int partner) {
        if(partner > 3) {
            System.out.println("No more VIP members can be added");
            System.exit(0);
            return;
        }
        else {
            System.out.println("Partner successfully added");
            
        }
        
    }
    
    public void VIPSubscription(int InitialFund){
        if(InitialFund == 100000){
            System.out.println("Fund successfully added");
            System.exit(0);
            return;
        }
        else {
            System.out.println("The background is not valid");
        }
    }
    
    public void IncreaseRegularFunds(int increasefunds){
        if(increasefunds <= 1000000) {
            System.out.println("Fund successfully added");
            System.exit(0);
            return;
        }
        else {
            System.out.println("The fund is not valid, its maximum amount is one million pesos");
            System.exit(0);
            return;
        } 
    }
    
    public void IncreaseVIPfunds(int increasefund){
        if(increasefund <= 5000000){
            System.out.println("Fund successfully added");
            System.exit(0);
            return;
        }
        else{
            System.out.println("The fund is not valid, its maximum amount is five million pesos");
        }
    } 
    
    public void UnpaidInvoice(int bill){
        if(bill <= 20){
            System.out.println("Invoice added successfully");
        }
        else {
            System.out.println("You cannot add more than 20 invoices without canceling.");
        }
    }
    
    public void addAuthorized(int Authorized) {
        if (Authorized <= 10) {
            System.out.println("Available space");  
        } 
        else {
            System.out.println("You cannot add more than 10 associates");
            
        }
        
     }
    public void FundsAvailable(int funds){
         if(funds <= 50000){
             System.out.println("Partner successfully added");
         }
         else {
             System.out.println("You do not have funds available");
         }
     }
    public void DeleteAuthorized(int permiso){
        if(permiso == 1){
            System.out.println("The invoice must be paid first");
        }
    
        else if (permiso == 2){
            System.out.println("Successfully removed");
        }  
    }
    public void RemovePartner(int remover){
        if(remover == 66954){
            System.out.println("Successfully removed");
        }
        
        else {
            System.out.println("Not found in the club database");
        }
        
    }
}
    

