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
    return(data.length == 0);
  }

  public void clear(){
    this.data = new String[0];
    this.size = 0;
  }

  public String toString(){
    String s = "[";
    for(int i=0; i<data.length; i++){
      if(i == 0)
        s = s + this.data[0];
      else
        s = s + ", " + this.data[i];
    }
    s += "]";
    return s;
  }

  public boolean contains(String _s){
    for(int i=0; i<data.length; i++){
      if(this.data[i].equals(_s));
        return true;
    }
    return false;
  }


}
