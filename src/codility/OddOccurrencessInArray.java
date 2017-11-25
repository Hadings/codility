package codility;


public class OddOccurrencessInArray {
	public static void main(String[] args){
		int aa[] = {9,3,9,3,9,7,9};
		
		System.out.println(solution(aa));
	}
	public static int solution(int[] A) {
     // write your code in Java SE 8
     
		int ans=0;
		for(int i=0;i<A.length;i++){
			ans = ans ^ A[i];
		}
		return ans;
	}
}