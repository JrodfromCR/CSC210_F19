class ObjectClass {

  private int var_a_;
  protected int var_b_;

  public ObjectClass() {
    var_a_ = 10;
    var_b_ = 15;
  }

  public ObjectClass(int a, int b) {
    var_a_ = a;
    var_b_ = b;
  }
  public void Print() {
    System.out.println( "in ObjectClass. ");
    System.out.println( "priv, prot =  " + var_a_ + " " + var_b_);
  }
}
