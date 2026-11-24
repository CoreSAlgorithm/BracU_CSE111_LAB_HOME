public class Student
{
  public String name = "";
  public int id = 00000000;
  public String department = "";
  public String email = null;
  public String pass = "";
  public boolean password = false;
  public int count = 0;
  public Student(String name, int id, String department)
  {
    this.name = name;
    this.id = id;
    this.department = department;
    System.out.println("Student object is created");
  }
  public void setPassword(String pass)
  {
    this.pass = pass;
    this.password = true;
  }
}