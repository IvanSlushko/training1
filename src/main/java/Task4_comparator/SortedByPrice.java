package Task4_comparator;

import java.util.Comparator;

class SortedByPrice implements Comparator<Kniga> {
    
    public int compare(Kniga obj1, Kniga obj2) {
         
          double price1 = obj1.getPrice();
          double price2 = obj2.getPrice();

          if(price1 > price2) {
                 return 1;
          }
          else if(price1 < price2) {
                 return -1;
          }
          else {
                 return 0;
          }
    }
}
