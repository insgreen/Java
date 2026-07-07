import java.util.Scanner;
public class Employee {
    //attribute
    public String id, name, position,group;
    public double salary, total, bonus;
    //method1
    public void bonus() {
        //compute
        if (total < 500000) {
            bonus = total*0.03;
        } else if (total <= 1000000) {
            bonus = total*0.05;
        } else if (total <= 1500000) {
            bonus = total*0.07;
        } else {
            bonus = total*0.09;
        }
        //display
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Bonus: " + bonus);
    }
    //method2
    public void salary() {
        double slr_rate = 0, salary_new ;
        //compute
        switch(group) {
        case "A":
            slr_rate = salary*0.045; break;
        case "B":
            slr_rate = salary*0.0325; break;
        case "C":
            slr_rate = salary*0.015; break;
        default:
            slr_rate = 0; break;
        }
        salary_new = salary+slr_rate;
        //display
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary (New): " + salary_new);
        System.out.println("Increased Salary: " + slr_rate);
    }
    //method3
    public void pvd() {
        //compute
        double pvd = salary*0.08;
        double netSalary = salary - pvd;
        //display
        System.out.println("Salary: " + salary);
        System.out.println("Provident: " + pvd);
        System.out.println("Net Salary: " + netSalary);
    }
    //main
     public static void main(String[] args) {
         Employee myData = new Employee();
         //input
         Scanner stdIn = new Scanner(System.in);
         System.out.print("ID = ");
         myData.id = stdIn.next();
         System.out.print("Name = ");
         myData.name = stdIn.next();
         System.out.print("Position = ");
         myData.position = stdIn.next();
         System.out.print("Salary = ");
         myData.salary = stdIn.nextDouble();
         System.out.print("Total = ");
         myData.total = stdIn.nextDouble();
         System.out.print("Group = ");
         myData.group = stdIn.next();
         
         //option
         System.out.println("1. Bonus");
         System.out.println("2. Salary");
         System.out.println("3. Provident");
         System.out.print("option = ");
         int select = stdIn.nextInt();
        if (select == 1) {
            myData.bonus();
        } else if (select == 2) {
            myData.salary();
        } else if (select == 3) {
            myData.pvd();
        }
}
}