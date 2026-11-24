public class MoneyTracker
{
  public String name = "Null";
  public double balance ;
  public double balance1 ;
  public double balance2 ;
  public MoneyTracker()
  {
    System.out.println("A new tracker has been launched.");
  }
  public void createTracker(String name)
  {
    this.name = name;
    this.balance = 1.0;
  }
  public String info()
  {
    return "Name: "+this.name+"\nCurrent balance: "+this.balance;
  }
  public void income(double balance1)
  {
    System.out.println("Balance updated.");
    this.balance += balance1;
    this.balance1 = balance1;
  }
  public void expense(double balance2)
  {
    if(this.balance > balance2)
    {
      this.balance -= balance2;
      this.balance2 = balance2;
      System.out.println("Balance updated.");
    }
    else
    {
      if((this.balance-balance2) == 0)
      {
        System.out.println("You're broke.");
      }
      else
      {
        System.out.println("Not enough balance.");
      }
    }
  }
  public void showHistory()
  {
    System.out.println("Last added: "+this.balance1);
    System.out.println("Last spent: "+this.balance2);
  }
}