public class OrderElement {

  static int totalOrderCount = 0;

  protected int customerID;
  protected int orderNumber;
  protected int itemNumber;

  public OrderElement(int cID, int item) {
    customerID = cID;
    totalOrderCount++;
    orderNumber = totalOrderCount;
    itemNumber = item;
  }

  public String toString() {
    return ("Order#"+orderNumber+": Customer#"+customerID+" ordered item#"+itemNumber);
  }

  public int getItem() { return itemNumber; }
  public int getCustomerID() { return customerID; }
  public int getOrderID() { return orderNumber; }
}
