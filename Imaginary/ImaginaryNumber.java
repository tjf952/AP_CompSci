public class ImaginaryNumber extends ComplexNumber
{
    double imaginary;
    public ImaginaryNumber(double num){
        super(0, num);
        imaginary = num;
    }
    public String toString(){
        return imaginary + "i";
    }
}
