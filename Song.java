public class Song extends Content{

  public Song()
  {
    super();
  }

  public Song(String t, String a)
  {
    super(t, a, 0);
  }

  public Song(String t, String a, int s)
  {
    super(t, a, s);
  }

  public String toString()
  {
    String s = "";
    s += title + " by ";
    s += artist;
    return s;
  }
  
  public void play()
  {
    numStreams += 1;
    System.out.println("Now playing: " + title + " by " + artist + "\n");
  }
}