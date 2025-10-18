
public abstract class Abstr
{
    int id;
    String name;
    public Abstr(int i, String n)
    {
        id = i;
        name = n;
    }
    public void setId(int i)
    {
        id = i;
    }
    public int getId()
    {
        return id;
    }
    public void setName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
}
