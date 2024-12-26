class customer{
    private int cId;
    private String cName;
    private double cost;
    public customer(){
        cId = 20;
        cName = "Alex";
        cost = 45.23;
    }

    public customer(int cId,String cName,double cost)
    {
        this.cId = cId;
        this.cName = cName;
        this.cost = cost;
    }
    public int getcId()
    {
        return cId;
    }
    public String getcName(){
        return  cName;
    }
    public double getCost(){
        return cost;
    }
}

public class program1 {
    public static void main(String[] args) {
        customer c1 = new customer();
        System.out.println(c1.getcId());
        System.out.println(c1.getcName());
        System.out.println(c1.getCost());

        customer c2 = new customer(4,"alan",556.89);
        System.out.println(c2.getcId());
        System.out.println(c2.getcName());
        System.out.println(c2.getCost());
    }
}
