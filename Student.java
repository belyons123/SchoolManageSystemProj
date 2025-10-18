public class Student extends Abstr implements sharedMethods
{
    private String natnlty;
    private String email;
    private int deptID;
    private int advID;
    public Student(int i, String n, String nat, String e, int dI, int aI)
    {
        super(i, n);
        natnlty = nat;
        email = e;
        deptID = dI;
        advID = aI;
    }
    public String getNation()
    {
        return natnlty;
    }
    public int getDeptID()
    {
        return deptID;
    }
    public int getAdvID()
    {
        return advID;
    }
    @Override
    public void printDetails()
    {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Nationality: "+natnlty);
        System.out.println("Email: "+email);
        System.out.println("Department ID: "+deptID);
        System.out.println("Advisor ID: "+advID);
    }
}
