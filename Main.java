public class Main {
    public static void main(String[] args) {
        ComplexNumber num = new ComplexNumber(3, 5);
        Matrix m = new Matrix(3, 3);
        Matrix.print(m);
        m.addElement(0, 1, num);
    }
}
