import java.util.Scanner;

public class Swap {
    int a,b;
    void callByValue(int a,int b){
        int c;
        System.out.println("Before Swapping : "+a+ "  "+b);
        c = a;
        a= b;
        b= c;
        System.out.println("After Swapping : "+a+"  "+b);
    }
    void callByRef(Swap s){
        int a,b,c;
        System.out.println("Before Swapping: "+s.a+ "  "+s.b);
        c = s.a;
        s.a = s.b;
        s.b= c;
        System.out.println("After Swapping : "+s.a+" "+s.b);
    }

    public static void main(String[] args){
        Swap s = new Swap();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        s.callByValue(sc.nextInt(),sc.nextInt());
        System.out.println("Enter two Numbers : ");
        s.a=sc.nextInt();
        s.b=sc.nextInt();
        s.callByRef(s);
    }
}

