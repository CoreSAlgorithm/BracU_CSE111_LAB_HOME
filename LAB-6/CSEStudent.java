public class CSEStudent extends Student
{
  public String[] course = new String[4];
  public int count = 0; 
  public static int total = 0;
  public CSEStudent(String name, int id)
  {
    super(name, id);
    this.total++;
  }
  public void info()
  {
    if(count > 0)
    {
      super.info();
      for(int i=0; i<count; i++)
      {
        System.out.print(course[i]+" ");
      }
      System.out.print("\n");
    }
    else
    {
      super.info();
    }
  }
  public void addLabBasedCourse(String course)
  {
    if(course.equals("CSE230"))
    {
      System.out.println("It is not a lab based course!");
    }
    else
    {
      this.course[count] = course;
      count++;
    }
  }
  public static void details()
  {
    System.out.println("Total CSE Students: "+total);
    System.out.println("Available Lab Based Courses:");
    System.out.println("CSE110 CSE111 CSE220 CSE221");
  }
}