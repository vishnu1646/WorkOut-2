import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details for Full time Faculty : \nID : ");
        int fac = sc.nextInt();
        System.out.println(" Salary : ");
        double sa = sc.nextDouble();
        System.out.println("Allowance : ");
        double allo =sc.nextDouble();

        FulltimeFaculty f1 = new FulltimeFaculty(fac);
        f1.input(sa,allo);
        System.out.println("Enter the Details for part time Faculty : \nfacultyid : ");
        fac = sc.nextInt();
        System.out.println(" Hours : ");
        sa = sc.nextDouble();
        System.out.println("Rate : ");
        allo = sc.nextDouble();
        ParttimeFaculty p1 = new ParttimeFaculty(fac);
        p1.input(sa,allo);
        f1.printSalary();
        p1.printSalary();
    }
}

