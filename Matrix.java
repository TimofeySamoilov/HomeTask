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
        System.out.println("Sizes of matrices are not the same!");
        return this;
    }
    public Matrix subtract(Matrix another) {
        //Суммирование матриц, размер должен быть одинаковый
        if (this.row == another.getRow() && this.column == another.getColumn()) {
            Matrix result = new Matrix(this.row, this.column);
            for (int i = 0; i < this.row; ++i) {
                for (int j = 0; j < this.column; ++j) {
                    result.addElement(i, j, this.matrix[i][j].subtract(another.element(i, j)));
                }
            }
            return result;
        }
        System.out.println("Sizes of matrices are not the same!");
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
    public ComplexNumber det() {
        return this.determinant(1);
    }
    private ComplexNumber determinant(int a) {
        //рекурсивно считает определитель матрицы
        if (this.row == 1) {
            return this.element(0, 0);
        }
        if (this.row == 2) {
            return (this.element(0,0).multiplication(this.element(1,1)).subtract(this.element(0, 1).multiplication(this.element(1, 0)))).multiplication(new ComplexNumber(a, 0));
        }
        ComplexNumber result = new ComplexNumber(0, 0);
        for (int i = 0; i < this.column; ++i) {
            result = result.sum(this.element(0, i).multiplication(this.simplyfy(0, i).determinant(a)));
            a *= -1;
        }
        return result;
    }
    private Matrix simplyfy(int i, int j) {
        // эта функция нужна для подсчета минора матрицы ij элемента
        Matrix result = new Matrix(this.row-1, this.column-1);
        for (int a = 0; a < this.row; ++a) {
            for (int b = 0; b < this.column; ++b) {
                if (a < i && b < j) {
                    result.addElement(a, b, this.matrix[a][b]);
                }
                else if (a > i && b > j) {
                    result.addElement(a-1,b-1, this.matrix[a][b]);
                }
                else if (a > i && b < j) {
                    result.addElement(a-1, b, this.matrix[a][b]);
                }
                else if (a < i && b > j) {
                    result.addElement(a, b-1, this.matrix[a][b]);
                }
            }
        }
        return result;
    }
    public Matrix multiplication(Matrix another) {
        if (this.column == another.row) {
            Matrix result = new Matrix(this.row, another.column);
            for (int i = 0; i < this.row; ++i) {
                for (int j = 0; j < another.column; ++j) {
                    ComplexNumber save = new ComplexNumber(0, 0);
                    for (int k = 0; k < this.column; ++k) {
                        save = save.sum(this.element(i, k).multiplication(another.element(k, j)));
                    }

                    result.addElement(i, j, save);
                }
            }
            return result;
        }
        System.out.println("these matrices cant be multiplied");
        return this;
    }
    public Matrix reverse() {
        if ((this.row == this.column) && (this.det().getX() != 0 || this.det().getY() != 0)) {
            Matrix result = new Matrix(this.row, this.column);
            for (int i = 0; i < this.row; ++i) {
                for (int j = 0; j < this.column; ++j) {
                    result.addElement(i, j, (this.simplyfy(i, j).det()).divide(this.det()));
                }
            }
            for (int i = 0; i < this.row; ++i) {
                for (int j = 0; j < this.column; ++j) {
                    if (i + j % 2 == 1) {
                        result.addElement(i, j, result.element(i, j).multiplication(new ComplexNumber(-1, 0))); //.divide(this.det()));
                    }
                }
            }
            return result.transposition();
        }
        else {
            System.out.println("this matrix do not has reverse version");
        }
        return this;
    }
    public Matrix divide(Matrix another) {
        return this.multiplication(another.reverse());
    }
}
