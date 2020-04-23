package LambdaExpression;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.*;


public class Stream {
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);
				
		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();
				
		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
	}

}
