package Lab4;

import java.util.*;

public class Lab4 { 
    Scanner sc = new Scanner(System.in);
    public static int AccNo;
    public static int Balance;
    public static String Name;


    public static void customer_detail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.println("Enter the Account Holder's Name: ");
        Name = sc.nextLine();
        System.out.println("-----------------------------------");
        System.out.println("Enter valid Account Number");
        AccNo = sc.nextInt();           
        System.out.println("----------------------------------");
        System.out.println("The bank balance is: ");
        Balance = sc.nextInt();

    }

    public static int deposit_money (int amount) {
        Balance += amount;
        System.out.println("The updated  balance amount is: " + Balance );
        return Balance;
    }
    

    public static int withdraw_money(int amount) {
        // Balance -= amount;
        // System.out.println("The updated balance amount is: " + Balance );
        // return Balance;
        int a = Balance - amount;
        if (a>=0) {
            Balance -= amount;
            System.out.println("The updated balance amount is: " + Balance );
            

        } else {
            System.out.println("Insufficient balance.");}
            return Balance;
     }


     public static void print_transactions(int[][] transac,int count){
        for(int i = 0; i<=count-1 ; i++){
            if(transac[i][0] > 0){
                System.out.println("The amount deposited is: "+transac[i][0]);
                System.out.println("The balance amount  after deposited is: "+transac[i][1]);
            }
            else{
                System.out.println("The amount withdrawed is: "+ transac[i][0]);
                System.out.println("The balance amount after withdrawed  is: "+transac[i][1]);
            }
        }
    }
    public static void print_summary() {
        System.out.println("The Name of the acc holder is: " + Name);
        System.out.println("The Account number is: " + AccNo);
        System.out.println("The Balance is: " + Balance);
    }
    public static void  main(String[] args) {
        customer_detail();
        Scanner sc = new Scanner(System.in);
        int amount, option, p;
        int count = 0;
        int[][] transactions = new int[1024][1024];

        
        do {
            System.out.println("---------Menu----------");
            System.out.println("1. Deposit Money: ");
            System.out.println("2. Debit Money: ");
            System.out.println("3. Print the transactions: ");
            System.out.println("4. Account Summary: ");
            System.out.println("Enter your choice: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter the amount you wish to deposit: ");
                    amount = sc.nextInt();
                    p=deposit_money(amount);
                    transactions[count][0] = amount;
                    transactions[count][1] = p;
                    count++;
                    break;
                case 2:
                    System.out.println("Enter the amount you wish to deposit: ");
                    amount = sc.nextInt();
                    p=withdraw_money(amount);
                    transactions[count][0] = amount;
                    transactions[count][1] = p;
                    count++;
                    break;
                case 3:
                    print_transactions(transactions, count);
                    break;
                case 4:
                    print_summary();
                    break;
                default:
                    System.out.println("Exit");    
             }
                
        } while(option <=4);
    }
}