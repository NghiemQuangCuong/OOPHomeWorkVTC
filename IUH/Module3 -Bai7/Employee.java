public abstract class Employee
{
    protected int payrollNumber;
    protected String name;
    protected double basicMonthlySalary;

    protected Employee(int payrollNumber, String name, double basicMonthlySalary)
    {
        this.payrollNumber = (payrollNumber > 0) ? payrollNumber : 0;

        this.name = (!name.trim().equals("")) ? name : "null";

       this.basicMonthlySalary = (basicMonthlySalary > 0.0) ? basicMonthlySalary : 0.0;
    }

    public int getPayrollNumber()
    {
        return payrollNumber;
    }

    public boolean equals(Employee obj)
    {
        return (payrollNumber == obj.getPayrollNumber()) ? true : false;
    }

    public String getName()
    {
        return name;
    }

    public abstract String getInfo();
    public abstract double getMonthSalary();
}