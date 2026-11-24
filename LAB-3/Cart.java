public class Cart
{
  public String[] name = new String[3];
  public int count = 0;
  public double[] price = new double[3];
  public double totalPrice = 0;
  public int cartNumber;
  public double discount = 0;
  public void create_cart(int cartNumber)
  {
    this.cartNumber = cartNumber;
  }
  public void addItem(String name, double price)
  {
    if(count < 3)
    {
      this.name[count] = name;
      System.out.println(this.name[count]+" added to cart "+this.cartNumber);
      this.price[count] = price;
      count++;
      System.out.println("you have "+count+" item(s) added to cart ");
      this.totalPrice += price;
    }
    else
    {
      System.out.println("You already have 3 items on your cart.");
    }
  }
  public void addItem(double price, String name)
  {
    if(count < 3)
    {
      this.price[count] = price;
      this.name[count] = name;
      System.out.println(this.name+" added to cart "+this.cartNumber);
      count++;
      System.out.println("you have "+count+" item(s) added to cart ");
      this.totalPrice += price;
    }
    else
    {
      System.out.println("You already have 3 items on your cart.");
    }
  }
  public void cartDetails()
  {
    System.out.println("Your cart ("+this.cartNumber+")");
    for(int i=0; i<count; i++)
    {
      System.out.println(this.name[i]+" - "+this.price[i]);
    }
    System.out.println("Discount applied "+discount+"%");
    System.out.println("Total price: "+totalPrice);
  }
  public void giveDiscount(double discount)
  {
    this.discount = discount;
    this.totalPrice = this.totalPrice - (this.totalPrice*(this.discount/100));
  }
}