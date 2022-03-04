public class Element<T>{
  private T value;
  private Element<T> next;
  public Element(T val, Element<T> tmp){
    this.value = val;
    this.next = tmp;
  }

  public Element<T> getNext(){
    return next;
  }

  public T getValue(){
    return value;
  }
}