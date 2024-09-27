package TrickyQuestion;
class test {
    int count;

    test() {
        count++;
    }

    public void printnumber() {
        System.out.println(count);
    }
}

class q1 {
    public static void main(String[] args) {

        test q1 = new test();
        test q2 = new test();
        test q3 = new test();
        q1.printnumber();
        q2.printnumber();
        q3.printnumber();

    }
}