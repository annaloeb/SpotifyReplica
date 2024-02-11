public class Podcast extends Content{

  private int episodeNum;

  public Podcast()
  {
    super();
    episodeNum = 0;
  }

  public Podcast(String t, String a)
  {
    super(t, a, 0);
    episodeNum = 0;
  }

  public Podcast(String t, String a, int n)
  {
    super(t, a, 0);
    episodeNum = n;
  }

  public Podcast(String t, String a, int s, int n)
  {
    super(t, a, s);
    episodeNum = n;
  }

  public String toString()
  {
    String s = "";
    s += title + " by " + artist;
    return s;
  }
  
  public void play()
  {
    numStreams += 1;
    episodeNum += 1;
    System.out.println("Now playing episode " + episodeNum + " of podcast: " + title + " by " + artist + "\n");
  }
}