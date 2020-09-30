package org.lkg.bs;

public class BS_0001_ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.solve("hello there my friend"));
		
		System.out.println("EFF:"+s.solveEff("hello there my friend"));
	
	}

}


class Solution {
    public String solve(String sentence) {
        if(sentence.length() >0) {
	        String[] s = sentence.split(" ");
	        int low =0, high = s.length-1;
	        while(low<high){
	            swap(s,low,high);
	            low ++ ;
	            high --;
	        }	
	        String result = "";
	        for(String l : s) {
	        	result = result+l+" ";
	        }
	        return result.trim();
        }
        
        return null;
    }
    
    public String solveEff(String sentence) {

    	//Using string builder to avoid n times of copying to a new string since strings are immutable
    	StringBuilder ans = new StringBuilder();
    	String[] ar = sentence.split(" ");
    	for (int i = ar.length - 1; i >= 0; i--) {
    		ans.append(ar[i]);
    		if (i != 0)
    			ans.append(" ");
    	}
    	return ans.toString();
    }

	public void swap(String[] s, int l, int h){
        if(l<=s.length && h<=s.length){
            String temp = s[l];
            s[l] = s[h];
            s[h] = temp;
        }
    }
}