public class Son extends Father {
    public Son() {
        super(1);
        System.out.println("Son one");
    }
    public Son(int a) {
//        super(1);
        System.out.println("Son two");
    }

    @Override
    public void set() {
        System.out.println("六百六十六");
    }
}
