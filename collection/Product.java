package collection;

public class Product {
    int productCode;
    String productDescription;
    double unitPrice;
    String category;

    public Product() {

    }

    @Override
    public String toString() {
        return "Product [productCode=" + productCode + ", productDescription=" + productDescription + ", unitPrice="
                + unitPrice + ", category=" + category + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + productCode;
        result = prime * result + ((productDescription == null) ? 0 : productDescription.hashCode());
        long temp;
        temp = Double.doubleToLongBits(unitPrice);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((category == null) ? 0 : category.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (productCode != other.productCode)
            return false;
        if (productDescription == null) {
            if (other.productDescription != null)
                return false;
        } else if (!productDescription.equals(other.productDescription))
            return false;
        if (Double.doubleToLongBits(unitPrice) != Double.doubleToLongBits(other.unitPrice))
            return false;
        if (category == null) {
            if (other.category != null)
                return false;
        } else if (!category.equals(other.category))
            return false;
        return true;
    }

    public Product(int productCode, String productDescription, double unitPrice, String category) {
        this.productCode = productCode;
        this.productDescription = productDescription;
        this.unitPrice = unitPrice;
        this.category = category;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
