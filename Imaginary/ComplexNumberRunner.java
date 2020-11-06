public class ComplexNumberRunner
{
    public static void main(String [] args) {
        RealNumber[]x = new RealNumber[4];

        x[0] = new RealNumber (4.5);
        x[1] = new RealNumber (5);
        x[2] = new RealNumber (0);
        x[3] = new RealNumber (-3.1416);

        ImaginaryNumber [] y= new ImaginaryNumber[4];

        y[0] = new ImaginaryNumber(1.0);
        y[1] = new ImaginaryNumber (0.0);
        y[2] = new ImaginaryNumber(3.5);
        y[3] = new ImaginaryNumber(-5.6);

        ComplexNumber []  z = new ComplexNumber[4];

        z[0] = new ComplexNumber(1, 2);
        z[1] = new ComplexNumber (0,0);
        z[2] = new ComplexNumber (2.1, 3.4);
        z[3] = new ComplexNumber(3.1416,0);
    
        System.out.println(x[0] + " + "  + x[1] + " = " + x[0].add(x[1]) + "\n");
        System.out.println(x[1] + " + "  + x[2] + " = " + x[1].add(x[2]) + "\n");
        System.out.println(x[2] + " + "  + y[3] + " = " + x[2].add(y[3]) + "\n");
        System.out.println(x[3] + " + "  + z[3] + " = " + x[3].add(z[3]) + "\n");

        System.out.println(x[0] + " * "  + x[1] + " = " + x[0].multiply(x[1]) + "\n");
        System.out.println(x[1] + " * "  + y[2] + " = " + x[1].multiply(y[2]) + "\n");
        System.out.println(x[2] + " * "  + z[3] + " = " + x[2].multiply(z[3]) + "\n");
        System.out.println(y[3] + " * "  + z[0] + " = " + y[3].multiply(z[0]) + "\n");

        System.out.println(z[0] + " + "  + z[1] + " = " + z[0].add(z[1]) + "\n");
        System.out.println(z[1] + " * "  + z[2] + " = " + z[1].multiply(z[2]) + "\n");


    }
}
