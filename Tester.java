public class Tester{

  public static void main(String[] args){
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
  }
}
