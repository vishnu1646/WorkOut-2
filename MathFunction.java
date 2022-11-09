

public class MathFunction {
    int multiply(int a ,int b){
        return a*b;
    }
    float multiply(float a, float b){
        return a*b;
    }
    float multiply(float a ,int b){
        return a*b;
    }
    public static void main(String[] args){
        MathFunction m = new MathFunction();
        System.out.println(m.multiply(3,4));
        System.out.println(m.multiply(1.2f,1.5f));
        System.out.println(m.multiply(1.5f,7));
    }

}

