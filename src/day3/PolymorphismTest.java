package day3;

public class PolymorphismTest {
    public static void main(String[] args) {
        add(1.4,1.0);
        add(5,4);
        add(2.3f, 2.5f);

    }
    public static void add(int a, int b){
        int temp= a+b;
        System.out.println(temp);
    }
    public static void add(double a, double b){
        double temp=a+b;
        System.out.println(temp);
    }
    public static void add(float a, float b){
        float temp=a+b;
        System.out.println(temp);
    }
}
