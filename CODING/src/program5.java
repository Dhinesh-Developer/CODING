class Product
{
    int pId;
    String pName;
    float pCost;
    double pGst;
}

public class program5 {
    public static void main(String[] args) {
        Product p = new Product();
        p.pId = 101;
        p.pName = "Apple";
        p.pCost = 75000.85f;
        p.pGst = 45.00;

        System.out.println(p.pId);
        System.out.println(p.pName);
        System.out.println((p.pCost));
        System.out.println(p.pGst);
    }
}
