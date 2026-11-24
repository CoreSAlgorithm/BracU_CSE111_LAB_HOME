public class Cow extends Animal
{
  public Cow()
  {
    System.out.println("The cow says hello!");
  }
  public String name = "";
  public void updateSound(String sound)
  {
    super.sound = sound;
  }
  public String getName()
  {
    return name;
  }
}
