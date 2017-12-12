package hisNameIsPackageYesItIs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Number {
	
	public int prQuest;
	public static List<Long> coef = new ArrayList<Long>();
	List<Long> synchronizedpubliesdList = Collections.synchronizedList(coef);
	
	public Number(int prInput) {
		prQuest = prInput;
	}

	public boolean isPrime()
	{
		genCo(prQuest);
		
		int pelo = (int) Math.floor(prQuest/2) +1;
		 for (int i = 1; i < prQuest; i++)
		 {
			 System.out.println((coef.get(i)));
			 if (!((coef.get(i) % prQuest) == 0))
			 {
				 return false;
			 }
		 }
		 return true;
	}
	
	public void genCo(int powr)
	{
		 int pelo = (int) Math.floor(powr/2) +1;
		 for (int i = 0; i < powr; i++)
		 {
			 coef.add(f(powr, i));
		 }
	}
	
	public long f(long n, long k) {
		  if(k >  n)
		  {
		    //throw some_exception;
			  System.out.println("no please dont");
		  }
		  if(k == 0)
		  {
			  return 1;
		  }
		  if(k > n/2)
		  {
			  return f(n,n-k);
		  }
		  return (int) (n * f(n-1,k-1) / k);
		}
}  