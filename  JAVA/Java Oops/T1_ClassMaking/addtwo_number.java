package T1_ClassMaking;

class addnumber {
    int a;
    int b;

    public int result(int a, int b) {
        return a + b;
    }

    // this is the constructer it is also called a super method and it has no return
    // value
    // this is parametize constrictot it is insialize to set the initail value
    public addnumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void answer() {
        System.out.println(result(a, b));
    }
}

public class addtwo_number {
    public static void main(String[] args) {
        // so new keyword is used to make a object or initilze the new object
        addnumber res = new addnumber(13, 12);
        res.answer();

        
        // int x = res.result(3, 6);
        // System.out.println("the sum of two number is -->" + x);
    }
}
