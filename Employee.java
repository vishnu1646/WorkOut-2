import java.util.Scanner;

public class Employee {
    String name, result;
    int empId, a1, a2, a3;

    void details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        name = sc.next();
        System.out.println("Enter the EmpID : ");
        empId = sc.nextInt();
        System.out.println("Enter 3 assessment scores : ");
        a1 = sc.nextInt();
        a2 = sc.nextInt();
        a3 = sc.nextInt();
    }

    void setDetails(){
        if (a1>75&&a2>75&&a3>75){
            result = "Promoted";
        }
        else {
            result = "Demoted";
        }
        System.out.println("Result : "+result);
        int total = a1+a2+a3;
        float f = ((total*100)/300);
        System.out.println("The total is : "+total);
        System.out.println("The percentage is : "+f);
    }
    public static void main(String[] args){
        Employee e = new Employee();
        e.details();
        e.setDetails();
    }
}

