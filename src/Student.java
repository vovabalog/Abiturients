
public class Student {

    private String name;
    private String surname;
    private float averageMark;
    private int studentsTicket;
    private double rating = Math.random()*100.00;


    void createStudent(String name, String surname, float averageMark, int studentsTicket){
        this.name = name;
        this.surname = surname;
        this.averageMark = averageMark;
        this.studentsTicket = studentsTicket;
    }

    public double rating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(float averageMark) {
        this.averageMark = averageMark;
    }

    public int getStudentsTicket() {

        return studentsTicket;
    }

    public void setStudentsTicket(int studentsTicket) {
        this.studentsTicket = studentsTicket;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString(){
        return this.name + "   " +  this.surname + "   "
                + this.averageMark + "   " + this.rating + "   " + this.studentsTicket;
    }


}