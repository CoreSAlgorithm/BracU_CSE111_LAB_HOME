public class Triangle
{
  public int a = 0;
  public int b = 0;
  public int c = 0;
  public int perimeter = 0;
  public Triangle(int a,int b,int c)
  {
    this.a = a;
    this.b = b;
    this.c = c;
    this.perimeter = (a+b+c);
  }
  public void triangleDetails()
  {
    System.out.println("Three sides of the triangle are: "+a+", "+b+", "+c);
    System.out.println("Perimeter: "+this.perimeter);
  }
  public String printTriangleType()
  {
    if(this.a == this.b && this.b == this.c)
    {
      return "This is an Equilateral Triangle.";
    }
    else if(this.a != this.b && this.b != this.c && this.c != this.a)
    {
      return "This is an Scalene Triangle.";
    }
    else
    {
      return "This is an Isosceles Triangle.";
    }
  }
  public void compareTriangles(Triangle t)
  {
    if (this == t)
    {
        System.out.println("These two triangle objects have the same address.");
    }
    else if (this.a == t.a && this.b == t.b && this.c == t.c)
    {
        System.out.println("Addresses are different but the sides of the triangles are equal.");
    }
    else if (this.a != t.a && this.b != t.b && this.c != t.c ||
             this.a == t.a && this.b != t.b && this.c != t.c ||
             this.a != t.a && this.b == t.b && this.c != t.c ||
             this.a != t.a && this.b != t.b && this.c == t.c && this.perimeter != t.perimeter)
    {
        System.out.println("Addresses, length of the sides and perimeter all are different.");
    }
    else if (this.perimeter == t.perimeter)
    {
        System.out.println("Only the perimeter of both triangles is equal.");
    }
  }
}