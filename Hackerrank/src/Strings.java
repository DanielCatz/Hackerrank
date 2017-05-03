
public abstract class Strings {

	/***
	 * Generate every permutation of a string (repeating characters will make for dupes)
	 * Seed with empty prefix and string to permute
	 * @param prefix
	 * @param word
	 */
	public static void permuteString(String prefix, String word ){
		
		if(word.length() ==0){
			System.out.println(prefix);
		}
		
		for(int i = 0 ; i<word.length();i++){
			permuteString(prefix+word.charAt(i), word.substring(0, i)+word.substring(i+1,word.length()));	
		}
		
	}
	
	/***
	 * Iterative version of reverse String
	 * @param word
	 * @return
	 */
	public static String reverseString(String word){
		StringBuilder solution = new StringBuilder();
		
		for(int i = word.length()-1; i>=0;i--){
			solution.append(word.charAt(i));
		}
		System.out.print(solution.toString());
		return solution.toString();
	}
	
}
