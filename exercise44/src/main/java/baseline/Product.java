package baseline;

//this class is made as an obj only to store information properly
//hence there is no point on testing the class
public record Product(String name, double price, int quantity) {
    //set the needed getters
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    //override the toString() to output in the right format
    @Override
    public String toString() {
        return String.format("We have that in store!%nName: %s%nPrice: %.2f%nQuantity: %d%n",
                getName(), getPrice(), getQuantity());
    }
}
