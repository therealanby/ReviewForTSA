import java.util.*;
class Queues {
  public static void main(String[] args) {
    Deque<Integer> queue = new ArrayDeque<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);

    System.out.println(queue.element());
    while(!queue.isEmpty()){
      System.out.println(queue.remove());
    }
  }
}