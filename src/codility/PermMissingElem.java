package codility;

public class PermMissingElem {
	public static void main(String[] args){
		
		
	}
	
	public static int solution(int[] A){
		long N = A.length + 1;
        long total = N * (N + 1) / 2;

        for (int i : A) {

            total -= i;
        }

        return (int)total;
	}
}
