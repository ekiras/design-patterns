#Builder Pattern

There may be scenarios where there is a class with many instance variables that may be needed to create an object of the class. For this you might have to create many overloaded constructors.

For Example we have a class NutritionFacts that has following instance variables
```java
    private int servingSize;
    private int servings;
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;
```
 Then to create the object of the class we can have constructors as follows
 ```java
  NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 0, 35, 27);
  NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 0);
  NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 35, 27);
 ```
 As shown in the code above, it is not clear from the code itself what constructor is called for setting values.

 > This is the best example where we should use Builder Pattern for Building our class objects.

Now, when using Builder Pattern we will be able to tell from the code itself what values are we setting for which instance variable.

For example, if the above constructor were replaces by the following code sample.
```java
     NutritionFacts facts = new NutritionFacts.Builder(100,10)
                .calories(785)
                .carbohydrate(452)
                .fat(24)
                .sodium(8)
                .build();
```

The above code is in itself readable and tells what values are we setting for variables.

## Advantages
This makes the setting of variables and paramaters very readable and less error prone.

## Disadvantages
1. If the number of paramaters are not  more than 4 or the number of required paramaters are more than this may not be the optimal solution since the cost of making builders will be more.
2. Another main disadvantage is that your builder should have same number of fields as the class itself, hence the duplicacy of code is more and you need to make changes to both class and Builder when adding or removing any field.