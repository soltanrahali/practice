 import java. util. *;
 
public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strs={"eat","tea","tan","ate","nat","bat"};
		
		System.out.println(groupAnagrams(strs));
		
	}
	  public static List<List<String>> groupAnagrams(String[] strs) {
	        List<List<String>> groupedAnagrams=new ArrayList<>();
	        HashMap<String, List<String>> map=new HashMap<>();
	        
	        for(String current:strs) {
	        	char[] characters=current.toCharArray();
	        	Arrays.sort(characters);
	        	String sorted=new String(characters);
	        	
	        	if(!map.containsKey(sorted)) {
	        		map.put(sorted, new ArrayList<>());
	        	}
	        	map.get(sorted).add(current);
	        }
	        groupedAnagrams.addAll(map.values());
	        
	        
	        return groupedAnagrams;
	    }

}
