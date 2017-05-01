import java.util.HashMap;
import java.util.Map;

public class General {
	public static int mostFrequentIntegerInArray(int[] arr){
		HashMap<Integer,Integer> solution = new HashMap<>();		
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
	
	
}
