public class Organizer
{
  public String orgname = "";
  public Event[] organize = new Event[4];
  public int count = 0;
  public Organizer()
  {
    System.out.println("Please provide the organizer's name.");
  }
  public Organizer(String name)
  {
    this.orgname = name;
  }
  public void organizeEvent(Event ev)
  {
    this.organize[count] = ev;
    count++;
    System.out.println(this.orgname+" successfully organized "+ev.getEventname());
  }
  public void searchEventByDate(String date)
  {
    for(int i=0; i<count; i++)
    {
      if(organize[i].getEventdate().equals(date))
      {
        System.out.println(organize[i].getEventname());
        return;
      }
    }
    System.out.println("No event is scheduled for "+date);
    return;
  }
}