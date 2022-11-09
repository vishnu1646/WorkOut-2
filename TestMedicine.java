class Medicine{
    void displayLabel(){
        System.out.println("Name : KIMS ");
        System.out.println("Address : Trivandrum");
    }
}
class Tablet extends Medicine{
    @Override
    void displayLabel() {
       System.out.println("Store in a cool dry place");
    }
}
class Syrup extends Medicine {
    @Override
    void displayLabel() {
        System.out.println("Prescribed by doctor");
    }
}
class Ointment extends Medicine {
    @Override
    void displayLabel() {
        System.out.println("For external use only");
    }
}



public class TestMedicine {
    public static void main(String[] args){
        Medicine m1 = new Medicine();
        Medicine m2 =new Medicine();
        Medicine m3 =new Medicine();
        double i = Math.random()*4;
        int j = (int)i;
        System.out.println(j);
    switch (j){
        case 1:
            Medicine t = new Tablet();
            System.out.println("Tablet");
            m1.displayLabel();
            t.displayLabel();
            break;
        case 2:
            Medicine s = new Syrup();
            System.out.println("Syrup");
            m1.displayLabel();
            s.displayLabel();
            break;
        case 3:
            Medicine o = new Ointment();
            System.out.println("Ointment");
            m1.displayLabel();
            o.displayLabel();
            break;
        default:System.out.println("Invalid");
    }
    }
}
