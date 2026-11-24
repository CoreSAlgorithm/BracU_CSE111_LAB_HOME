public class MobilePhone
{
  public int capacity = 0;
  public int count = 0;
  public String[] name ;
  public int[] number ;
  public void setContactCapacity(int capacity)
  {
    this.capacity = capacity;
    this.name = new String[capacity];
    this.number = new int[capacity];
  }
  
  public void details()
  {
    System.out.println("Total Contacts: "+count);
    System.out.println("Contacts List: ");
    for(int i=0; i<count; i++)
    {
      System.out.println(this.name[i]+" : "+this.number[i]);
    }
  }
  public void addContact(String name, int number)
  {
    if(count < this.capacity)
    {
      this.name[count]=name;
      this.number[count]=number;
      System.out.println("The contact of "+name+" is added.");
      count++;
    }
    else
    {
      System.out.println("Storage full!");
    }
  }
  public void makeCall(int number)
  {
    int print = 0;
    for(int i=0; i<count; i++)
    {
      if(this.number[i] == number)
      {
        System.out.println("Calling "+this.name[i]+"...");
        break;
      }
      else
      {
        print++;
      }
    }
    if(print == count)
    {
      System.out.println("Calling "+number+"...");
    }
  }
}