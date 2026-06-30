import java.util.Scanner;
public class Main02{
public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    System.out.println("1. Type customer");
    System.out.println("2. Points");
    System.out.print("Enter option: ");
    int select = stdIn.nextInt();
    while (select == 1 || select == 2) {
    if (select == 1) {
        //input
        String id,name,tp;
        double am,net_ds=0,ds,pay;
        System.out.print("ID = ");
        id = stdIn.next();
        System.out.print("Name = ");
        name = stdIn.next();
        System.out.print("Amount = ");
        am = stdIn.nextDouble();
        System.out.print("Type = ");
        tp = stdIn.next();
        //Type
        switch (tp) {
            case "A":
                ds = am * 0.0625; break;
            case "B":
                ds = am * 0.0445; break;
            case "C":
                ds = am * 0.0185; break;
            default:
                ds = 0; break;
        }
        //compute
        pay = am- ds;
        //display
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Amount: " + am);
        System.out.println("Discount: " + ds);
        System.out.println("Payment: " + pay);
        
        } else if (select == 2) {
        //input
        String id,name;
        double am,pn,ds=0,pay,count;
        System.out.print("ID = ");
        id = stdIn.next();
        System.out.print("Name = ");
        name = stdIn.next();
        System.out.print("Amount = ");
        am = stdIn.nextDouble();
        System.out.print("Point = ");
        pn = stdIn.nextDouble();
        //if
        if (pn>=100) {
            ds = (pn/100)*5; }
        while(ds>=am){
            System.out.print("Point = ");
            pn = stdIn.nextDouble();
            if (pn>=100) {
            ds = (pn/100)*5; 
            } else {
                ds =0;
            }
        }
        pay = am-ds;
        //display
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Amount: " + am);
        System.out.println("Discount: " + ds);
        System.out.println("Payment: " + pay);
        }
        //update value
        System.out.println("1. Type customer");
        System.out.println("2. Points");
        System.out.print("Enter option: ");
        select = stdIn.nextInt();
        }
    
    }
    }