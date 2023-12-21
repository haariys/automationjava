package automationjava.automationjava;

public class Practice {

	public void findMin(int[] arr)
	{
		int minimum=arr[0];
		for(int num:arr)
		{
			if(num<minimum)
				minimum=num;
		}
	System.out.println("minimum number == "+ minimum);

	}

	public void findMax(int[] arr)
	{
		int maximum=arr[0];
		for(int num:arr)
		{
			if(num>maximum)
				maximum=num;
		}
	System.out.println("max number == "+ maximum);
	}

	public void reverse(int[] arr)
	{
		int temp;
		for(int i =0;i<arr.length/2;i++)
		{
			temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
				
		for(int n :arr)
		{
			System.out.print(n);
		}
	}
	
	public void sort(int[] arr)
	{
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int k=i+1;k<arr.length;k++)
			{
				if(arr[i]<arr[k])
				{
					temp=arr[k];
					arr[k]=arr[i];
					arr[i]=temp;
				}
			}

		}
		for(int n :arr)
		{
			System.out.print(n+", ");
		}
		
	}
	public void secondLargest(int[] arr) {
		
		int largest=arr[0];
		int secondLargest=arr[1];
		
		for(int i =0;i<arr.length;i++)
		{
			 if(arr[i]>largest){

				 secondLargest=largest;
		            largest=arr[i];
		        }else if (arr[i]>secondLargest) {

		        	secondLargest=arr[i];
		        }
		}
		System.out.println("2nd max"+secondLargest);	
	}
	
	public void find_num_words(String str)
	{
		int total =0;
		char[] arr = str.toCharArray();
		for(int i =0;i<str.length();i++)
		{
			if( arr[i] == ' ' )
			{
				continue;
			}
			else if(arr[i]!=' ')
			{
				total = total+1;
				
				for(int k=i+1;k<str.length();k++)
				{
					
					if(k==str.length()-1)
					{
						i=k;
						break;
					}
					if (arr[k]!=' ' )
					{
						continue;
					}
					
					else {
						i=k;
						break;
					}
				}
			}
		}
		
		System.out.println("==================  "+total);
	}
	
	

}
