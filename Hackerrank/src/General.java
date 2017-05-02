import java.util.HashMap;
import java.util.Map;

public class General {
	
	public static HashMap<Integer,Integer> fibMap = new HashMap<>(); 
	
	
	/***
	 * Find the most frequent integer in an array
	 * @param arr
	 * @return
	 */
	public static int mostFrequentIntegerInArray(int[] arr){
		HashMap<Integer,Integer> solution = new HashMap<>();		
		if(arr==null|| arr.length==0){
			throw new IllegalArgumentException();
		}
		
		for(int i = 0; i< arr.length;i++){
			if(solution.containsKey(arr[i])){
				solution.put(arr[i], solution.get(arr[i])+1);
			}
			else{
				solution.put(arr[i],1);
			}
		}		
		int max=0;
		int value=0;		
		for(Map.Entry<Integer,Integer> entry : solution.entrySet()){
			if(entry.getValue()>value){
				max = entry.getKey();
				value = entry.getValue();
			}
		}		
		return max;// Time: n, Space n
	}
	/***
	 * Find pairs in an integer array whose sum is equal to 10 (bonus: do it in linear time)
	 * assume unsorted
	 * @param value
	 * @param arr
	 * @return
	 */
	public static int[] findPairThatSumTo(int value, int[] arr){
		
		//if sorted, work my way towards the middle
		int start = 0;
		int end = arr.length-1;
		while(start<end){
			if(arr[start]+arr[end] == value){
				int[] solution ={arr[start],arr[end]};
				return solution;
			}else if(arr[start]+arr[end]< value){
				start++;
			}else{
				end--;
			}
		}
		return null;
	}
	
	/***
	 * Get nth term of fib, recursive dp optimization
	 * @param n
	 * @return
	 */
	public static int fib(int n){
		//Write fibbonaci iteratively and recursively (bonus: use dynamic programming)
	
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		if(!fibMap.containsKey(n)){
			fibMap.put(n,fib(n-1)+fib(n-2) );
		}
		
		return fibMap.get(n);
	
	}
	
	
}
