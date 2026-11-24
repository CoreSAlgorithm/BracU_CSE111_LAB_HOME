public class Artifact
{
  private String name = "";
  private String owner = "Okabe";
  private int power = 0;
  public static Artifact[] vault = new Artifact[4];
  public static int count = 0;
  public Artifact(String name, String owner)
  {
    this.name = name;
    this.owner = owner;
    this.power = CalcPower();
  }
  public Artifact(String name)
  {
    this.name = name;
  }
  public String GetName()
  {
    return name;
  }
  public String Getowner()
  {
    return owner;
  }
  public int CalcPower()
  {
    int power = 0;
    int n = name.length();
      if(n%2 == 0)
      {
        for(int j=0; j<n; j+=2)
        {
          power += (int)name.charAt(j);
        }
      }
      else
      {
        for(int j=1; j<n; j+=2)
        {
          power += (int)name.charAt(j);
        }
      }
    return power;
  }
  public static void AddtoVault(Artifact obj)
  {
    if(count < 4)
    {
      Artifact.vault[count] = obj;
      System.out.println(obj.owner+" added "+obj.name+" successfully to the vault.");
      count++;
    }
    else
    {
      System.out.println(obj.owner+" unsuccessful in adding artifact to the vault!!");
    }
  }
  public static void labReport()
  {
    System.out.println("=== Future Gadget Lab ===");
    for(int i=0; i<count; i++)
    {
      System.out.println(vault[i].name+" added by "+vault[i].owner+" has power of "+vault[i].power);
    }
  }
  public static String strongest()
  {
    if(count == 0)
    {
      return "No artifacts";
    }
    Artifact max = vault[0];
    for(int i=1; i<count; i++)
    {
      if(vault[i].power > max.power)
      {
        max = vault[i];
      }
    }
    return max.name;
  }
  public void revealArtifact()
  {
    System.out.println(name + " added by " + owner + " has power of " + power + ".");
  }
  public void changeName(String newName)
  {
    this.name = newName;
    this.power = CalcPower();
    System.out.println("Name changed and power recalculated.");
  }
}