public class DStester {

  public static void main(String[] args) {
    QueueArray<OrderElement> orders = new QueueArray<>();

    System.out.println("?Empty: "+orders.isEmpty());
    for (int i=0; i<6; i++) {
      orders.add(new OrderElement(i,12));
    }
    System.out.println("REMOVE "+orders.remove());
    orders.add(new OrderElement(6,12));

    //OrderElement oe;
    for (int i=0; i<6; i++) {
      System.out.println("REMOVE "+orders.remove());
    }

    // Can create a Queue and store anything in it
    System.out.println();
    QueueArray<Song> songs = new QueueArray<>();
    songs.add(new Song("Silver Line","Lykke Li"));
    System.out.println("?Empty: "+songs.isEmpty());
    songs.add(new Song("Truth Hurts","Lizzo"));
    songs.add(new Song("iMi","Bon Iver"));
  }
}
