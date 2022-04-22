package FacadeShablon;

public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        System.out.println(binOps.sum("1111000", "101000"));
        System.out.println(binOps.mult("10", "1010"));
    }
}
