package com.Java8.Task;

import java.util.Arrays;
public class averageIntegers{
	double Average(int[] list) {
		return Arrays.stream(list).mapToDouble(i -> (double)i).average().getAsDouble();
	}
}