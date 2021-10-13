public class Main {

    public static void main(String[] args) {
	byte byteVariable = 50;
    short shortVariable = 100;
    int intVariable = 1;
    long longVariable = 50000L + (10 * (byteVariable + shortVariable + intVariable));
        System.out.println(longVariable);
    }
}
