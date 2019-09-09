## Lab1 Cars
### Complex Objects Refresher
#### DUE: Sunday, September 16 at 10pm
#### Zip all files and submit via Moodle

<hr>

For today's lab you will be building upon the provided `Car` class to build the subclasses `SportsCar` and `EcoCar`, as well as adding an interface to calculate CO2 emissions. You can use the `Driver` class for testing. Follow the directions below, then answer the questions about the lab.

<hr>

#### 1. Create Interface _GreenHouseGasser_

- Create the interface GreenHouseGasser, which the `Car` class will be implementing. Recall that interfaces are like classes, except that they only declare the method signature, and any class _implementing_ the interface MUST define (i.e. implement) every method.

  ```java
  public interface GreenHouseGasser {
    public float CO2();
  }
  ```

- Modify the _Car_ class to implement the GreenHouseGasser interface. The emissions of any car is based on its current speed (mph) and some class-specific constant. A _Car_ will emit 1.5 units of CO2 per mph.

  ```java
  public class Car implements GreenHouseGasser {
    ...
  }
  ```

- Compile and test your code using `Driver`.

<hr>

#### 2. Modify Method Accelerate

- Rewrite the `accelerate()` method so that it has an integer parameter and uses a class member variable to determine the new speed.

  ```java
  public void accelerate(int seconds) {
    currentSpeed += milesPerSecond*seconds;
  }
  ```

- Create the member variable `milesPerSecond` and initialize it to 10.0f for `Car`. This is used in `accelerate()`.

- Compile and test your code using `Driver`.

<hr>

#### 3. Create a SportsCar Subclass

- Create the class `SportsCar` that is a subclass of `Car`. Only include methods that must override a method of the superclass.

  ```java
  class SportsCar extends Car {
    ...
  }
  ```

- Initialize acceleration to 20 miles per second.

- The SportsCar class emits 3.25 units of CO2 for every mph.

> Note: do not use a member variable to store the emission rate. Instead, hardcode this value in the method.

- Compile and test your code using `Driver`, making changes to the file as appropriate. Look closely -- did you get the correct acceleration and emission values?

<hr>

#### 4. Create an EcoCar Subclass

- Create the class `EcoCar` that is a subclass of `Car`. Only include methods that must override a method of the superclass.

  ```java
  class EcoCar extends Car {
    ...
  }
  ```

- Initialize acceleration to 2.5 miles per second.

- The EcoCar emits .33 units of CO2 for every mph.

- Compile and test your code using `Driver`, making changes to the file to test your new code. Look closely -- did you get the correct acceleration and emission values?

<hr>

#### 5. Answer Lab Questions

Answer the following questions, typing your answers into a file named:
  ```
  <yourlastname>_lab1.txt
  ```
and zip that up with the rest of your .java files to submit on Moodle.

1. What methods were you required to write for `SportsCar` and `EcoCar`?

2. The CO2 emission rate was hardcoded into each subclass, whereas the acceleration rate was a member variable in `Car`. Explain how this made implementation different for calculating acceleration versus emission.

3. Explain a significant advantage of using a member variable to calculate acceleration. (_You can contrast it with the CO2() method, if that helps._)
