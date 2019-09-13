public class QueueLinked<T> implements QueueInterface<T> {

  private Node head = null;
  private Node tail = null;
  private int length = 0;

  private class Node
  {
      T data = null;
      Node next = null;
      Node(T entry)
      {
          data = entry;
      }
  }

  public QueueLinked() {
    // nothing to do so far
  }

  /**
  Get the oldest item in the queue.
  @return Returns the oldest element after removing it.
  */
  public T remove() {
    if (this.isEmpty()) return null;
    /* IIMPLEMENT THIS */
  }

  /**
  Add the element to the queue.
  @param newElement The element to add.
  */
  public void add(T newElement) {
    /* IMPLEMENT THIS */
  }

  /**
  Determine if empty
  @return True if no elements in data structure.
  */
  public boolean isEmpty() {
    /* IMPLEMENT THIS */
  }

  /**
  Determine number of elements in data structure.
  @return number of elements in data structure.
  */
  public int length() {
    return length;
  }
}
