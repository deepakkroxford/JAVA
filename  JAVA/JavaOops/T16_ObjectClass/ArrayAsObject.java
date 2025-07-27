package T16_ObjectClass;

class Boss {
    String name;
    int usn;
    int age;

     Boss(String name, int usn, int age){
        this.name = name;
        this.usn = usn;
        this.age = age;
     }
    public String toString() {
        return name + " " + usn + " " + age;
    }
}

public class ArrayAsObject {
    public static void main(String[] args) {
    
        Boss [] b = new Boss[5];
        b[0] = new Boss("Alice", 1, 30);
        b[1] = new Boss("Bob", 2, 28);
        b[2] = new Boss("Charlie", 3, 25);
        b[3] = new Boss("David", 4, 35);
        b[4] = new Boss("Eve", 5, 32);

        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }
        
    }
}
