public class QueueArray<T> implements QueueInterface<T> {

  /** Array to store items in queue */
  private T[] items;

  /** The maximum size of the array for all queues */
  private static int DEFAULT_CAPACITY = 5;

  /** The size/capacity of the instance array (set to default) */
  private int size;

  /** The number of items in the array */
  private int length;

  /** The index of the element at front of queue */
  private int head;

  /** An index indicating where to insert the next item */
  private int tail;

  /**
  QueueArray constructor initializes empty array of type T and with "size" capacity
  */
  public QueueArray() {
    // Initialization and comment from Frank Carrano: Data Structures
    // The cast is safe because the new array contains null entries
    @SuppressWarnings("unchecked")
    T[] tempArray = (T[])new Object[DEFAULT_CAPACITY];
    items = tempArray;
    size = DEFAULT_CAPACITY;
    length = 0;
    head = 0;
    tail = 0;
  }

  /**
  Get the first item in the queue.
  @return Returns the oldest/first element after removing it from queue.
  */
  public T remove() {
    if (this.isEmpty()) return null;
    int currentHead = head;
    head = (head+1) % size;
    length--;
    return items[currentHead];
  }

  /**
  Add the element of type T to the queue at the end.
  @param newElement The element of type T to add.
  */
  public void add(T newElement) {
    System.out.print("ADD "+newElement);
    if (length==size) {
      System.out.println(" ERROR. Full.");
    } else {
      items[tail] = newElement;
      tail = (tail+1)%size;
      length++;
      System.out.println();
    }
  }

  /**
  Determine if empty
  @return True if no elements in data structure.
  */
  public boolean isEmpty() {
    return (length==0);
  }

  /**
  Get number of elements in data structure.
  @return number of elements in data structure.
  */
  public int length() {
    return length;
  }

  /**
  Looks at next element to be removed (but doesn't remove it)
  @return copy of the Oldest/First element in the queue
  */
  public T peek() {
    /* IMPLEMENT THIS */
    T item;
    return item;
  }
}
