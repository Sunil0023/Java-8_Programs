package com.lambda.methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StaticMethodReferenceMain {
	
    public static void main(String args[])
    {
 
        List<Integer> list=Arrays.asList(new Integer[] {1,2,3,4,5});
 
        // using traditional way overriding functional interface
        System.out.println("Using Traditional way/Anonymous class: ");
        Function<Integer,Integer> function1=new Function<Integer, Integer>() {
 
            @Override
            public Integer apply(Integer num) {
                return PowerFunction.power(num);
            }
        };
 
        List<Integer> calculatePowForList1 = PowerFunction.calculatePowOf2ForList(list, function1); 
        System.out.println(calculatePowForList1);
 
        // Using lambda expression
        System.out.println("Using lambda expression: ");
        Function<Integer,Integer> function2 = (num) -> PowerFunction.power(num);
 
        List<Integer> calculatePowForList2 = PowerFunction.calculatePowOf2ForList(list, function2); 
        System.out.println(calculatePowForList2);
 
        // Using Method reference
        System.out.println("Using Method Reference: ");
        Function<Integer,Integer> function3 = PowerFunction::power;
 
        List<Integer> calculatePowForList3 = PowerFunction.calculatePowOf2ForList(list, function3); 
        System.out.println(calculatePowForList3);
 
    }
}
