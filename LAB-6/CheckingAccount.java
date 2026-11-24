public class CheckingAccount extends Account
{
  public static double count = 0;
  public CheckingAccount()
  {
    super(0);
  }
  public CheckingAccount(double balance)
  {
    super(0);
    super.balance = balance;
    count += balance; 
  }
  public static double count()
  {
    return count;
  }
}