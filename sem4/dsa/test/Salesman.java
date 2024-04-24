public class Salesman {
    String productName;
    int totalSale;

    public Salesman(String productName, int total) {
        super();
        this.productName = productName;
        this.totalSale = total;
    }

    @Override
    public boolean equals(Object obj) {
        Salesman s = (Salesman) obj;
        return this.productName.equals(s.productName) && this.totalSale == s.totalSale;
    }

    @Override
    public String toString() {
        return "( " + this.productName + ", " + this.totalSale + " )";
    }
}