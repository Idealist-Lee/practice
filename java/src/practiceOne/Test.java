package practiceOne;

public class Test {
    static void added(int a, int b) {
        System.out.println(a+b);
    }
    void added(double c, double d) {
        System.out.println(c+d);
    }
    void added(int a,double c) {
        System.out.println(a+c);
    }
    void added(double c,int d) {
        System.out.println(c+d);
    }
    public static void main(String[] args) {

                int num1=32;
                double num2=6.66;
                int num3=1;
                Add add=new Add();
                System.out.println(add.add(num1,num2));
                System.out.println(add.add(num3,num2));
                added(num3,num1);

        }
}
