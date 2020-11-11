import java.util.Arrays;

public class Tester{

  public static void main(String[] args){

    /* Homework 15
    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    // Test size function
    System.out.println(  "Size is " + words.size());
    // Test get function
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
    // Test set function
    System.out.println( words.set(2, "replacement") );
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
    // Test resize function by exceeding limit
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
    // Test clear and isEmpty
    words.clear();
    System.out.println(words.toString());
    System.out.println("Is it empty? "+words.isEmpty()); // Should be true
    words.add("hi");
    System.out.println("Is it empty? "+words.isEmpty()); // Should be false
    // Test toString
    System.out.println(words.toString());
    // Test contains
    System.out.println("Does it contain hi? "+words.contains("hi")); // Should be true
    // Test add v2
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    System.out.println(words.toString());
    // Insertion should be in slot 2
    words.add(2, "Insertion");
    System.out.println(words.toString());
    // Insertion should be in last slot due to _index > size
    words.add(8, "Insertion");
    System.out.println(words.toString());
    // Test remove
    System.out.println("Removed "+words.remove(2));
    System.out.println(words.toString());
    System.out.println("Removed "+words.remove(8));
    System.out.println(words.toString());
    // Test indexOf
    System.out.println(words.indexOf("kani"));
    System.out.println(words.indexOf("hello"));
    // Test toArray (should just be copy)
    System.out.println(Arrays.toString(words.toArray()));
    */

    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");

    try{
      SuperArray a = new SuperArray(-5);
      System.out.println("IllegalArgumentException should've thrown!");
    } catch(IllegalArgumentException e){
      System.out.println("IllegalArgumentException thrown! " + e.getMessage());
    }
    try{
      words.get(-10);
      System.out.println("IndexOutOfBoundsException should've thrown!");
    } catch(IndexOutOfBoundsException e){
      System.out.println("IndexOutOfBoundsException thrown! " + e.getMessage());
    }
    try{
      words.get(5);
      System.out.println("IndexOutOfBoundsException should've thrown!");
    } catch(IndexOutOfBoundsException e){
      System.out.println("IndexOutOfBoundsException thrown! " + e.getMessage());
    }
    try{
      words.set(-10, "Hello");
      System.out.println("IndexOutOfBoundsException should've thrown!");
    } catch(IndexOutOfBoundsException e){
      System.out.println("IndexOutOfBoundsException thrown! " + e.getMessage());
    }
    try{
      words.set(11, "Hello");
      System.out.println("IndexOutOfBoundsException should've thrown!");
    } catch(IndexOutOfBoundsException e){
      System.out.println("IndexOutOfBoundsException thrown! " + e.getMessage());
    }
    try{
      words.add(-10, "Hello");
      System.out.println("IndexOutOfBoundsException should've thrown!");
    } catch(IndexOutOfBoundsException e){
      System.out.println("IndexOutOfBoundsException thrown! " + e.getMessage());
    }
    try{
      words.add(11, "Hello");
      System.out.println("IndexOutOfBoundsException should've thrown!");
    } catch(IndexOutOfBoundsException e){
      System.out.println("IndexOutOfBoundsException thrown! " + e.getMessage());
    }
  }

}
