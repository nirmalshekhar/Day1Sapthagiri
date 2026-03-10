package Sapthagiri;
class product{
    String productName;
    double price;
    static{
        System.out.println("product class loaded");
    }
    {
        System.out.println("Product object class");
    }
    product(String productName,double price){
        this.productName=productName;
        this.price=price;
    }
    double calculateDiscount(){
        return price;
    }
}
class Electronics extends product{
    int warrentyYears;
    Electronics(String productName,double price,int warrentyYears){
        super(productName,price);
        this.warrentyYears=warrentyYears;
    }
    @Override
    double calculateDiscount(){
        return price*0.9;
    }
}
public class OnlineShoppingSystem {
    public static void main(String[] args) {
        product p=new Electronics("Iphone",80000,2026);
        System.out.println("Final Price"+ p.calculateDiscount());

    }
}
