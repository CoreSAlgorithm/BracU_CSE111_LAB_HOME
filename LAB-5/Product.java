public class Product
{
  public static String[] name = new String[3];
  public static int count = 0;
  public static int[] qty = new int[3]; 
  public Product(String name, int qty)
  {
    if(count < 3)
    {
      this.name[count] = name;
      this.qty[count] = qty;
      count++;
      System.out.println("Stored: "+name);
    }
    else
    {
      System.out.println("Storage is full! Cannot add.");
    }
  }
  public static void displayProducts()
  {
    System.out.println("=== Stored Products ===");
    System.out.println(name[0]+" - QTY: "+qty[0]);
    System.out.println(name[1]+" - QTY: "+qty[1]);
    System.out.println(name[2]+" - QTY: "+qty[2]);
  }
  public static void buy(String nam, int qt)
  {
    for(int i=0; i<count; i++)
    {
      if(name[i].equals(nam))
      {
        if(qty[i] > qt)
        {
          qty[i] -= qt;
          System.out.println("Product sold");
          return;
        }
        else
        {
          System.out.println("Quantity low");
          return;
        }
      }
    }
    System.out.println("Product not found");
  }
  
}