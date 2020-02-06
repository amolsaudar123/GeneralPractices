## GeneralPractices
### Method Hiding

 * Can we override static method in Java?
  
 * As per the Java contracts, No!
 
 * Because, static methods are bonded during compile time using Type of reference variable, and not Object (These are the class methods and belongs to the class not object)
 
 * Static method can be overloaded, but can not be overridden
 
 * If you declare, another static method with same signature in derived class than static method of sub class will be hidden

 * Consider the Classes in com.method.hiding package: 

```java
            Parent obj = new Child();
            obj.main(new String[]{"Amol", "Saudar"});
```

- "obj" is the type of (reference variable is of) ```Parent``` but object of ```Child```. 

- But, static method is belongs to the class not to the object  

- So, here, ```obj.main(...)``` will call ```Parent``` class method

- Output will be:

```
This is Parent class static main method
```

*The version of a method that is executed will NOT be determined by the object that is used to invoke it. In fact it will be determined by the type of reference variable used to invoke the method.*

- visit:
    1. https://stackoverflow.com/questions/16313649/what-is-method-hiding-in-java-even-the-javadoc-explanation-is-confusing 
    2. https://javarevisited.blogspot.com/2013/03/can-we-overload-and-override-static-method-java.html