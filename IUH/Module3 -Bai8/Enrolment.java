public class Enrolment 
{
    private Student student;
    private String status;
    private String grade;
    private double numGrade;

    public Enrolment(Student student, String status, String grade, double numGrade)
    {
        this.student = student;
        this.status = (!status.trim().equals("")) ? status : "null";
        this.grade = (!grade.trim().equals("")) ? grade : "null";
        this.numGrade = (numGrade >= 0.0 && numGrade <= 10.0) ? numGrade : 0.0;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = (!status.trim().equals("")) ? status : this.status;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = (!grade.trim().equals("")) ? grade : this.grade;
    }

    public double getNumGrade() {
        return numGrade;
    }

    public void setNumGrade(double numGrade) {
        this.numGrade = (numGrade >= 0.0 && numGrade <= 10.0) ? numGrade : this.numGrade;
    }
    
    public String getInfo()
    {
        return String.format("%-15s %-25s %15d %15.1f", student.getStudentID(), 
            student.getFirstName() + " " + student.getLastName(),
            student.getYearMatriculated(),
            numGrade);
    }
}
