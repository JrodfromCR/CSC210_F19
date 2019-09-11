### Understanding Class Composition and Inheritance

This is an exercise to help solidify your understanding of class composition and inheritance. You will experiment with using class methods and class members with varying access (e.g. public, private, and protected).

There are a total of 9 questions for you to consider, but you are not required to hand anything in. Throughout the exercise, you will be asked to comment and uncomment certain lines of code to see what happens.

### _Composed_ Class

The Composed has an ObjectClass object as a member variable (in other words, the Composed HAS-A ObjectClass object). To start with, the ObjectClass has member variables var_a_ and var_b_.

#### Accessing the Embedded Object

In turn, comment out each of the _println_ statements within the Print() member function in _Composed.java_, as shown below, and compile each time to see what happens. If the line will not compile, comment it again before trying the next line.

Q1. Attempting to print var_a_ and var_b_ will result in a compilation error, which seems reasonable. Briefly explain why it doesn't compile.

Q2. The Composed contains an ObjectClass object to which var_a_ and var_b_ belong, and yet when you try to print them out, those lines will not compile. Briefly explain why.

Q3. Composed probably needs to interact with object_ members. How will you give ComposedClass access (and don't say "make them public")?

```C++
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
```

#### Scoping

Uncomment the declaration of var_a_ and var_b_ inside the Composed definition so that it now too has these variables.

Q4. State which of the 4 'println' statements can now be successfully compiled? Briefly explain why they can now be compiled? And why doesn't the compiler get confused about which var_a_ and var_b_ is being referenced?

<hr>

### Derived

The Derived is inheriting from the ObjectClass (in other words, Derived IS-A ObjectClass). When you start this exercise, the ObjectClass has member variables var_a_ and var_b_, but the Derived class does not (or does it??).

In turn, uncomment each of the 'println' statements in _derived.java_, as shown below, and determine which successfully compiles.

Q5. For each line, explain why it does or does not compiles.


```C++
@Override
public void Print() {
  System.out.println( "in Derived... ");
  //System.out.println( "var_a_ " + var_a_);
  //System.out.println( "var_b_ " + var_b_);
  //System.out.println( "object var_a_ " + super.var_a_ );
  //System.out.println( "object var_b_ " + super.var_b_ );
  //super.Print();
}
```

#### Overriding Methods

Q6. How is it that you redefined _print()_ in Derived, and yet you can still call _print()_ in the ObjectClass? Isn't the print in the DerivedClass scope replacing the print in the ObjectClass? Explain how that works.


#### Initializing Objects

Q7. In main, the declaration of isa_object_4_5(4,5) is commented out because it will not compile. Why not? There is a constructor that takes 2 parameters for ObjectClass from which it derives.

Comment out the default constructor for ObjectClass (the one with no parameters). And since there is no longer a default constructor, comment out the first collection of statements in main() that declare the base_object_default and print it out. Also comment out the object_ and corresponding print statement 'object_.Print()" in Composed.

Q8. If you try to compile now, you will get an error in trying to declare a _Derived_ object. Why would removing the ObjectClass default constructor break the _Derived_ class?

### Constructors

- Consider if you **uncommented the declaration of var_a_ and var_b_** in Derived, then created a default constructor like this:

```java
public Derived() {
  super(1,2);
  var_a_ = 0;
  var_b_ = 0;
}
```

Q9. If you made the changes above, what would be the value printed out for each of these after instantiating a Derived object using `Derived()`:

```java
System.out.println( "var_a_ " + var_a_);
System.out.println( "var_b_ " + var_b_);
System.out.println( "object var_a_ " + super.var_a_ );
System.out.println( "object var_b_ " + super.var_b_ );
```
