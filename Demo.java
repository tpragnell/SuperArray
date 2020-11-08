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
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);  }
}
