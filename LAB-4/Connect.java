public class Connect
{
  public Student stname ; 
  private boolean login = false;
  private String pass = "";
  public String[][] course = new String[5][3];
  public Student[] advisees = new Student[5];
  public int advisecount = 0;
  public Connect()
  {
    System.out.println("Connect is ready to use!");
  }
  public void login(Student name)
  {
    this.stname = name;
    if(name.email == null && name.password == false)
    {
      System.out.println("Email and password need to be set.");
    }
    else
    {
      System.out.println("Login successful");
      this.login = true;
    }
  }
  public void advising(Student name)
  {
    if(this.login == false)
    {
      System.out.println("Please login to advise courses!");
    }
    else if(name.count == 0)
    {
      System.out.println("You haven't selected any courses.");
    }
  }
  public void advising(Student name, String course1, String course2, String course3, String course4)
  {
    if(this.login == false)
    {
      System.out.println("Please login to advise courses!");
    }
    else
    {
      System.out.println("You need special approval to take more than 3 courses.");
    }
  }
  public void advising(Student name, String course1, String course2, String course3)
  {
    if (this.login == false)
    {
      System.out.println("Please login to advise courses!");
    }
    else
    {
      advisees[advisecount] = name;
      course[advisecount][0] = course1;
      course[advisecount][1] = course2;
      course[advisecount][2] = course3;
      advisecount++;
      System.out.println("Advising successful!");
    }
  }
  public void allAdviseeInfo()
  {
    System.out.println("Total Advisee: " + advisecount);
    for (int i = 0; i < advisecount; i++)
    {
      System.out.println("Name: " + advisees[i].name + " ID: " + advisees[i].id);
      System.out.println("Department: " + advisees[i].department);
      System.out.println("Advised Courses:");
      for (int j = 0; j < 3; j++)         
      {
        System.out.print(course[i][j] + " ");
      }
     System.out.println();
     System.out.println("==============");
    }
  }
}