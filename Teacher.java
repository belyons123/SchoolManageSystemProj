
public class Teacher extends Abstr implements sharedMethods
{
    private String email;
    private int deptID;
    private int roomNum;
    public Teacher(int i, String n, String e, int dI, int rN)
    {
        super(i, n);
        email = e;
        deptID = dI;
        roomNum = rN;
    }
    @Override
    public void printDetails()
    {
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Department ID: "+deptID);
        System.out.println("Room number: "+roomNum);
    }
}
