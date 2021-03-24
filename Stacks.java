import java.util.*;
class Stacks {
  public static void main(String[] args) {
    Deque<Integer> stack = new ArrayDeque<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);

    System.out.println(stack.peek());//view but no delete top

    while(!stack.isEmpty()){
      System.out.println(stack.pop());//gets and removes
    }

  }
}