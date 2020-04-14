public class Main {
    public static void main(String[] args) {
        SmartInt si = new SmartInt(307);
        System.out.println("Even? " + si.isEven());
        System.out.println("Odd? " + si.isOdd());
        System.out.println("Prime? " + si.isPrime());
    }
}
