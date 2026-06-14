class LL{

  Node head;
  private int size;

  LL(){
    size = 0;
  }

// node class
public class Node{
  String data;
  Node next;

  Node(String data){
    this.data = data;
    this.next = null;
    size++;
  }

}

//add first
public void addFirst(String data){
  Node newNode = new Node(data);
  newNode.next = head;
  head = newNode;

}

// add last 
public void addLast(String data){
  Node newNode = new Node(data);
  if (head == null){
    head = newNode;
    return;

  }
  Node lastNode = head;
  while(lastNode.next != null){
    lastNode = lastNode.next;
  }
  lastNode.next = newNode;
}

// print list
public void printList(){
  Node currentNode = head;
  while(currentNode != null){
    System.out.print(currentNode.data + " -> ");
    currentNode = currentNode.next;
  }
  System.out.println("null");
}

// remove first
public void removeFirst(){
  if (head == null){
    System.out.println("Enpty list, nothing to delete");
    return;

  }
  head = this.head.next;
  size--;
}

// remove last
public void removeLast(){
  if (head == null){
    System.out.println("Empty List, nothing to delete");
    return;
  }
  size--;
  if (head.next == null){
    head = null;
    return;
  }

  Node currentNode = head;
  Node lastNode = head.next;
  while(lastNode.next != null){
    currentNode = currentNode.next;
    lastNode = lastNode.next;
  }
  currentNode.next = null;
}

// get size 

public int getSize(){
  return size;
}

  public static void main(String args[]){
    LL list = new LL();
    
    list.addLast("is");
    list.addLast("a");
    list.addLast("List");
    list.printList();

    list.addFirst("this");
    list.printList();
    System.out.println(list.getSize());

    list.removeFirst();
    list.printList();

    list.removeLast();
    list.printList();

    list.addInMiddle(2, "haaa");
    list.printList();

    

  }


  // insert at index
  public void addInMiddle(int index, String data){
    if(index > size || index < 0) {
      System.out.println("Invalid Index value");
      return;
    }
    size++;

    Node newNode = new Node(data);
    if(head == null || index == 0){
      newNode.next = head;
      head = newNode;
      return;
    }
    Node currentNode = head;
    for(int i=1; i< size; i++){
      if(i == index){
        Node nextNode = currentNode.next;
        currentNode.next = newNode;
        newNode.next = nextNode;
        break;
      }
      currentNode = currentNode.next;
    }
  }
}