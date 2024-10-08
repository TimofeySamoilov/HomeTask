public class ComplexNumber {
    private double x, y;
    public ComplexNumber() {
        this.x = 0;
        this.y = 0;
    }
    public ComplexNumber(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public ComplexNumber multiplication(ComplexNumber another) {
        //умножение комплексных чисел
        return new ComplexNumber(this.getX()*another.getX() - this.getY()*another.getY(), this.getX()*another.getY() + this.getY() * another.getX());
    }
    public ComplexNumber sum(ComplexNumber another) {
        //суммирование комплексных чисел
        return new ComplexNumber(this.getX() + another.getX(), this.getY() + another.getY());
    }
    public ComplexNumber subtract(ComplexNumber another) {
        //вычитание
        return new ComplexNumber(this.getX() - another.getX(), this.getY() - another.getY());
    }
    public ComplexNumber divide(ComplexNumber another) {
        //деление комплексных чисел
        if (another.getX() != 0 && another.getY() == 0) {
            //если нет мнимой части
            return new ComplexNumber(this.getX() / another.getX(), this.getY() / another.getX());
        }
        if (another.getY() != 0) {
            //если есть мнимая часть
            double a = this.x, b = this.y, c = another.getX(), d = another.getY();
            return new ComplexNumber((a*c+b*d)/(c*c+d*d), (b*c-a*d)/(c*c+d*d));
        }
        System.out.println("На 0 делить нельзя");
        return this;
    }
}
