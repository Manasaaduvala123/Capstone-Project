package day5_Assessment;
public class Product {
    private final String name;
    private final String code;
    private final double price;
    private final String category;
    private Product(Builder builder) {
        this.name = builder.name;
        this.code = builder.code;
        this.price = builder.price;
        this.category = builder.category;
    }
    public String getName() {
        return name;
    }
    public String getCode() {
        return code;
    }
    public double getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }
    public static class Builder {
        private String name;
        private String code;
        private double price;
        private String category;
        public Builder withName(String name) {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be null or empty");
            }
            this.name = name;
            return this;
        }
        public Builder withCode(String code) {
            if (code == null || code.isEmpty()) {
                throw new IllegalArgumentException("Code cannot be null or empty");
            }
            this.code = code;
            return this;
        }
        public Builder withPrice(double price) {
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative");
            }
            this.price = price;
            return this;
        }
        public Builder withCategory(String category) {
            this.category = category;
            return this;
        }
        public Product build() {
            if (name == null || code == null) {
                throw new IllegalStateException("Name and code are required");
            }
            return new Product(this);
        }
    }
    public static void main(String[] args) {
        Product product = new Product.Builder()
                .withName("Laptop")
                .withCode("LP123")
                .withPrice(55000.0)
                .withCategory("Electronics")
                .build();
        System.out.println("Product Details:");
        System.out.println("Name: " + product.getName());
        System.out.println("Code: " + product.getCode());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Category: " + product.getCategory());
    }
}


