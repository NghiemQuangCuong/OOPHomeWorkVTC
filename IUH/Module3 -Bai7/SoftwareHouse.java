import java.util.ArrayList;

public class SoftwareHouse 
{
    private String name;
    private ArrayList<Employee> listEmployee;

    public SoftwareHouse(String name)
    {
        this.name = (!name.trim().equals("")) ? name : "null";
        listEmployee = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public boolean addEmployee(Employee emp)
    {
        for (Employee employee : listEmployee)
            if (employee.equals(emp)) return false;

        listEmployee.add(emp);
        return true;
    }

    public void displayAllStaff()
    {
        System.out.printf("%-15s %-25s %21s %25s %21s\n", "Ma so", "Ten", "Luong co ban", "Ghi chu", "Luong thuc lanh");
        for (Employee emp : listEmployee)
            System.out.println(emp.getInfo());
    }

    public double getMonthlySalaryBill()
    {
        double result = 0.0;
        for (Employee emp : listEmployee)
            result += emp.getMonthSalary();
        return result;
    }

    public void sortAllStaffByName()
    {
        listEmployee.sort((s1, s2) ->
        {
            return s1.getName().compareTo(s2.getName());
        });
    }

    public void displayListProgrammer()
    {
        for (Employee emp : listEmployee)
            if (emp instanceof Programmer && !(emp instanceof ProjectLeader))
                System.out.println(emp.getInfo());
    }

    public boolean updateDepartmentForAdmin(int payrollNo, String newDepart)
    {
        for (Employee emp : listEmployee)
            if (emp instanceof Administrator && emp.getPayrollNumber() == payrollNo)
            {
                ((Administrator)emp).setDepartment(newDepart);
                return true;
            }

        return false;
    }

    public boolean deleteEmployee(int payrollNo)
    {
        for (Employee emp : listEmployee)
            if (emp.getPayrollNumber() == payrollNo)
            {
                listEmployee.remove(emp);
                return true;
            }

        return false;
    }
}
