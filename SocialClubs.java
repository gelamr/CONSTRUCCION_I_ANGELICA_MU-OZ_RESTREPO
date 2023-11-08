package com.mycompany.socialclubs;

import java.util.ArrayList;
import java.util.Scanner;

public class SocialClubs {

    public static void main(String[] args) {
        Scanner part = new Scanner (System.in);
        
        
        
        Club p = new Club("name", 0, "subscriptionType");
        Bill b = new Bill("InvoiceConcept", 0, "Name", 0);
        
        int cont = 0;
        while(cont <= 35){
        System.out.println("---WELCOME TO OUR SOCIAL CLUB---\n"); 
        
        System.out.println("--MAIN MENU--");
        System.out.println("[1] New partner");
        System.out.println("[2] Existing partner");
        System.out.println("[3] Delete partner");
        System.out.println("[4] Go out");
        System.out.print(" Select an option: ");
        int cont2 = part.nextInt();
        
        switch(cont2){
            case 1: 
                System.out.println("--ENTRY OF NEW USERS--\n");
                System.out.println("Enter your name: ");
                String Name = part.next();
    
                int document = 0;

                ArrayList<Integer> PartnerList = new ArrayList<>();
                PartnerList.add(66954);

                System.out.println("Enter document number: ");
                document = part.nextInt();

                while (PartnerList.contains(document)) {
                    System.out.println("The document is already registered. Please enter a different document number: ");
                    document = part.nextInt();
                }

                PartnerList.add(document);
                System.out.println("The document has been registered");
                
                System.out.println("Press one for regular subscription and two for VIP subscription");
                int Subscription = part.nextInt();
                
                if(Subscription == 1){
                    System.out.println("Enter the amount  : ");
                    int amount = part.nextInt();
                    p.RegularSubscription(amount);
                    break;   
                }
                else if (Subscription == 2){
                    System.out.println("Enter the amount: ");
                    int amountone = part.nextInt();
                    p.VIPSubscription(amountone);
                    break;
                }
                
            case 2:
                System.out.println("--ENTRY OF EXISTING MEMBERS--\n");
                System.out.println("Enter your name: ");
                String N = part.next();
                
                System.out.println("---welcome to the club" + N);
                System.out.println("--MENU--");
                System.out.println("[1] Member Information");
                System.out.println("[2} Consumption");
                System.out.println("Select an option: ");
                int optiontwo = part.nextInt();
                
                switch(optiontwo){
                    case 1:
                        System.out.println("\n--MENU--");
                        System.out.println("[1] Increase Funds ");
                        System.out.println("[2] Bills");
                        System.out.println("[3] Authorized persons");
                        System.out.print("Select an option: ");
                        int Option = part.nextInt();
                        
                        switch(Option){
                            case 1:
                                System.out.println("[1] Increase Regular Fund");
                                System.out.println("[2] Increase VIP Fund");
                                System.out.print("Select an option: ");
                                int Money = part.nextInt();
                                
                                switch(Money) {
                                    
                                    case 1:
                                        System.out.println("Enter the amount to increase funds: ");
                                        int founds = part.nextInt();
                                        p.IncreaseRegularFunds(founds);
                                        break;
                        
                                    case 2:
                                        System.out.println("Enter the amount to increase funds:");
                                        int found = part.nextInt();
                                        p.IncreaseVIPfunds(found);
                                        break;
                                }
                        
                            case 2:
                                System.out.println("--BILLING--");
                                System.out.println("[1] Add invoice");
                                System.out.println("[2] Pay bill");
                                System.out.print("Select an option: ");
                                int bill = part.nextInt();
                                
                                switch(bill){
                                    case 1: 
                                        System.out.println("Add name: ");
                                        String Na = part.next();
                                        
                                        System.out.println("Add invoice number to pay");
                                        int facture = part.nextInt();
                                        p.UnpaidInvoice(facture);
                                        
                                    case 2:
                                        System.out.println("Add name: ");
                                        String n = part.next();

                                        System.out.println("invoice number:");
                                        int billss = part.nextInt();
        
                                        System.out.println("Enter the invoice value: ");
                                        double invoicevalue = part.nextDouble();

                                        System.out.println("Enter the amount paid: ");
                                        double amountPaid = part.nextDouble();
                
                                        if (amountPaid >= invoicevalue) {
                                            System.out.println("Invoice paid correctly.");
                                        } 
                                        
                                        else {
                                            System.out.println("Insufficient funds to pay the bill.");
                                        }
                                        break;
                                }
                                
                            case 3:
                                System.out.println("--AUTHORIZED PERSONS--");
                                System.out.println("[1] Enter authorized person");
                                System.out.println("[2] Delete authorized people");
                                System.out.print("Select an option: ");
                                int optionone = part.nextInt();
                                
                                switch(optionone) {
                                    case 1: 
                                        System.out.println("Enter the name");
                                        String Nam = part.next();
                                        
                                        System.out.println("Enter the quota for the authorized person: ");
                                        int quota = part.nextInt();
                                        p.addAuthorized(quota);
                                
                                        if(quota <= 10){
                                            System.out.println("Enter fund: ");
                                            int fund = part.nextInt();
                                            p.FundsAvailable(fund);
                                        }
                                        
                                    case 2:
                                        System.out.println("Enter name ");
                                        String names = part.next();
                                
                                        System.out.println("Do you have pending invoices? press one for yes and two for no");
                                        int Authorize = part.nextInt();
                                        p.DeleteAuthorized(Authorize); 
                                        break;      
                                }
                            }
                
                    case 2:
                        System.out.println("--BILLS--");
                        System.out.println("Enter your name: ");
                        String Nams = part.next();
                        
                        System.out.println("Invoice concept");
                        String Concept = part.next();
                
                        System.out.println("Total to pay");
                        int Available = part.nextInt();
                
                        System.out.println("Enter your funds");
                        int worth = part.nextInt();
                        b.GenerateConsumption(Available, worth);
                }
            case 3:
                System.out.println("--DELETE PARTNER--");
                System.out.println("Enter your name: ");
                String remove = part.next();
                
                System.out.println("Enter document number: ");
                int removeone = part.nextInt();
                
                System.out.println("Successfully removed");
                int Authorize = part.nextInt();
                p.RemovePartner(Authorize); 
                break;
        
            case 4:
                System.out.println("Exiting the program...");
                break;
            default:
                System.out.println("Invalid option. Please enter a valid option.");
            }

            System.out.println();  
    
             while (cont2 != 4){
             part.close();
             }
        }
    }
}
    



    



