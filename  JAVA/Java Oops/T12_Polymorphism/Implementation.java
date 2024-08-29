package T12_Polymorphism;

//compile time 
class Addingtest {

    public int add(int a, int b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

//run time
class Bank {
    protected void intrest() {
        System.out.println("generall rate of intrest 5.5%");
    }
}

class Sbi extends Bank {
    @Override
    public void intrest() {
        System.out.println("sbi rate of interest is 7%");
    }
}

class Axis extends Sbi {
    @Override
    public void intrest() {
        System.out.println("Axis rate of interest is 9%");
    }
}

public class Implementation {
    public static void main(String[] args) {
        Addingtest obj = new Addingtest();
        System.out.println(obj.add(2, 3));
        System.out.println(obj.add(2, 3, 34));
        System.out.println(obj.add("deepak","Singh"));

        Bank b = new Bank();
        b.intrest();
        Sbi s  = new Sbi();
        s.intrest();
        Axis a = new Axis();
        a.intrest();



    }
}
