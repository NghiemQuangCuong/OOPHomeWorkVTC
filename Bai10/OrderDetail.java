public class OrderDetail {
    private int quatity;
    private Product product;

    public OrderDetail(int quatity, Product product)
    {
        if (quatity > 0)
            this.quatity = quatity;
        else
            this.quatity = 0;

        this.product = product;
    }

    public int getQuatity()
    {
        return quatity;
    }

    public Product getProduct()
    {
        return product;
    }

    public void setQuatity(int quatity)
    {
        if (quatity > 0)
            this.quatity = quatity;
    }

    public double calcTotalPrice()
    {
        return quatity * product.getPrice();
    }

    @Override
    public String toString()
    {
        return product.toString() + " " + quatity;
    }
}
