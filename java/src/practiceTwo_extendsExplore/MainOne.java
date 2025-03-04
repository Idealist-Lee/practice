package practiceTwo_extendsExplore;

public class MainOne {
    public static void main(String[] args) {
        Father father = new Father();
        Son son = new Son();
        Out out = new Out();
        out.out();
        out.setfather(son);
        out.out();

    }
}
