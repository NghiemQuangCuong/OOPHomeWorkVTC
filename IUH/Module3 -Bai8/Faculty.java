public class Faculty extends Person
{
    private String facultyID;
    private String office;

    public Faculty(String lastName, String firstName, String facultyID, String office)
    {
        super(lastName, firstName);
        this.facultyID = (!facultyID.trim().equals("")) ? facultyID : "null" ;
        this.office = (!office.trim().equals("")) ? office : "null";
    }

    public String getFacultyID() {
        return facultyID;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = (!office.trim().equals("")) ? office : this.office;
    }

    @Override
    public boolean equals(Person p)
    {
        if (p instanceof Faculty && ((Faculty)p).getFacultyID().equals(facultyID))
            return true;
        return false;
    }
}
