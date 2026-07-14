import java.util.Scanner;
public class Lab5 {
    //attribute
    public int number1, number2, number3,number4, number5;
    public double x, y, z;
    //method1
    public void getData() {
         Scanner stdIn = new Scanner(System.in);
         System.out.print("Number 1 = ");
         number1 = stdIn.nextInt();
         System.out.print("Number 2 = ");
         number2 = stdIn.nextInt();
         System.out.print("Number 3 = ");
         number3 = stdIn.nextInt();
         System.out.print("Number 4 = ");
         number4 = stdIn.nextInt();
         System.out.print("Number 5 = ");
         number5 = stdIn.nextInt();
         System.out.print("X = ");
         x = stdIn.nextDouble();
         System.out.print("Y = ");
         y = stdIn.nextDouble();
         System.out.print("Z = ");
         z = stdIn.nextDouble();
         System.out.print("Option: ");
         int select = stdIn.nextInt();
         
         if (select == 1) {
             int count = myTest(x, y, z);
            System.out.println("Count: " + count);
         } else if (select == 2) {
             int sum = myTest(number1, number2, number3, number4,  number5);
             System.out.println("Sum: " + sum);
         } else if (select == 3) {
             double max = myTest(x, y);
             System.out.println("Max: " + max);
         }
    }
    //method2  
    public int myTest(double x, double y, double z) {
        int count = 0;
        double avg = (x + y + z) / 3;
        if (x > avg) count++;
        if (y > avg) count++;
        if (z > avg) count++;
        return count;
    }
    //method3
     public int myTest(int number1,int number2, int number3, int number4, int number5) {
         int sum = 0;
         if (number1 % 3 == 0 || number1 % 5 == 0) sum += number1;
         if (number2 % 3 == 0 || number2 % 5 == 0) sum += number2;
         if (number3 % 3 == 0 || number3 % 5 == 0) sum += number3;
         if (number4 % 3 == 0 || number4 % 5 == 0) sum += number4;
         if (number5 % 3 == 0 || number5 % 5 == 0) sum += number5;
        return sum;
    }
    //method4
    public double myTest(double x, double y) {
        double max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        return max;
    }
    //main
    public static void main(String[] args) {
        Lab5 myObj = new Lab5();
        myObj.getData();
    }
}
      