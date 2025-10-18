
public class Course extends Abstr implements sharedMethods
{
    private int instrID;
    public Course(int i, String n, int iI)
    {
        super(i, n);
        instrID = iI;
    }
    public int getInstrID()
    {
        return instrID;
    }
    @Override
    public void printDetails()
    {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Instructor ID: "+ instrID);
    }
}
