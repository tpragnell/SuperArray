public class Demo{
  public static void removeDuplicates(SuperArray _s){
    int s = _s.size();
    for(int i=0; i<s-1; i++){
      for(int k=s-1; k>i; k--){
        if(_s.get(i).equals(_s.get(k))){
          _s.remove(k);
          s--;
        }
      }
    }
  }
  public static SuperArray findOverlap(SuperArray _a, SuperArray _b){
    int s = _a.size();
    SuperArray overlap = new SuperArray();
    for(int i=0; i<s; i++){
      if(_b.contains(_a.get(i)))
        overlap.add(_a.get(i));
    }
    removeDuplicates(overlap);
    return overlap;
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

    SuperArray a = new SuperArray();
    SuperArray b = new SuperArray();
    a.add("9");
    a.add("1");
    a.add("2");
    a.add("2");
    a.add("3");
    a.add("4");

    b.add("0");
    b.add("4");
    b.add("2");
    b.add("2");
    b.add("9");

    System.out.println(findOverlap(a,b).toString());

    System.out.println(a.lastIndexOf("2"));
  }
}
