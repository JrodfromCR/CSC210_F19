public interface QueueInterface<T> {
  /**
  Get the next item.
  @return Returns the element removed from the data structure.
  */
  public T remove();

  /**
  Add the element to the data structure.
  @param newElement The element to add.
  */
  public void add(T newElement);

  /**
  Determine if empty
  @return True if no elements in data structure.
  */
  public boolean isEmpty();

  /**
  Determine number of elements in data structure.
  @return number of elements in data structure.
  */
  public int length();

  /**
  Looks at next element to be removed (but doesn't remove it)
  @return copy of the Oldest/First element in the queue
  */
  public T peek();
}
