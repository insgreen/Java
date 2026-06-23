import java.util.Scanner;
public class Main01 {
    public static void main(String[] args) {
        //variable
        int select;
        double qua;
        double price;
        double pay;

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter yout select = ");
        select = input.nextInt();
        if (select == 1) {
        System.out.print("Please enter your ID = ");
        String id = input.next();
        System.out.print("Please enter your Name = ");
        String name = input.next();
        System.out.print("Please enter Quality = ");
        qua = input.nextDouble();

            if (qua >= 1 && qua <= 20) {
                price = 2.35;
            } else if (qua >= 21 && qua <= 50) {
                price = 2.55;
            } else if (qua >= 51 && qua <= 100) {
                price = 3.45;
            } else if (qua >= 101 && qua <= 150) {
                price = 3.82;
            } else if (qua >= 151 && qua <= 350) {
                price = 4.15;
            } else {
                price = 4.65;
            }
        pay = qua*price;

        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Quantity = " + qua);
        System.out.println("Payment = " + pay);
        } else if (select == 2) {
            System.out.print("Please enter your Name = ");
            String name = input.next();
            System.out.print("Please enter Current meter = ");
            int cm = input.nextInt();
            System.out.print("Please enter Last meter = ");
            int lm = input.nextInt();

            qua = cm - lm;
            
            if (qua >= 0 && qua <= 10) {
                price = 8.5;
            } else if (qua >= 11 && qua <= 40) {
                price = 11.5;
            } else if (qua >= 41 && qua <= 80) {
                price = 12.5;
            } else if (qua >= 81 && qua <= 120) {
                price = 14.5;
            } else if (qua >= 121 && qua <= 160) {
                price = 16.5;
            } else {
                price = 19.5;
            }

            pay = qua*price;
        
        System.out.println("Name = " + name);
        System.out.println("Quantity = " + qua);
        System.out.println("Payment = " + pay);
        }
    }
}
