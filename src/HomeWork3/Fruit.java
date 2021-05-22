package HomeWork3;

public abstract class Fruit {
    private float weight;
    private int quantity;
    private String nameFruit;

    public void setQuantity(int quantity) {
        if (quantity > 10) {
            System.out.println("В коробке может поместиться только 10 фруктов");
        } else {
            this.quantity = quantity;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public float getWeight() {
        return weight;
    }

    public String getNameFruit() {
        return nameFruit;
    }
}
