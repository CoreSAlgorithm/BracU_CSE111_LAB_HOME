public class Player
{
  public String name = "";
  public int hp = 100;  
  public String enemy = "";
  public String[] defeated = new String[5];
  public int count = 0;
  public Player(String name, int hp)
  {
    this.name = name;
    this.hp = hp;
    System.out.println(this.name+" joined the game");
    System.out.println("Hp: "+this.hp);
  }
  public Player(String name)
  {
    this.name = name;
    System.out.println(this.name+" joined the game");
    System.out.println("Hp: "+this.hp);
  }
  public void viewInfo()
  {
    System.out.println("Player name: "+this.name);
    System.out.println("Current Hp: "+this.hp);
    System.out.println("Defeated");
    for(int i=0; count>i; i++)
    {
      System.out.print(this.defeated[i]+", ");
    }
    System.out.print("\n ");
  }
  public void defeatVillain(String enemy, int hp)
  {
    this.enemy = enemy;
    if(this.hp < hp)
    {
      System.out.println("failed to defeat "+this.enemy);
    }
    else if(this.hp == hp)
    {
      this.defeated[count] = enemy;
      this.hp += hp;
      System.out.println("Defeated "+this.enemy);
      count++;
    }
  }
  public void defeatVillain(int a, String enemy, int hp)
  {
    this.hp = (a*this.hp);
    System.out.println("HP with "+a+"x boost: "+this.hp);
    if(this.hp > hp)
    {
      this.enemy = enemy;
      this.defeated[count] = enemy;
      this.hp += hp;
      System.out.println("Defeated "+this.enemy);
      count++;
    }
  }
  public void defeatVillain(Player p)
  {
    if(this.hp > p.hp)
    {     
      this.defeated[count] = p.name;
      this.hp += p.hp;
      System.out.println("Defeated "+p.name);
      count++;
    }
    else if(this.hp < p.hp)
    {
      System.out.println("failed to defeat "+p.name);
    }
  }
}