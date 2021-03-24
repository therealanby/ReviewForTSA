import java.util.*;
class Traversals {
  static class Tree {
    Tree right;
    Tree left;
    int val;
    Tree(){

    }
    Tree(int v){
      this.val = v;
    }
  }

  public static void main(String[] args) {
    Tree head = new Tree(1);
    Tree right = new Tree(3);
    Tree left = new Tree(2);
    Tree rRight = new Tree(7);
    Tree lRight = new Tree(6);
    Tree lLeft = new Tree(4);
    Tree rLeft = new Tree(5);

    right.right = rRight;
    right.left = lRight;
    left.right = rLeft;
    left.left = lLeft;

    head.right = right;
    head.left = left;

    lot(head);
    System.out.println();
    iotI(head);
    System.out.println();
    potI(head);
    System.out.println();
    protI(head);

    /*

            1
          2   3
        4  5 6  7 
    */
  }
  //////////////// 4 2 5 1 6 3 7
  public static void iotR(Tree t){
    if(t!=null){
      iotR(t.left);
      System.out.println(t.val);
      iotR(t.right);
    }
  }
  public static void iotI(Tree t){
    Deque<Tree> s = new ArrayDeque<>();
    Tree temp = t;
    while(!s.isEmpty()||temp!=null){
      while(temp!=null){
        s.push(temp);
        temp = temp.left;
      }
      temp = s.pop();
      System.out.println(temp.val);
      temp = temp.right;
    }
  }
  ///////////////// 4 5 2 6 7 3 1
  public static void potR(Tree t){
    if(t!=null){
      potR(t.left);
      potR(t.right);
      System.out.println(t.val);
    }
  }
  public static void potI(Tree t){
    Deque<Tree> s = new ArrayDeque<>();
    Deque<Integer> tracker = new ArrayDeque<>();
    s.push(t);
    Tree temp = t;
    while(!s.isEmpty()){
      temp = s.pop();
      tracker.push(temp.val);
      if(temp.left!=null){
        s.push(temp.left);
      }
      if(temp.right!=null){
        s.push(temp.right);
      }
    }
    while(!tracker.isEmpty()){
      System.out.println(tracker.pop());
    }
  }
  ///////////////// 1 2 4 5 3 6 7 
  public static void protR(Tree t){
    if(t!=null){
      System.out.println(t.val);
      protR(t.left);
      protR(t.right);
    }
  }
  public static void protI(Tree t){
    Deque<Tree> s = new ArrayDeque<>();
    s.push(t);
    Tree temp = t;
    while(!s.isEmpty()){
      temp = s.pop();
      System.out.println(temp.val);
      if(temp.right!=null){
        s.push(temp.right);
      }
      if(temp.left!=null){
        s.push(temp.left);
      }
    }
  }
  /////////////////// 1 2 3 4 5 6 7
  public static void lot(Tree t){
    Deque<Tree> d = new ArrayDeque<>();
    d.add(t);
    Tree temp = t;
    while(!d.isEmpty()){
      temp = d.remove();
      System.out.println(temp.val);

      if(temp.left!=null){
        d.add(temp.left);
      }
      if(temp.right!=null){
        d.add(temp.right);
      }
    }
  }
}