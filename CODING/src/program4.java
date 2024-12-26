class Bank
{
    private int AccNo;
    private int AccBal;

    public Bank(int AccNo,int AccBal)
    {
        this.AccNo = AccNo;
        this.AccBal =AccBal;
    }

    public int getAccNo(){
        return AccNo;
    }
    public int getAccBal(){
        return AccBal;
    }
}


public class program4 {
    public static void main(String[] args) {
        Bank b = new Bank(101,76743);
        System.out.println(b.getAccNo());
        System.out.println((b.getAccBal()));
    }
}
