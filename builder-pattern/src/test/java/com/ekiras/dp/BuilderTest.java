package com.ekiras.dp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author ekiras
 */
public class BuilderTest {

    @Test
    public void testBuilderPattern(){

        NutritionFacts facts = new NutritionFacts.Builder(100,10)
                .calories(785)
                .carbohydrate(452)
                .fat(0)
                .build();
        assert facts!=null:"Object can not be null";
        assert facts.getCalories()==785:"Calorie count does not match input value";
        assert facts.getCarbohydrate()==452:"Carbohydrate count does not match input value";
        assert facts.getFat()==0:"Fat count does not match input value";
        assert facts.getSodium()==0:"Fat count does not match input value";
        assert facts.getServingSize()==100:"No of Servings count does not match input value";
        assert facts.getServings()==10:"Servings count does not match input value";
    }



}