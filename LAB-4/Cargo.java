public class Cargo
{
  private String name = "";
  private int weight = 0;
  public Cargo(String name, int weight)
  {
    this.name = name;
    this.weight = weight;
  }
  public String getName()
  {
    return this.name;
  }
  public int getWeight()
  {
    return this.weight;
  }
}