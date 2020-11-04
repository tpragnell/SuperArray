public class SuperArray{
  private String[] data;
  private int size;
  private int index;

  public SuperArray(){
    this.data = new String[10];
    this.size = 10;
    this.index = 0;
  }

  public int size(){
    return this.index;
  }

  public boolean add(String _element){
    if(this.index+1 == size)
      resize();
    this.data[this.index] = _element;
    this.index++;
    return true;
  }

  public String get(int _index){
    if(_index > size)
      return "";
    return this.data[_index];
  }

  public String set(int _index, String _element){
    if(_index > size)
      return "";
    String s = this.data[_index];
    this.data[_index] = _element;
    return s;
  }

  private void resize(){
    String[] newArray = new String[size+10];
    for(int i=0; i<size; i++){
      newArray[i] = this.data[i];
    }
    this.data = newArray;
    size += 10;
  }

}
