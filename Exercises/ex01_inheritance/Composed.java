class Composed {

  private ObjectClass object_ = new ObjectClass();
  //private int var_a_;
  //protected int var_b_;

  public void Print() {
    System.out.println( "in Composed... " );;
    //System.out.println( "var_a_ " + var_a_ );;
    //System.out.println( "var_b_ " + var_b_ );;
    //System.out.println( "object var_a_ " + object_.var_a_ );;
    //System.out.println( "object var_b_ " + object_.var_b_ );;
    object_.Print();
  }
}
