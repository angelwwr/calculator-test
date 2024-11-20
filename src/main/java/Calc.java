public class Calc {

    public double add(double n1, double n2) {
        return n1 + n2;
    }

    public double sub(double n1, double n2) {
        return n1 - n2;
    }

    public double mul(double n1, double n2) {
        return n1 * n2;
    }

    public double div(double n1, double n2) {
        if (n2 == 0) {
            throw new RuntimeException("Can't divide by zero");
        }
        return n1 / n2;
    }

}
