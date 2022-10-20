package JavaBasics;

import java.util.Random;

/* use random class (util) to generate random number */
public class RandomNumbers {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] arrName = new int[20];
		for (int i = 0; i < arrName.length; i++) {
			arrName[i] = rand.nextInt(20); // This will print the random numbers in the range of 1 to 20
		}
		for (int element : arrName) {
			System.out.println(element);
		}
		
		//method -2 : To use math.random function, math.random doesnpot accept any parameters
		// value ranges between 0.0 to 1.0
		System.out.println("-----------------\n"+Math.random());
	}
}
