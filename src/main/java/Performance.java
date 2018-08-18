public class Performance {
    public static void main(String[] args) {
        while (true) {
            SomeObject someObject = SomeObjectFactory.getInstance(1);
            System.out.println(someObject);
        }
    }

}
