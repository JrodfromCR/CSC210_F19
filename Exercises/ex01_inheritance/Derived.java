class Derived extends ObjectClass {

  //private int var_a_;
  //private int var_b_;

  public void Print() {
    System.out.println( "in Derived... ");
    //System.out.println( "var_a_ " << var_a_);
    //System.out.println( "var_b_ " << var_b_);
    //System.out.println( "object var_a_ " + ObjectClass.var_a_ );
    //System.out.println( "object var_b_ " + ObjectClass.var_b_ );
    super.Print();
  }
}
