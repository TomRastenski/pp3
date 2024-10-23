public class SurfaceArea{
    static float rectangle(float a, float b){
        return a*b;   
     }


     static float circle(float r) {
        return (float) (Math.PI * Math.pow(r, 2));
    }

     static float triangle(float b, float h){
        return (b*h)/2;
     }

     public static void main(String[] args) {
        System.out.println(rectangle(4, 5));
        System.out.println(3);
        System.out.println(triangle(4, 5));
     }
    
}

