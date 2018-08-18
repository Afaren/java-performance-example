public class SomeObject {
    private int property;


    public SomeObject(int property) {
        this.property = property;
    }

    static SomeObject getInstance(int property) {
        return new SomeObject(property);
    }
}
