public class Stos<T>{
  Element<T> last;
  
  public Stos(){
    last = null;
  }
  
  public void push(T val){
    Element<T> added = new Element<T>(val , last);
    last = added;
  }

  public  String toString(){
    Element<T> tmp = last;
    String result = new String();
    while(tmp != null){
      result += "{" + tmp.getValue() +"} ";
      tmp = tmp.getNext();
    }
    return result;
  }

  public void pop(){
    if(last != null){
      last = last.getNext();
    }
  }

  


}
