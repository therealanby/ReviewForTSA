import java.util.*;

public class LHM{
  public static void main(String[] args){
    Map<String, Integer> lhm = new LinkedHashMap<>();
    Map<String, Integer> hm = new HashMap<>();
    hm.put("three",3);
    hm.put("one", 1);
    hm.put("two", 2);
    hm.put("one", 1);


    lhm.put("three",3);
    lhm.put("one", 1);
    lhm.put("two", 2);
    lhm.put("one", 1);

    for(String s:hm.keySet()){
      System.out.println(s);
    }
    System.out.println();
    for(String s:lhm.keySet()){
      System.out.println(s);
    }
  }
}