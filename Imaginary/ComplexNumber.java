public class ComplexNumber
{
    private double real;
    private double imaginary;
    public ComplexNumber(double r, double i){
        real = r;
        imaginary = i;
    }
    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }
    public ComplexNumber add(ComplexNumber num){ // num(real, imaginary)
        return new ComplexNumber(real + num.real, imaginary + num.imaginary);
    }
    public ComplexNumber multiply(ComplexNumber num){
        return new ComplexNumber((real*num.real)-(imaginary*num.imaginary),
            (real*num.imaginary) + (imaginary*num.real));
    }
    public String toString(){
        if(real != 0){
            if(imaginary < 0){
                return "(" + real + " - " + -1*imaginary + "i)";
            } else if(imaginary > 0){
                return "(" + real + " + " + imaginary + "i)";
            } 
        } else if(real == 0){
            if(imaginary < 0){
                return "" + "-" + -1*imaginary + "i";
            } else if(imaginary > 0){
                return "" + imaginary + "i";
            } 
        }
        return "" + real;
    }
}
