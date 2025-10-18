import java.util.*;
public class SchoolManagementSystem
{
    public String deptWithMaxStudents()
    {
        FileReader filer = new FileReader();
        int dept1 = 0;
        int dept2 = 0;
        int dept3 = 0;
        int dept4 = 0;
        int dept5 = 0;
        ArrayList<Student> Students = filer.loadStudents("students.csv");
        for(Student x: Students)
        {
            try
            {
            if(x.getDeptID()==0)
            {
                throw new Exception("Missing Department ID for student "+x.getId());
            }
            if(x.getDeptID()==1)
            {
                dept1+=1;
            }
            if(x.getDeptID()==2)
            {
                dept2+=1;
            }
            if(x.getDeptID()==3)
            {
                dept3+=1;
            }
            if(x.getDeptID()==4)
            {
                dept4+=1;
            }
            if(x.getDeptID()==5)
            {
                dept5+=1;
            }
            }
            catch(Exception e)
            {
                System.out.println("Error: "+e.getMessage());
            }
        }
        int[]arr = {dept1, dept2, dept3, dept4, dept5};
        int max = -1;
        for(int i = 0; i<5; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        if(max==dept1)
        {
            return "Economics";
        }
        else if(max==dept2)
        {
            return "Computer Science";
        }
        else if(max==dept3)
        {
            return "Political Science";
        }
        else if(max==dept4)
        {
            return "Social Science";
        }
        else
        {
            return "Mathematics";
        }
    }
    
    public String teachWithLeastStu()
    {
        FileReader filer = new FileReader();
        ArrayList<Teacher> Teachers = filer.loadTeachers("teachers.csv");
        ArrayList<Student> Students = filer.loadStudents("students.csv");
        int min = 1001;
        String minTeachName = "";
        for(Teacher t: Teachers)
        {
            int teachCount = 0;
            for(Student s: Students)
            {
                try
                {
                    if(s.getAdvID()==0)
                    {
                        throw new Exception("Missing advisor ID for student "+s.getId());
                    }
                    if(s.getAdvID()==t.getId())
                    {
                        teachCount+=1;
                    }
                }
                catch (Exception e)
                {
                    System.out.println("Error: "+e.getMessage());
                }
            }
            if(teachCount<min)
            {
                min = teachCount;
                minTeachName = t.getName();
            }
        }
        return minTeachName;
    }
    
    public void printDeptChairs()
    {
        FileReader filer = new FileReader();
        ArrayList<Department> Departments = filer.loadDepartments("departments.csv");
        ArrayList<Teacher> Teachers = filer.loadTeachers("teachers.csv");
        for(Department d: Departments)
        {
            try{
                if(d.getdcID()==0)
                {
                    throw new Exception(d.getName()+"department is missing chair ID");
                }
                for(Teacher t: Teachers)
                {
                    if(t.getId()==d.getdcID())
                    {
                        System.out.println(d.getName()+" - "+t.getName());
                    }
                }
            }
            catch (Exception e)
            {
                System.out.println("Error: "+e.getMessage());
            }
        }
    }
    
    public int numStuMissingNat()
    {
        FileReader filer = new FileReader();
        ArrayList<Student> Students = filer.loadStudents("students.csv");
        int stuCount = 0;
        for(Student s: Students)
        {
            if(s.getNation()=="")
            {
                stuCount++;
            }
        }
        return stuCount;
    }
    
    public void printCourseInstrs()
    {
        FileReader filer = new FileReader();
        ArrayList<Teacher> Teachers = filer.loadTeachers("teachers.csv");
        ArrayList<Course> Courses = filer.loadCourses("courses.csv");
        for(Course c: Courses)
        {
            try
            {
                if(c.getInstrID()==0)
                {
                    throw new Exception(c.getName()+" is missing Instructor ID");
                }
                for(Teacher t: Teachers)
                {
                    if(c.getInstrID()==t.getId())
                    {
                    System.out.println(c.getName()+" - "+t.getName());
                    }
                }
            }
            catch (Exception e)
            {
                System.out.println("Error: "+e.getMessage());
            }
        }
    }
}
