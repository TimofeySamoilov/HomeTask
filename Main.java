public class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(4, 4);

        m1.addElement(0, 0, new ComplexNumber(2, 0));
        m1.addElement(0, 1, new ComplexNumber(-6, 0));
        m1.addElement(0, 2, new ComplexNumber(5, 0));
        m1.addElement(0, 3, new ComplexNumber(8, 0));
        m1.addElement(1, 0, new ComplexNumber(-1, 0));
        m1.addElement(1, 1, new ComplexNumber(0, 0));
        m1.addElement(1, 2, new ComplexNumber(-3, 0));
        m1.addElement(1, 3, new ComplexNumber(10, 0));
        m1.addElement(2, 0, new ComplexNumber(67, 0));
        m1.addElement(2, 1, new ComplexNumber(1, 0));
        m1.addElement(2, 2, new ComplexNumber(7, 0));
        m1.addElement(2, 3, new ComplexNumber(3, 0));
        m1.addElement(3, 0, new ComplexNumber(0, 0));
        m1.addElement(3, 1, new ComplexNumber(-5, 0));
        m1.addElement(3, 2, new ComplexNumber(66, 0));
        m1.addElement(3, 3, new ComplexNumber(30, 0));
        Matrix.print(m1);
        System.out.println(m1.det().getX());
        Matrix.print(m1.reverse());

        Matrix matr1 = new Matrix(2, 3);
        Matrix matr2 = new Matrix(3, 2);

        matr1.addElement(0, 0, new ComplexNumber(1, 0));
        matr1.addElement(0, 1, new ComplexNumber(3, 0));
        matr1.addElement(0, 2, new ComplexNumber(7, 0));
        matr1.addElement(1, 0, new ComplexNumber(-6, 0));
        matr1.addElement(1, 1, new ComplexNumber(10, 0));
        matr1.addElement(1, 2, new ComplexNumber(2, 0));


        matr2.addElement(0, 0, new ComplexNumber(6, 0));
        matr2.addElement(0, 1, new ComplexNumber(-3, 0));
        matr2.addElement(1, 0, new ComplexNumber(6, 0));
        matr2.addElement(1, 1, new ComplexNumber(5, 0));
        matr2.addElement(2, 0, new ComplexNumber(9, 0));
        matr2.addElement(2, 1, new ComplexNumber(3, 0));

        System.out.println(" * ");
        Matrix.print(matr1);
        System.out.println(" * ");
        Matrix.print(matr2);
        System.out.println(" = ");
        Matrix.print(matr1.multiplication(matr2));

        Matrix n1 = new Matrix(2, 2);
        Matrix n2 = new Matrix(2, 2);
        n1.addElement(0, 0, new ComplexNumber(1, 0));
        n1.addElement(0, 1, new ComplexNumber(2, 0));
        n1.addElement(1, 0, new ComplexNumber(2, 0));
        n1.addElement(1, 1, new ComplexNumber(3, 0));
        n2.addElement(0, 0, new ComplexNumber(5, 0));
        n2.addElement(0, 1, new ComplexNumber(2, 0));
        n2.addElement(1, 0, new ComplexNumber(4, 0));
        n2.addElement(1, 1, new ComplexNumber(2, 0));
        System.out.println("-----");
        Matrix.print(n1);
        System.out.println("-----");
        Matrix.print(n2);
        System.out.println("-----");
        //Matrix.print(n1.multiplication(n2));
        Matrix.print(n1.divide(n2));

    }
}
