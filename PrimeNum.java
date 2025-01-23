
public class PrimeNum {
	static boolean isprime(int n) {
	int count =0;
	for(int i=1;i<=n;i++) {
		if(n%i==0)
			count++;
    }
	if(count==2)
		return true;
	else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		if(isprime(n))
			System.out.println("prime");
		else
			System.out.println("not");

	}

}
