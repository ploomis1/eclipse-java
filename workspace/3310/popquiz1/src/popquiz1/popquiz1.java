package popquiz1;

public class popquiz1 {
	
	public static void main(String[] args){
		int hello=200;
		int hi=100;
		int result=sum(hi);
		System.out.println(result);
		
		
		
		
		
	}
	public static int sum( int n){
		
		if(n==0){
		return 0;	
			
		}
		else if( n==1){
			return 1;
		}
		else{
			
		
			return sum(n-1)+sum(n-2);
					 
		}
		
	}


}
