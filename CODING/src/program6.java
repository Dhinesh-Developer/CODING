class Article
{
    int aNum;
    String aName;
    String aAuthor;
    String aDesc;

    public Article(int aNum,String aName,String aAuthor,String aDesc)
    {
        this.aNum = aNum;
        this.aName = aName;
        this.aAuthor = aAuthor;
        this.aDesc = aDesc;
    }
    public int getaNum(){
        return aNum;
    }
    public String getaName(){
        return aName;
    }
    public String getaAuthor(){
        return aAuthor;
    }
    public String getaDesc(){
        return aDesc;
    }
}

public class program6 {
    public static void main(String[] args) {
        Article a = new Article(100,"steve jobs","robin","Enterprenuer skills");
        System.out.println(a.getaNum());
        System.out.println(a.getaName());
        System.out.println(a.getaAuthor());
        System.out.println(a.getaDesc());


    }
}
