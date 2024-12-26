class Calc
{
    int a = 10;
    int b = 20;
    void add()
    {
        System.out.println(a+b);
    }
    void sub(){
        this.add();
        System.out.println(a-b);
    }
    int mul(){
        this.sub();
        return a*b;
    }
}


public class program3 {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.mul());
    }
}
