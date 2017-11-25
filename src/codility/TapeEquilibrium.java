package codility;

public class TapeEquilibrium {
	public static void main(String[] args){
		int A[] = {3,1,2,4,3};
		
		System.out.println(solution(A));
	}
	
	public static int solution(int[] A){
		int min = 999999;
		int left=0, right=0;
		for(int i =0;i<A.length-1;i++){
			left += A[i];
			right = Rsum(A,i+1);
			
			if(left - right < 0){
				if(min > (right - left)){
					min = right - left;
				}
			}else{
				if(min > (left - right)){
					min = left - right;
				}
			}
		}
		return min;
	}
	
	public static int Rsum(int[] A, int p){
		int right=0;
		for(int i =p;i<A.length;i++){
			right += A[i];
		}
		return right;
	}
}
//////////////////////////////////////////////////////////
class Solution {
    public int solution(int[] A) {
         // write your code in Java SE 8
        int min = 999999999;
        int N = A.length -1;
        int left = 0;
        int right = 0;
        for(int p = 0; p < N; p++) {
            if(p == 0) {
                left = A[p];
                right = this.rightSum(A, p);
            }
            else {
                int pp = A[p];
                left = left + pp;
                right = right - pp;
            }
                               
            //System.out.println("left:" + left + "right:" + right);
           
            int m =  left > right ? left - right : right - left;
            if(m<min) {
                min = m;
            }
        }
       
        return min;
    }  
   
    public int rightSum(int[] A, int p) {
        int result = 0;
        int N = A.length;
        for(int i=N; i>p+1; i--) {
            result = result + A[i-1];
        }
        return result;
    }
}
