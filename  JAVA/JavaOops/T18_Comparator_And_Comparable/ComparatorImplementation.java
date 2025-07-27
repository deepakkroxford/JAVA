package T18_Comparator_And_Comparable;

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

// Comparator for sorting by Empno
class EmpnoComparator implements Comparator<Employe> {
    public int compare(Employe e1, Employe e2) {
        return e2.Empno - e1.Empno;  // Ascending order
    }

  
}
class NameComparator implements Comparator<Employe>{
    @Override
    public int compare(Employe e1,Employe e2)
    {
        return e1.name.compareTo(e2.name);
    }
}
public class ComparatorImplementation
{
    public static void main(String[] args) {
         ArrayList<Employe> e = new ArrayList<>();
        e.add(new Employe("Aman Singh", 34));
        e.add(new Employe("Deepak Singh", 304));
        e.add(new Employe("Harshit Singh", 324));
        e.add(new Employe("Sumit Singh", 94));
        e.add(new Employe("Amit Singh", 84));
        Collections.sort(e, new EmpnoComparator());
        System.out.println(e);

        ArrayList<Employe> e1 = new ArrayList<>(e);
        Collections.sort(e1,new NameComparator());
        System.out.println(e1);


       
    }
}
