public class CarDriver extends GenericDriver
{
  public static String[] restrictedAreas = new String[2];
  public static int count = 0;
  public String profile = null;
  public CarDriver(String name)
  {
    super(name);
  }
  public String toString()
  {
    if(profile == null)
    {
      return (getName()+"'s driver profile is Not Premium");
    }
    else
    {
      return (getName()+"'s driver profile is Premium");
    }
  }
  public static void restrictedAreas(String areas)
  {
    restrictedAreas[count] = areas;
    count++;
  }
  public void fightRestriction(String[] areas)
  {
    for (String area : areas)
    {
      boolean found = false;
      for (int i = 0; i < count; i++)
      {
        if (area.equals(restrictedAreas[i]))
        {
          found = true;
          break;
        }
      }
      if (found)
      {
        System.out.println(getName() + " cannot enter " + area);
      }
      else
      {
        System.out.println(getName() + " can enter " + area);
      }
    }
  }
}