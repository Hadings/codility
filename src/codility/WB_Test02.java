package codility;
import java.util.Arrays;

public class WB_Test02 {
	 public boolean solution(int[] A) {
	        // write your code in Java SE 8
	        int[] B = new int[A.length];
	        
	        for(int i =0;i<A.length;i++){
	            B[i] = A[i];   
	        }
	        boolean ans = true;
	        Arrays.sort(B);
	        int count=0;
	        for(int i =0;i<A.length;i++){
	            if(B[i] != A[i]){
	                count++;
	            }
	        }
	        if(count <= 2){
	            return ans;    
	        }
	        else{
	            ans = false;
	            return ans;   
	        }
	                    
	    }
}
