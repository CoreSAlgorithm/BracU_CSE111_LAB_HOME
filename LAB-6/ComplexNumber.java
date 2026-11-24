public class ComplexNumber extends RealNumber
{
  public double imaginaryvalue = 1.0;
  public ComplexNumber()
  {
    super(1.0);
  }
  public ComplexNumber(double realValue, double imaginaryvalue)
  {
    super(realValue);
    this.imaginaryvalue = imaginaryvalue;
  }
  public String details()
  {
    return getReal()+"\nImaginaryPart: "+imaginaryvalue;
  }
}