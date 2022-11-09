public class Garbage {
    static int c ;
    Garbage(){
        return;
    }
    public static void main(String[]args){
        Garbage g1,g2;
        g1= new Garbage();
        g2 = new Garbage();
        g1 = null;
        g2 = g1;
        System.gc();
        System.out.println(c);
    }
    protected void finalize(){
        System.out.println("GArbage Value : "+this);
        System.out.println(c);
    }
}
