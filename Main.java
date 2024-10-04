public class Main {
    public static void main(String[] args) {
        System.out.println("Сложение и вычитание матриц:");
        Matrix m1 = new Matrix(3, 3);
        Matrix m2 = new Matrix(3, 3);
        //заполнение матриц
        m1.addElement(0, 0, new ComplexNumber(3, 2));
        m1.addElement(0, 1, new ComplexNumber(-2, 10));
        m1.addElement(0, 2, new ComplexNumber(4, 4));
        m1.addElement(1, 0, new ComplexNumber(1, 0));
        m1.addElement(1, 1, new ComplexNumber(-2, 2));
        m1.addElement(1, 2, new ComplexNumber(8, -3));
        m1.addElement(2, 0, new ComplexNumber(0, 0));
        m1.addElement(2, 1, new ComplexNumber(1, 0));
        m1.addElement(2, 2, new ComplexNumber(66, 2));
        m2.addElement(0, 0, new ComplexNumber(10, 0));
        m2.addElement(0, 1, new ComplexNumber(0, 0));
        m2.addElement(0, 2, new ComplexNumber(-4, 90));
        m2.addElement(1, 0, new ComplexNumber(0, 0));
        m2.addElement(1, 1, new ComplexNumber(12, 17.5d));
        m2.addElement(1, 2, new ComplexNumber(8, 67));
        m2.addElement(2, 0, new ComplexNumber(9.2, 0));
        m2.addElement(2, 1, new ComplexNumber(12, 1));
        m2.addElement(2, 2, new ComplexNumber(63, 0));
        System.out.println("------------------------------------------------------");
        Matrix.print(m1);
        System.out.println("    +    ");
        Matrix.print(m2);
        System.out.println("    =    ");
        Matrix.print(m1.sum(m2));
        System.out.println("------------------------------------------------------");
        Matrix.print(m1);
        System.out.println("    -    ");
        Matrix.print(m2);
        System.out.println("    =    ");
        Matrix.print(m1.subtract(m2));
        System.out.println("------------------------------------------------------");
        Matrix m = new Matrix(5, 5);
        //заполнение матрицы
        m.addElement(0, 0, new ComplexNumber(2, 2));
        m.addElement(0, 1, new ComplexNumber(-2.8, 0));
        m.addElement(0, 2, new ComplexNumber(1.5, 2));
        m.addElement(0, 3, new ComplexNumber(-3.2, 0));
        m.addElement(0, 4, new ComplexNumber(3.6, 0));
        m.addElement(1, 0, new ComplexNumber(-2.8, 0));
        m.addElement(1, 1, new ComplexNumber(7, 0));
        m.addElement(1, 2, new ComplexNumber(3.56, -9));
        m.addElement(1, 3, new ComplexNumber(-12, 0));
        m.addElement(1, 4, new ComplexNumber(2.2, 5));
        m.addElement(2, 0, new ComplexNumber(2, 0));
        m.addElement(2, 1, new ComplexNumber(-18, 0));
        m.addElement(2, 2, new ComplexNumber(3, 0));
        m.addElement(2, 3, new ComplexNumber(-4, 0));
        m.addElement(2, 4, new ComplexNumber(1.39, 5));
        m.addElement(3, 0, new ComplexNumber(1.7, 4));
        m.addElement(3, 1, new ComplexNumber(-8, 0));
        m.addElement(3, 2, new ComplexNumber(-3, 0));
        m.addElement(3, 3, new ComplexNumber(6, 0));
        m.addElement(3, 4, new ComplexNumber(-1.97, -1));
        m.addElement(4, 0, new ComplexNumber(2.6, 0));
        m.addElement(4, 1, new ComplexNumber(-2.7, 90));
        m.addElement(4, 2, new ComplexNumber(-7, 0));
        m.addElement(4, 3, new ComplexNumber(4, 0));
        m.addElement(4, 4, new ComplexNumber(1, 0));
        Matrix.print(m);
        System.out.println("DETERMINANT: " + m.det().getX() + " + " + m.det().getY() + "i");
        System.out.println("------------------------------------------------------");
        Matrix a = new Matrix(2, 3);
        Matrix b = new Matrix(3, 2);
        a.addElement(0, 0, new ComplexNumber(9, 3));
        a.addElement(0, 1, new ComplexNumber(1, 2));
        a.addElement(0, 2, new ComplexNumber(-5, 7));
        a.addElement(1, 0, new ComplexNumber(0, 0));
        a.addElement(1, 1, new ComplexNumber(6, -4.5));
        a.addElement(1, 2, new ComplexNumber(0, 2));
        b.addElement(0, 0, new ComplexNumber(5, -6));
        b.addElement(0, 1, new ComplexNumber(0, 0));
        b.addElement(1, 0, new ComplexNumber(5, -2));
        b.addElement(1, 1, new ComplexNumber(1, 7));
        b.addElement(2, 0, new ComplexNumber(4, -2));
        b.addElement(2, 1, new ComplexNumber(1, 0));
        Matrix.print(a);
        System.out.println("    *    ");
        Matrix.print(b);
        System.out.println("    =    ");
        Matrix.print(a.multiplication(b));
        System.out.println("------------------------------------------------------");
        Matrix.print(m1);
        System.out.println("    /    ");
        Matrix.print(m2);
        System.out.println("    =    ");
        Matrix.print(m1.divide(m2));
        System.out.println("------------------------------------------------------");
    }
}
