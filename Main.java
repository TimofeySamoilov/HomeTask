public class Main {
    public static void main(String[] args) {
        ComplexNumber num = new ComplexNumber(3, 5);
        ComplexNumber num2 = new ComplexNumber(1, -2);
        Matrix m = new Matrix(3, 3);
        Matrix n = new Matrix(3, 3);
        m.addElement(0, 1, num);
        n.addElement(0, 1, num2);
        Matrix neww = m.sum(n);
        neww.addElement(2, 1, new ComplexNumber(6, 10));
        neww.addElement(1, 1, new ComplexNumber(3, 1));
        Matrix.print(neww);
        Matrix.print(neww.transposition());
    }
}
