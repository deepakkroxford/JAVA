package TrickyQuestion;

class loading{
    // public static void load() {
    //     System.out.println("loading data");
    // }

    // public static int load(int x) {
    //     System.out.println("loading data"+x);
    //     return x;
    // }

    private  void load(String s) {
        System.out.println("loading datauysydgc"+s);
    }

    private  void load (String s , int x){
        System.out.println("loading datauysydgc"+s+x);
    }

    public void setdat(){
        load("deepak");
        load("deepak",10);
    }
}
public class Q8 {
    public static void main(String[] args) {
       loading l = new loading();
       l.setdat();

    }
    
}
