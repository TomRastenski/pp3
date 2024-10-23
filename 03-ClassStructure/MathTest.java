public class MathTest {

    static int larger(int a , int b){
        return Math.max(a, b);
    }

    static double pie(){
        return Math.PI;
    }

    static double abs(double a){
        return Math.abs(a);

    }

    static double sqrt(double a, double b){
        double c;
        c= a/b;
        return Math.sqrt(c);
    }

    static double rand(){
        return Math.random();
    }

    static int rando(){
        return (int)(Math.random()*10);
    }
    static double sin(){
        double a=Math.toRadians(90);
        return Math.sin(a);
    }    

    public static void main(String[] args) {
        System.out.println(larger(34,39));
        System.out.println(pie());
        System.out.println(abs(-17));
        System.out.println(sqrt(9, 2));
        System.out.println(rand());
        System.out.println(rando());
        System.out.println(sin());
    }
}
