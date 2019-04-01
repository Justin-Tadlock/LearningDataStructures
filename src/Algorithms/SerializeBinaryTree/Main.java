package Algorithms.SerializeBinaryTree;

import AuxPkg.MyNode;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    // Get the serialized string
    String serializedTree = serializeTree(initTree());
    System.out.println(serializedTree);
    
    // Use the serialized string to get a binary tree back
    MyNode deSerialized = deserializeTree(serializedTree);
    
    // Print the serialized string of the found tree to verify it deserialized correctly.
    System.out.println(serializeTree(deSerialized));
  }
  
  /*
      A serialized tree will use -1 as the representation of a null node
   */
  public static String serializeTree(MyNode n) {
    StringBuilder sb = new StringBuilder();
    
    if(n == null) {
      sb.append("-1 ");
    }
    else {
      sb.append(n._value + " ");
      sb.append(serializeTree(n._left));
      sb.append(serializeTree(n._right));
    }
    
    return sb.toString();
  }
  
  /*
      To deserialize a string and return a binary tree,
      we take the string and break it up into integers.
      Once the integers are placed in an array, we then begin recursively
      assigning the values to nodes and build out a binary tree
   */
  public static MyNode deserializeTree(String str) {
    ArrayList<Integer> arr = new ArrayList<>();
    
    Scanner s = new Scanner(str);
    
    // Get all the integers from the string
    while(s.hasNext()) {
      arr.add(s.nextInt());
    }
    
    // return the binary tree
    return deserializeHelper(arr);
  }
  
  /*
      Helper method to build out the binary tree from the array of integers given.
   */
  private static MyNode deserializeHelper(ArrayList arr) {
    if(!arr.isEmpty())
    {
      MyNode n = new MyNode();
      
      int val = (int)arr.get(0);
      arr.remove(0);
      if(val != -1)
      {
        n._value = val;
        n._left = deserializeHelper(arr);
        n._right = deserializeHelper(arr);
      }
      else {
        return null;
      }
      
      return n;
    }
    
    return null;
  }
  
  public static MyNode initTree()
  {
    MyNode root = new MyNode(10);
    root._left = new MyNode(7, new MyNode(1), new MyNode(2));
    root._right = new MyNode(15, null, new MyNode(17));
    
    return root;
  }
}
