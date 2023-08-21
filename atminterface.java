
import java.util.*;


class ATM{
    float Balance;
    int pin=5678;

    public void checkpin(){
        System.out.println("Enter your pin:");
        Scanner sc=new Scanner(System.in);
        int enteredpin=sc.nextInt();
        if (enteredpin==pin){
            menu();
        }
        else {
            System.out.println("Enter a valid pin");
        }


    }

    public void menu(){
        System.out.println("Enter your choice");
        System.out.println("1. Check A/c Balance");
        System.out.println("2. cash withdraw");
        System.out.println("3.deposit cash");
        System.out.println("4. Exit");

        Scanner sc= new Scanner(System.in);
        int opt=sc.nextInt();

        if(opt == 1){
            checkbalance();
        }
        else if (opt == 2){
            cashwithdraw();
        }
        else if (opt == 3){
            depositMoney();
        }
        else if (opt == 4){
            return;
        }
        else{
            System.out.println("Enter a valid chooice");
        }

    }
    public void checkbalance(){
        System.out.println("Balance: " +Balance);
        menu();
    }
    public void cashwithdraw(){
        System.out.println("Enter amount to withdraw:  ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount>Balance){
            System.out.println("Insufficient balance");
        }
        else{
            Balance = Balance-amount;
            System.out.println("Money Withdraw successful");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter the amount");
        Scanner sc = new Scanner(System.in);
        float amount= sc.nextFloat();
        Balance = Balance+amount;
        System.out.println("Money deposit successfully");
        menu();

    }


}



public class atminterface {
    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkpin();


}
}