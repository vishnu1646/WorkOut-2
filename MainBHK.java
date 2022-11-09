import java.util.Scanner;

public class MainBHK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TwoBHK t1 = new TwoBHK(10,20,5000,20);
        TwoBHK t2 = new TwoBHK(20,30,6000,30);
        TwoBHK t3 = new TwoBHK(30,40,7000,40);
        t1.show();
        t2.show();
        t3.show();
    }
}

