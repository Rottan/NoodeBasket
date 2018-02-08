public class Basket {
  private   Node head = null;
  private   Node tail = null;
  public Integer size = 0;

  public void add(Node node){
      if (head == null){
          head = node;
          head.setNext(tail);
          size++;
      }
      else if (tail == null){
          tail = node;
          tail.setNext(null);
          head.setNext(tail);
          size++;
      }
      else {
          node.setNext(tail);
          tail = node;
          head.setNext(tail);
          size++;

      }
  }

  public void printHead(){
      System.out.println("głowa "+ head);{ }
  }
  public void printTail(){
        System.out.println("ogon " + tail);
    }

    public void printAll(){
      Node current = head;
      System.out.println("łeb " +current);
      while (current.getNext() != null){
          current = current.getNext();
        System.out.println(current);

    }
 }
 public void getSize() {
     System.out.println("rozmiar " + size);
 }
}
