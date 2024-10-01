public class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(3, 3);
        //Matrix m2 = new Matrix(2, 2);
        m1.addElement(0, 0, new ComplexNumber(9, 0));
        m1.addElement(0, 1, new ComplexNumber(1, -3));
        m1.addElement(0, 2, new ComplexNumber(4, 3));
        m1.addElement(1, 0, new ComplexNumber(2, 2));
        m1.addElement(1, 1, new ComplexNumber(7, 8));
        m1.addElement(1, 2, new ComplexNumber(3, 0));
        m1.addElement(2, 0, new ComplexNumber(0, 5));
        m1.addElement(2, 1, new ComplexNumber(2, -5));
        Matrix.print(m1);
        //Matrix.print(m2);
        //Matrix.print(m1.simplify(1, 1));
    }
}
