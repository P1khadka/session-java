package day2;

public class Assignment1 {
    public static void main(String[] args) {
        int a = 2, b = 3;
        int result = addition(a, b);
        System.out.println("a+b: "+result);
        int result2 = substraction(a, b);
        System.out.println("a-b:"+result2);
        int result4 = multiplication(a, b);
        System.out.println("a*b:"+result4);
        int result6 = division(a, b);
        System.out.println("a/b: "+result6);

        int c = 4, d = 5;
        int result1 = addition(c, d);
        System.out.println("c+b: "+result1);
        int result3 = substraction(c, d);
        System.out.println("c-b: "+result3);
        int result5 = multiplication(c, d);
        System.out.println("c*b: "+result5);
        int result7 = division(c, d);
        System.out.println("c/b : "+result7);


    }

    public static int addition(int x, int y) {
        int temp = x + y;
        return temp;
    }

    public static int substraction(int x, int y) {
        int temp1 = x - y;
        return temp1;
    }

    public static int multiplication(int x, int y) {
        int temp2 = x * y;
        return temp2;
    }

    public static int division(int x, int y) {
        int temp3 = x / y;
        return temp3;
    }
}