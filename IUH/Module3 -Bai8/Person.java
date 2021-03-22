public abstract class Person
{
    protected String lastName;
    protected String firstName;

    protected Person(String lastName, String firstName)
    {
        this.lastName = (!lastName.trim().equals("")) ? lastName : "null";
        this.firstName = (!firstName.trim().equals("")) ? firstName : "null";
    }

    protected String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) {
        this.lastName = (!lastName.trim().equals("")) ? lastName : this.lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName) {
        this.firstName = (!firstName.trim().equals("")) ? firstName : this.firstName;
    }

    protected abstract boolean equals(Person p);
    
}