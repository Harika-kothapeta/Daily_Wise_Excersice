import java.util.ArrayList;
import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>(n);
		for(int i=0;i<n;i++)
		{
			a.add(s.nextInt());
		}
		for(int i=0;i<n;i++)
		{
			if(((i+1)%2==0))
			{
				sum+=a.get(i);
			}
		}
		
        System.out.println(sum);
	}

}
