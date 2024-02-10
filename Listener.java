import java.util.LinkedList;

class Listener extends Account{

  protected LinkedList<Content> favorites = new LinkedList<Content>();

  public Listener()
  {
    super();
  }

  public Listener(String n)
  {
    super(n);
  }

  public Listener(String n, LinkedList<Content> favs)
  {
    super(n);
    favorites = favs;
  }

  public String getUsername()
  {
    return name;
  }

  public void setName(String n)
  {
    name = n;
  }

  public void favorite(Content c)
  {
    favorites.add(c);
  }

  public String showFavorites()
  {
    String s = "";
    for (int i = 0; i < favorites.size(); ++i)
      s += favorites.get(i).toString() + "\n";
    return s;
  }
  
}