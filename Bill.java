package com.mycompany.socialclubs;

import java.util.List;

public class Bill {
    private String InvoiceConcept;
    private int InvoiceValue;
    private String Name;
    private double FundsAvailable;
    private List<Bill> bills;

    public Bill(String InvoiceConcept, int InvoiceValue, String Name, double FundsAvailable) {
        this.InvoiceConcept = InvoiceConcept;
        this.InvoiceValue = InvoiceValue;
        this.Name = Name;
        this.FundsAvailable = FundsAvailable;
    }
    
    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    public String getInvoiceConcept() {
        return InvoiceConcept;
    }

    public void setInvoiceConcept(String InvoiceConcept) {
        this.InvoiceConcept = InvoiceConcept;
    }

    public int getInvoiceValue() {
        return InvoiceValue;
    }

    public void setInvoiceValue(int InvoiceValue) {
        this.InvoiceValue = InvoiceValue;
    }

    public String getName() {
        return Name;
    }

    public void setName(String PartnerName) {
        this.Name = PartnerName;
    }

    public double getFundsAvailable() {
        return FundsAvailable;
    }

    public void setFundsAvailable(double FundsAvailable) {
        this.FundsAvailable = FundsAvailable;
    }

    
    public void GenerateConsumption(double consumption, double founds){
        if(consumption < founds){
            System.out.println("Your invoice has been paid and removed \n Your current fund is: " + (founds - consumption ));
        }
        else {
            System.out.println("You do not have enough funds to make the consumption");  
        }
        
    }
  

        }
