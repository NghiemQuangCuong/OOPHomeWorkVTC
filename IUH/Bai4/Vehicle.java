public class Vehicle
{
    private String name;
    private String brand;
    private float value;
    private float capacity;

    public Vehicle()
    {
        name = "NULL";
        brand = "NULL";
        value = 0f;
        capacity = 0f;
    }

    public Vehicle(String name, String brand, float value, float capacity)
    {
        if (!name.equals(""))
            this.name = name;
        else
            this.name = "NULL";

        if (!brand.equals(""))
            this.brand = brand;
        else
            this.brand = "NULL";

        if (value >= 0f)
            this.value = value;
        else 
            this.value = 0f;

        if (capacity >= 0f)
            this.capacity = capacity;
        else
            this.capacity = 0f;
    }

    public float tax()
    {
        if (capacity < 100f)
            return 0.01f * value;
        else if (capacity >= 100f && capacity <= 200f)
            return 0.03f * value;
        else
            return 0.05f * value;
    }

    @Override
    public String toString()
    {
        return String.format("%-30s %-20s %14.2f %20.2f %18.2f" , name, brand, capacity, value, tax());
    }
}