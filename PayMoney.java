package Algorithms;

public class PayMoney {
  public int no_of_days(int[] transctions,int target) {
	for(int i = 0;i<transctions.length;i++) {
		   if(transctions[i]== target || target < transctions[i])
             return i+1;
	 else {
	         target = target - transctions[i];
}
  }
	  return -1;
	 
}
  
  
}
