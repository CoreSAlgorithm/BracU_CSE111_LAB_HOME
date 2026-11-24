public class Employee
{
  public String name = "";
  public double salary = 30000.0;
  public String designation = "junior";
  public void newEmployee(String name)
  {
    this.name = name;
  }
  public void displayInfo()
  {
    System.out.println("Employee Name: "+name);
    System.out.println("Employee Salary: "+salary);
    System.out.println("Employee Designation: "+designation);
  }
  public void calculateTax()
  {
    if(salary <= 30000)
    {
      System.out.println("No need to pay tax");
    }
    else if(salary > 30000 && salary <= 50000)
    {
      System.out.println(this.name+" Tax Amount: "+(this.salary*(0.1))+" Tk");
    }
    else if(salary > 50000)
    {
      System.out.println(this.name+" Tax Amount: "+(this.salary*(0.3))+" Tk");
    }
  }
  public void promoteEmployee(String designation)
  {
    this.designation = designation;
    System.out.println(this.name+" has been promoted to "+this.designation);
    if(this.designation.equals("senior"))
    {
      this.salary = this.salary+25000.0;
      System.out.println("New salary = "+this.salary);
    }
    else if(this.designation.equals("lead"))
    {
      this.salary = this.salary+50000.0;
      System.out.println("New salary = "+this.salary);
    }
    else if(this.designation.equals("manager"))
    {
      this.salary = this.salary+75000.0;
      System.out.println("New salary = "+this.salary);
    }
  }
}