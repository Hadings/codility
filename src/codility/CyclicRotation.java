package codility;

public class CyclicRotation {
	public static void main(String[] args){
		
		int aa[] = {3,8,9,7,6};
		int K = 3;
		
		aa = solution(aa,K);
		for(int i =0;i<aa.length;i++)
			System.out.println(aa[i]);
		
	}
	public static int[] solution(int[] A, int K) {
		int temp =0;
        int change=0;
        if(A.length > K){
            change = K;   
        }
        else{
            change = K - A.length;   
        }
        for(int i=0;i<A.length;i++){
            if( i+K > A.length){
            	temp = A[i+K - A.length];
            }
        }
		return A;
	}
}
