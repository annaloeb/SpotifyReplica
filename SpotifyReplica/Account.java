public abstract class Account {
  protected String name;

  public Account()
  {
    name = null;
  }

  public Account(String n)
  {
    name = n;
  }

  public Account(Account a)
  {
    this.name = a.name;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String n)
  {
    name = n;
  }

  public String toString()
  {
    String s = "";
    s += "Account Name: " + name + "\n";
    return s;
  }

  public boolean equals(Object o) 
  {
    if (this == o)
    {
      return true;
    }
    if (!(o instanceof Account))
    {
      return false;
    }
    Account a = (Account) o;
    return name.equals(a.name);
  }
}