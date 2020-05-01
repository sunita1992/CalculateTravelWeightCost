package com.calculateTravelCost;

import java.util.*; 

class CalculateTravelCost 
{ 
      
    // Function to return the minimum cost of total travel
    public int minTravelCost(Integer personWeights[], int numberOfPerson) 
    { 
      
        // Sort the person weight array 
        Arrays.sort(personWeights); 
          
        int totalCost = 0; 
      
 
        for (int i = numberOfPerson - 1; i > 1; i -= 2) 
        { 
            if (i == 2) 
            { 
                totalCost += personWeights[2] + personWeights[0]; 
            } 
            else
            { 
      
                int weightOne = personWeights[i] + personWeights[0] + 2 * personWeights[1]; 
                int weightTwo = personWeights[i] + personWeights[i - 1] + 2 * personWeights[0]; 
                totalCost += Math.min(weightOne, weightTwo); 
            } 
        } 
      
        // Calculate the minimum price of the two cheapest person 
        if (numberOfPerson == 1) 
        { 
            totalCost += personWeights[0]; 
        } 
        else
        { 
            totalCost += personWeights[1]; 
        } 
      
        return totalCost; 
    } 
      

} 
  