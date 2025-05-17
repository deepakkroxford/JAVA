package Generics.ClassAndMethod;

class Pair<T,U> {
    private T name;
    private U age;

    public Pair(T name, U age) {
        this.name = name;
        this.age = age;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getName(){
        return name;
    }

    public void setAge(U age) {
        this.age = age;
    }

    public U getAge() {
        return age;
    }

}

public class Example1 {
    public static void main(String[] args) {
        /**
         * Create a generic class Pair
         * Stores two values of any type (T and U).
         * Add getters and setters for both values.
         */

         Pair<String, Integer> p1= new Pair<>("Deepak Kumar Singh", 23);
         System.out.println(p1.getName());
         System.out.println(p1.getAge());

         p1.setName("Dipu");
         p1.setAge(24);

         System.out.println(p1.getName());
         System.out.println(p1.getAge());

    }
}
