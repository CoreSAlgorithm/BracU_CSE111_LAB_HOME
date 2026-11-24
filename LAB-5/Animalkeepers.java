public class Animalkeepers
{
  public String keepername = "";
  private  static int keeperId = 101;
  public static int totalkeeper = 0;
  public static String[] animal = new String[5];
  public static String[] work = new String[5];
  public static String[] assignedKeeper = new String[5];
  public static int count = 0;
  public static int taskassign = 0;
  public static String[] Animals = {"Lion", "Tiger", "Seal", "Gorilla", "Deer"};
  public Animalkeepers(String keepername)
  {
    this.keepername = keepername;
    System.out.println(this.keepername+" with ID "+keeperId+" got the job!");
    keeperId++;
    totalkeeper++;
  }
  public static void details()
  {
    if(totalkeeper == 0)
    {
      System.out.println("No Animal Keepers working yet.");
    }
    else
    {
      System.out.println("Total Animal Keeper: "+totalkeeper);
      System.out.println("Total Task assigned: "+taskassign);
      printTasks();
    }
  }
  public static void printTasks()
  {
    if(taskassign == 0)
    {
      System.out.println("No tasks assigned.");
      return;
    }
    for(int i=0; i<count; i++)
    {
      System.out.println(work[i]+" (keeper - "+assignedKeeper[i]+") === "+animal[i]);
    }
  }
  public void doTask(String animalname, String workname)
  {
    boolean validanimal = false;
    for(int i=0; i<Animals.length; i++)
    {
      if(animalname.equals(Animals[i]))
      {
        validanimal = true;
        break;
      }
    }
    if(!validanimal)
    {
      System.out.println("Animal not in the Safari.");
    }
    for(int i=0; i<count; i++)
    {
      if(animal[i].equals(animalname))
      {
        work[i] = workname;
        assignedKeeper[i] = this.keepername;
        System.out.println("Task assigned to " + this.keepername);
        return;
      }
    }
     animal[count] = animalname;
     work[count] = workname;
     assignedKeeper[count] = this.keepername;
     count++;
     taskassign++;
     System.out.println("Task assigned to " + this.keepername);
  }
}
