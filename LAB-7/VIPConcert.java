public class VIPConcert extends Concert
{
  public VIPConcert(String vanue, String showtime)
  {
    super(vanue,showtime);
  }
  public void addArtist(String artist)
  {
    super.artist[count] = artist;
    count++;
  }
  public void showDetails()
  {
    System.out.println("Vanue: "+super.venue);
    System.out.println("Showtime: "+super.showtime);
    System.out.println("Artist: ");
    if(count > 0)
    {
      for(int i=0; i<count; i++)
      {
        System.out.println("-"+artist[i]);
      }
    }
    System.out.println("Tickets sold in this concert: "+super.vipsold);
  }
}