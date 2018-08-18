public class Performance {
    public static void main(String[] args) {
        while(true) {
            SomeObject someObject = SomeObject.getInstance(1);
            System.out.println(someObject);
        }
    }

}
