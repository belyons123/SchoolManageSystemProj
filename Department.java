
public class Department extends Abstr implements sharedMethods
{
    private int deptChairID;
    public Department(int i, String n, int dcID)
    {
        super(i, n);
        deptChairID = dcID;
    }
    public int getdcID()
    {
        return deptChairID;
    }
    @Override
    public void printDetails()
    {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Department Chair ID: "+ deptChairID);
    }
}
