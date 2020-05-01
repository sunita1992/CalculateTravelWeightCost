package com.calculateTravelCost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class TestClass {


	// Driver code 
	public static void main (String[] args) throws NumberFormatException, IOException 
	{ 
		//  long price[] = { 300, 400, 600, 700 };

		/*int price[] = { 500,123,873 };
		int n = price.length; 

		CalculateTravelCost calculateTravelCost = new CalculateTravelCost();
		System.out.println(calculateTravelCost.minTravelCost(price, n));
*/		
		CalculateTravelCost calculateTravelCost = new CalculateTravelCost();
		List<Cases> testCases = new ArrayList<>();
		


		// Using Scanner for Getting Input from User 
		//Scanner in = new Scanner(System.in); 
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter number of test cases : ");
		int numberOfTestCases = Integer.parseInt(input.readLine()); 

		while (numberOfTestCases != 0) {
			System.out.println("Please enter number of persons for test case : ");
			int noOfPersons = Integer.parseInt(input.readLine()); 

			System.out.println("Please enter person weights for this test case separated by space : ");
			
			List<Integer> personweights = parseInputPersonWeights(input.readLine());
			Cases cases = new Cases(noOfPersons, personweights.toArray(new Integer[personweights.size()] ));
			testCases.add(cases);
			
			//reduce it by 1
			numberOfTestCases = numberOfTestCases - 1;
		}
		
	 

		

		
		for(Cases caseOne : testCases) {
			System.out.println("Given Case : "+caseOne);
			System.out.println("Minimum Cost : "+calculateTravelCost.minTravelCost(caseOne.getPrice(),caseOne.getNoOfPersons()));
		}

	} 

	
	private static List<Integer> parseInputPersonWeights(String weightPerson) {

		List<Integer> input =  null;
		try {
			System.out.println("Parsing given input : ");
			input = new ArrayList<>();
			StringTokenizer st = new StringTokenizer(weightPerson);
			while(st.hasMoreTokens()) {
				input.add(Integer.parseInt(st.nextToken()));
			}
		}catch(Exception e) {
			System.out.println("Occur error while parsing input : "+ weightPerson);
			e.printStackTrace();
			System.exit(0);
		}

		return input;
	}
}
