
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employe
{
    String name;
    int Empno;
    Employe(String name, int Empno)
    {
        this.name=name;
        this.Empno=Empno;
    }
    public String toString()
    {
        return name+" "+Empno;
    }
}
public class UsingLmabdaexpreesionPrintOwnObject {
    public static void main(String[] args) {
        ArrayList<Employe> e = new ArrayList<>();
        e.add(new Employe("Aman Singh", 34));
        e.add(new Employe("Deepak Singh", 304));
        e.add(new Employe("Harshit Singh", 324));
        e.add(new Employe("Sumit Singh", 94));
        e.add(new Employe("Amit Singh", 84));
        System.out.println(e);
        
        //now i want to sort in asending order based on the empno
        Comparator<Employe> c =  (i1, i2) -> (i1.Empno < i2.Empno) ? -1 : (i1.Empno > i2.Empno) ? 1 : 0;
        Collections.sort(e,c);
        
        System.out.println(e);

        // we can also do like this
        Collections.sort(e,(e1,e2)->(e1.Empno<e2.Empno)?-1:(e1.Empno>e2.Empno)?1:0);
        System.out.println(e);

        //now we want to sort on the basis of alphabetical order comapre to method is used to sort in 
        //alphabetical order
        Collections.sort(e,(e1,e2)->e1.name.compareTo(e2.name));
        System.out.println(e);


        


        



    }
}
