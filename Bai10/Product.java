public class Product
{
    private String description;
    private String productID;
    private double price;

    public Product()
    {
        description = "chua xac dinh";
        productID = "chua xac dinh";
        price = 0.0;
    }

    public Product(String description, String productID, double price)
    {
        if (!description.equals(""))
            this.description = description;
        else
            this.description = "chua xac dinh";

        if (!productID.equals(""))
            this.productID = productID;
        else
            this.productID = "chua xac dinh";

        if (price > 0.0)
            this.price = price;
        else
            this.price = 0.0;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (!description.equals(""))
            this.description = description;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        if (!productID.equals(""))
            this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0.0)
            this.price = price;
    }

    @Override
    public String toString()
    {
        return String.format("%-10s %-30s %20.3f", productID, description, price);
    }
}