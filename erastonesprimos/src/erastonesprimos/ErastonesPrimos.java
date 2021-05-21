package erastonesprimos;
public class ErastonesPrimos {
	public static void main(String[] args) {
		
		int  num1 = 1;
		int  num2 = 200; 
		
		int primos[] = new int[num2];
	
		for(int i = 2; i<=num2;i++) {
			if((i>=2 && i%2==1 || i%5!=0 || i==5) && (Math.sqrt(i)%(int)Math.sqrt(i)!=0)) {	
				primos[i]=i;			
			}
		}
		
		for(int i = 0; i<primos.length;i++) {
			for(int j = 0; j<primos.length;j++) {
				if(primos[i]>0 && primos[j]/primos[i]>1 && primos[j]%primos[i]==0) {
					primos[j] = 0;
				}
			}
		}
		
		for(int i = 0;i<primos.length;i++) {
			if(primos[i]>=num1) {
				System.out.print(primos[i]+" ");
			}
		}
		
	}
}
	



