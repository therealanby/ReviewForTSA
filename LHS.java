import java.util.*;

public class LHM{
  public static void main(String[] args){
    Set<String> s = new HashSet<>();
    Set<String> ls = new LinkedHashSet<>();

    s.add("bob");
    s.add("joe");
    s.add("mary");
    s.add("joseph");
    s.add("doggo");

    ls.add("bob");
    ls.add("joe");
    ls.add("mary");
    ls.add("joseph");
    ls.add("doggo");

    Iterator<String> it = s.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
    System.out.println();
    it = ls.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
  }
}