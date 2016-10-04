package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Testarraylist {
	
	ArrayList<String> arraylist=new ArrayList<String>();
	public void add()
	{
		arraylist.add("jagadeesh");
		arraylist.add("Saibersys");
		arraylist.add("Ongole");
		
	}
	public void print()
	{
		for(int i=0;i<arraylist.size();++i)
		System.out.println(arraylist.get(i));
	}
	
	public void iternary()
	{
			Iterator<String> itr= arraylist.iterator();
			while(itr.hasNext())
				System.out.println(itr.next());
			
	}

	public static void main(String[] args) {
		Testarraylist testarraylist=new Testarraylist();
		testarraylist.add();
		testarraylist.print();
		System.out.println("********");
		testarraylist.iternary();

	}

}
