public class Euro {

    private int nummer;

    public Euro(int i) {
        this.nummer = i;
    }

    public int multiply(int i) {
        return this.nummer * 5;
    }

    public int multiplyAmountWith(int i, int i1) {
        return i * (this.nummer * i1);
    }
}
