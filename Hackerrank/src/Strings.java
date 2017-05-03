
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
	
	
}
