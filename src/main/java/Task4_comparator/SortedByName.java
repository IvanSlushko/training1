package Task4_comparator;

import java.util.Comparator;

class SortedByName implements Comparator<Kniga> {
    
    public int compare(Kniga obj1, Kniga obj2) {
         
          String str1 = obj1.getName();
          String str2 = obj2.getName();
         
          return str1.compareTo(str2);
    }
}