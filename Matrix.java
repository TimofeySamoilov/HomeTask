public class Matrix {
    private ComplexNumber[][] matrix;
    private int row, column;
    public Matrix(int row, int column) {
        this.matrix = new ComplexNumber[row][column];
        this.row = row;
        this.column = column;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < column; ++j) {
                this.matrix[i][j] = new ComplexNumber(0, 0);
            }
        }
    }
    public int getRow() {
        return this.row;
    }
    public int getColumn() {
        return this.column;
    }
    public ComplexNumber element(int i, int j) {
        return this.matrix[i][j];
    }
    static public void print(Matrix m) {
        for (int i = 0; i < m.getRow(); ++i) {
            for (int j = 0; j < m.getColumn(); ++j) {
                if (j == m.getColumn() - 1) {
                    System.out.println("(" + m.element(i, j).getX() + ", " + m.element(i, j).getY() + ")");
                }
                else {
                    System.out.print("(" + m.element(i, j).getX() + ", " + m.element(i, j).getY() + ") ");
                }
            }
        }
    }
    public void addElement(int i, int j, ComplexNumber num) {
        //добавление элемента по индексам i, j
        this.matrix[i][j] = num;
    }
    public Matrix sum(Matrix another) {
        //Суммирование матриц, размер должен быть одинаковый
        if (this.row == another.getRow() && this.column == another.getColumn()) {
            Matrix result = new Matrix(this.row, this.column);
            for (int i = 0; i < this.row; ++i) {
                for (int j = 0; j < this.column; ++j) {
                    result.addElement(i, j, this.matrix[i][j].sum(another.element(i, j)));
                }
            }
            return result;
        }
        System.out.println("Sizes of matrixes are not the same!");
        return this;
    }
    public Matrix transposition() {
        //транспонирование матрицы
        Matrix result = new Matrix(this.column, this.row);
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < column; ++j) {
                result.addElement(j, i, this.element(i,j));
            }
        }
        return result;
    }
    public double determinant() {
        //поиск определителя
        if (this.row == this.column) {

        }
        return 0;
    }
    private Matrix det() {
        Matrix result = new Matrix(1, 1);
        if (this.row == 3) {
            result.addElement(0, 0, ((this.matrix[0][0].multiplication(this.matrix[1][1])).multiplication(this.matrix[2][2])).sum((this.matrix[0][0].multiplication(this.matrix[1][1])).multiplication(this.matrix[2][2])));
        }
    }
    private Matrix simplify(int i, int j) {
        //нужно для рекурсивного подсчета определителя матрицы, с помощью минора.
        Matrix result = new Matrix(this.row-1, this.column-1);
        for (int a = 0; a < this.row; ++a) {
            for (int b = 0; b < this.column; ++b) {
                if (a < i && b < j) {
                    result.addElement(a, b, this.element(a, b));
                }
                else if (a > i && b > j) {
                    result.addElement(a-1, b-1, this.element(a, b));
                }
                else if (a > i && b < j) {
                    result.addElement(a-1, b, this.element(a, b));
                }
                else if (a < i && b > j) {
                    result.addElement(a, b-1, this.element(a, b));
                }
            }
        }
        return result;
    }
    /*public Matrix multiplication(Matrix another) {
        if (this.row == another.column) {
            Matrix result = new Matrix(this.row, another.column);
            int point = 0;
            for (int i = 0; i < this.row; ++i) {
                ComplexNumber save = new ComplexNumber(0,0);
                for (int j = 0; j < this.column; ++j) {
                    save.sum(this.element(i,j).multiplication(another.element(j, i)));
                }
                result.addElement((int)(point / this.row), point % another.column, save);
                ++point;
            }
            return result;
        }
        System.out.println("this matrix cant be multiplied");
        return this;
    }*/
}
