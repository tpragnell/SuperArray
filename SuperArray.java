public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    this.data = new String[10];
    this.size = 0;
  }

  public int size(){
    return this.size;
  }

  public boolean add(String _element){
    if(this.size == data.length)
      resize();
    this.data[this.size] = _element;
    this.size++;
    return true;
  }

  public String get(int _index){
    if(_index >= size)
      return "";
    return this.data[_index];
  }

  public String set(int _index, String _element){
    if(_index >= data.length)
      return "";
    String s = this.data[_index];
    this.data[_index] = _element;
    return s;
  }

  private void resize(){
    String[] newArray = new String[data.length+10];
    for(int i=0; i<data.length; i++){
      newArray[i] = this.data[i];
    }
    this.data = newArray;
  }

  public boolean isEmpty(){
    if(data.length == 0)
      return true;
    return false;
  }

  public void clear(){
    for(int i=0; i<data.length; i++){
       this.data[i] = "";
    }
    String[] emptyArray = new String[0];
    this.data = emptyArray;
    this.size = 0;
  }

  public String toString(){
    String s = "[";
    String empty = "[]";
    if(isEmpty())
      return empty;
    s += this.data[0];
    for(int i=1; i<data.length; i++){
      s = s + ", " + this.data[i];
    }
    s += "]";
    return s;
  }


}
