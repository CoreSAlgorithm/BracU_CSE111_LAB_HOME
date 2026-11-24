public class Spaceship
{
  public String name = "";
  public int totalCapacity = 0;  
  public int capacity = 0;
  public String[] metarial = new String[100];
  public int count = 0;
  public Spaceship(String name, int totalCapacity)
  {
    this.name = name;
    this.totalCapacity = totalCapacity;
  }
  public void loadCargo(Cargo metarial)  
  {  
    this.capacity += metarial.getWeight();
    if(this.totalCapacity >= capacity)
    {
      this.metarial[count] = metarial.getName();
      count++;
    }
    else
    {
      System.out.println("Warning: Unable to load "+metarial.getName()+" inside "+this.name+". Exceeds capacity by "+(this.capacity-this.totalCapacity)+" .");
    }
  }
  public void displayDetails()
  {
    System.out.println("Spaceship Name: "+this.name);
    System.out.println("Capacity: "+this.totalCapacity);
    System.out.println("Current cargo weight :"+this.capacity);
    System.out.print("Cargo: ");
    for(int i=0; i<count; i++)
    {
      System.out.print(this.metarial[i]+" ");
    }
    System.out.println();
  }
}