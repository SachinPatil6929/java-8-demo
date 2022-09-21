package com.prowings.lambda_expression;

import java.util.Comparator;
import java.util.function.BiConsumer;

public class LambdaExpression {

	public static void main(String[] args) {
		LambdaExpression le = new LambdaExpression();
		le.add(2,6);
		
		
		BiConsumer<Integer, Integer> biConsumer = (a,b)->System.out.println(a+b);
		biConsumer.accept(8, 6);
		
		Comparator<String> c = (s1,s2)->s1.compareTo(s2);
		c.compare("Sachin", "Raj");
		
		

	}

	private void add(int i, int j) {
		System.out.println(i+j);
		
	}

}
