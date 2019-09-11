public class Inheritance {

  public static void main(String[] args) {
    ObjectClass base_object_default = new ObjectClass();
    System.out.println( "Base default: ");
    base_object_default.Print();

    System.out.println();
    ObjectClass base_object_2_3 = new ObjectClass(2,3);
    System.out.println( "Base 2,3 : ");
    base_object_2_3.Print();

    System.out.println();
    Composed hasa_object_default = new Composed();
    System.out.println( "Composed default : ");
    hasa_object_default.Print();

    System.out.println();
    Derived isa_object_default = new Derived();
    System.out.println( "Derived default : ");
    isa_object_default.Print();

    /*
    System.out.println();
    Derived isa_object_4_5(4,5);
    System.out.println( "Derived 4,5 : ");
    isa_object_4_5.Print();
    */
  }
}
