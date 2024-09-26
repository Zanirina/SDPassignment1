class DiscountCalculator {
    public double calculateDiscount(Product product) {
        return product.getDiscount();
    }
}

class FoodProduct implements Product {
    public double price;

    public FoodProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.05;
    }
}

class ElectronicsProduct implements Product {
    public double price;

    public ElectronicsProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.1;
    }
}

class ClothingProduct implements Product {
    public double price;

    public ClothingProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.2;
    }
}


public class Main {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        Product food = new FoodProduct(200);
        Product electronic = new ElectronicsProduct(5000);
        Product clothes = new ClothingProduct(1400);

        System.out.println(calculator.calculateDiscount(food));
        System.out.println(calculator.calculateDiscount(electronic));
        System.out.println(calculator.calculateDiscount(clothes));

    }
}