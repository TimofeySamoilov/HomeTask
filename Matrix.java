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
}
