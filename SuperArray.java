public class SuperArray{
  private String[] data;
  private int size;
  private int capacity;

  public SuperArray(int _initialCapacity){
    if (_initialCapacity < 0) {
      throw new IllegalArgumentException("InitialCapacity " + _initialCapacity
      + " cannot be negative");
        }
    capacity = _initialCapacity+1;
    data = new String[_initialCapacity];
    size = 0;
  }

  public SuperArray(){
    //this(0);
    this.data = new String[0];
    this.size = 0;
    capacity = 10;
  }

  public int size(){
    return size;
  }

  public boolean add(String _element){
    if(size == data.length)
      resize();
    data[size] = _element;
    size++;
    return true;
  }

  public void add(int _index, String _element){
      if(_index > size || _index < 0){
        //add(_element);
        throw new IndexOutOfBoundsException("Index " + _index + " is out of bounds in add");
      } else{
        if(size == data.length)
          resize();
        for(int i=size; i>_index; i--){
          data[i] = data[i-1];
        }
        size++;
        data[_index] = _element;
      }
  }

  public String remove(int _index) {
    if(_index >= size || _index < 0){
      throw new IndexOutOfBoundsException("Index " + _index + " is out of bounds in remove");
    }
    String s = data[_index];
    for(int i=_index; i<size; i++){
      data[i] = data[i+1];
    }
    size--;
    return s;
  }

  public String get(int _index){
    if(_index >= size || _index < 0)
      throw new IndexOutOfBoundsException("Index "+ _index + " is out of bounds in get!");
    return data[_index];
  }

  public String set(int _index, String _element){
    if(_index >= size || _index < 0)
      throw new IndexOutOfBoundsException("Index "+ _index + " is out of bounds in set!");
    String s = data[_index];
    data[_index] = _element;
    return s;
  }

  private void resize(){
    String[] newArray = new String[data.length+capacity];
    for(int i=0; i<data.length; i++){
      newArray[i] = data[i];
    }
    data = newArray;
  }

  public boolean isEmpty(){
    return(size == 0);
  }

  public void clear(){
    data = new String[0];
    size = 0;
  }

  public String toString(){
    String s = "[";
    for(int i=0; i<size; i++){
      if(i == 0)
        s = s + data[0];
      else
        s = s + ", " + data[i];
    }
    s = s + "]";
    return s;
  }

  public boolean contains(String _s){
    for(int i=0; i<size; i++){
      if(data[i].equals(_s))
        return true;
    }
    return false;
  }

  public int indexOf(String _s){
    for(int i=0; i<size; i++){
      if(data[i].equals(_s))
        return i;
    }
    return -1;
  }

  public String[] toArray(){
    String[] copy = new String[size];
    for(int i=0; i<size; i++){
      copy[i] = data[i];
    }
    return copy;
  }

  public int lastIndexOf(String _value){
    for(int i=size-1; i>=0; i--){
        if(data[i].equals(_value))
        return i;
    }
    return -1;
  }

  public boolean equals(SuperArray _other) {
    if (size != _other.size())
      return false;
    for (int i = 0; i < size; i++){
      if (!data[i].equals(_other.get(i)))
        return false;
    }
    return true;
  }


}
