public class A {
    public static void main(String[] args) {
        DoSomething d1 = DoSomething.set(3, 4);
        System.out.println(d1.x + " " + d1.y);
    }
}

class DoSomething {
    int x, y;

    public static DoSomething set(int x1, int y1) {
        DoSomething k1 = new DoSomething();
        k1.x = x1;
        k1.y = y1;
        return k1;
    }
}