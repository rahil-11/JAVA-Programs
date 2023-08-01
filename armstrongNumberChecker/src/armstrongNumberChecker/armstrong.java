package armstrongNumberChecker;

public class armstrong {
public int checkArmstrong(int n,int count) {
	int arm=0;
	
	while(n!=0) {
		int rem=n%10;
	
		 arm+=(int)Math.pow(rem, count);
		//arm= (rem*rem*rem)+arm;
		n=n/10;
	
	}
	return arm;
}
}
