public class Student extends Person
{
    private String studentID;
    private int yearMatriculated;

    public Student(String lastName, String firstName, String studentID, int yearMatriculated)
    {
        super(lastName, firstName);
        this.studentID = (!studentID.trim().equals("")) ? studentID : "null";
        this.yearMatriculated = (yearMatriculated > 0) ? yearMatriculated : 0;
    }

    public String getStudentID() {
        return studentID;
    }

    public int getYearMatriculated() {
        return yearMatriculated;
    }

    public void setYearMatriculated(int yearMatriculated) {
        this.yearMatriculated = (yearMatriculated > 0) ? yearMatriculated : this.yearMatriculated;
    }

    @Override
    public boolean equals(Person p)
    {
        if (p instanceof Student && ((Student)p).getStudentID().equals(studentID))
            return true;
        return false;
    }
}
