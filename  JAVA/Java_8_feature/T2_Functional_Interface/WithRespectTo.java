@FunctionalInterface
interface A{
    void method1();
}

@FunctionalInterface
interface B extends A{  // this will not give any error beacuse we define only one method in both interface A and B.
    void method1();
}


// @FunctionalInterface     // it will give error because we define two method in interface C. and we know that functional 
                            // interface only have one abstract method. if u dont want error just remove the functionInterface annotation.
// interface C extends B{
//     void method2();
// }



public class WithRespectTo {
    public static void main(String[] args) {
        
    }
}
