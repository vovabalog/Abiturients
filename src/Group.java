import java.util.ArrayList;

public class Group {
    private String name;
    private int groupCounter = 0;
    public ArrayList <Student> studentList = new ArrayList<>();
    private final static int GROUP_SIZE = 30;


    public Group(String name) {
        this.name = name;
    }


    public double getRating()
    {
        double max = 0;
        for (Student i : studentList)
        {
            if (max < i.rating())
            {
                max = i.rating();
            }
        }
        return max;
    }

    public String getClassMonitor(double max)
    {
        String classMonitor = "";
        for(Student i : studentList)
        {
            if(i.rating() == max)
            {
                classMonitor += i;
                break;
            }
        }
        return classMonitor;
    }



    public void addStudent(Student student) {
        //int groupCounter = 0;
        if (groupCounter < GROUP_SIZE) {
            studentList.add(student);
            groupCounter++;
        }
        else{
            System.out.println("Group is full!");
        }
    }




    public String getStudentList(){
        String student = "";
        for (Student i : studentList) {
            student += i + "\n";
        }
        return student;
    }
}
