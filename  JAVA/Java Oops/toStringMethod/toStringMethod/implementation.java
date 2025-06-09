
class Frog {
    String name;
    int id;

    public Frog(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {

        // Optimize way to do that is
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        return sb.toString();

        // return id + ": " + name; // this will create a multiple object take more
        // space beacause it is string when ever we make the change it will take a extra
        // space.

        // return String.format("%6d : %s", id, name); // the meaning of 6 -> how many
        // space u want first and d donate integer value,

    }
}

public class implementation {
    public static void main(String[] args) {
        Frog frog = new Frog("Deepak Kumar Singh", 1);
        // System.out.println(frog); // if we call like this and there is no toString
        // method in the class it gives the hashcode a
        // otherwise it invokes the toString() method directly . toString() method are
        // present in the object class. and the object class
        // is the parent class of the all the class that we create .

        System.out.println(frog);// <-- This internally does: frog.toString()

    }
}
