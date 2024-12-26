class humanBeing
{
    // instance variable
    private String heart;
    private String brain;
    public void setData(String heart,String brain)
    {
        this.heart = heart;
        this.brain = brain;
        int cost; //local variable.
    }
    public String getHeart(){
        return heart;
    }
    public String getBrain(){
        return brain;

    }

}

public class program2 {
    public static void main(String[] args) {
        humanBeing hb = new humanBeing();
        System.out.println(hb.getBrain());
        System.out.println(hb.getHeart());

    }
}
