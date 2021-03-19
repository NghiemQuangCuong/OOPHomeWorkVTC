import java.util.ArrayList;

public class QuanLy
{
    private ArrayList<Person> listPerson = new ArrayList<>();
    private int maxSize;

    public QuanLy(int n)
    {
        listPerson.ensureCapacity(n);
        maxSize = n;
    }

    public boolean addPerson(Person person)
    {
        if (listPerson.size() == maxSize)
            return false;
        
        listPerson.add(person);
        return true;
    }
    
    public boolean deletePersonWithName(String name)
    {
        for (int i = 0; i < listPerson.size(); i++)
            if (listPerson.get(i).getHoTen().equals(name))
            {
                listPerson.remove(i);
                return true;
            }
                
        return false;
    }

    public void sortWithName()
    {
        listPerson.sort((s1, s2) ->
        {
            return s1.getHoTen().compareTo(s2.getHoTen());
        });
    }

    public void xuatDanhSach()
    {
        System.out.println("Danh sach hoc sinh: ");
        System.out.printf("%-25s %-25s %12s %12s %12s %-15s\n", "Ho Ten", "Dia chi", "Diem Mon 1", 
            "Diem mon 2", "Diem trung binh", "Danh gia");
        for (Person p : listPerson)
            if (p instanceof Student)
                System.out.println(p);
        System.out.println("----------------------------------");
        System.out.println("Danh sach nhan vien: ");
        System.out.printf("%-25s %-25s %12s %25s %20s\n", "Ho Ten", "Dia chi", "He so luong", "Tien luong", "Danh gia");
        for (Person p : listPerson)
            if (p instanceof Employee)
                System.out.println(p);
        System.out.println("----------------------------------");
        System.out.println("Danh sach khach hang: ");
        System.out.printf("%-25s %-25s %-25s %25s %20s\n", "Ho ten", "Dia chi", "Ten cong ty", "Tri gia hoa don", "Danh gia");
        for (Person p : listPerson)
            if (p instanceof Customer)
                System.out.println(p);
    }
}
