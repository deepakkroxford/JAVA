package T4_Constructor;

class College {
    String name;
    String branch;
    int fee;

    College () {
        this("aman singh", "ise"); // it call the paramertrize the constructor
        this.fee = 221;
        System.out.println("Default constructor called");

    }

    College (String name, String branch) {
       this.name = name;
       this.branch=branch;

       System.err.println("parametrize is call");
    }

    public void showDetail() {
        System.out.println("the name is: "+ name + " and branch is:  " + branch  + " and fee is: " + fee);
    }
}


public class Constructor_Chaining {
    public static void main(String[] args) {
        College c1  = new College();
        c1.showDetail();
    }
}
