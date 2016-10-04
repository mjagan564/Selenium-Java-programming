package inheritanc;

public class Array {
	int[] array=new int[5];
	int[] arrayintilize={2,4,6,8,10};
	
	public void addData()
	{
		array[0]=1;
		array[1]=3;
		array[2]=5;
		array[3]=7;;
		array[4]=9;
		
	}
	public void printData()
	{
		for(int i=0;i<array.length;++i)
		{
			System.out.println(array[i]);
			System.out.println(arrayintilize[i]);
		}
	}
public static void main(String[] args) 
{
	
}

}
