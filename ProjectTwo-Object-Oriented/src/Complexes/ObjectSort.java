package Complexes;

public class ObjectSort {

	public static void sort(Sortable item)
	{

		for (int i=1; i <item.size(); i++){
			int j = i;
			while (j>0 && item.compare(item.valueAt(j), item.valueAt(j-1))<0){
				
				
			Object temp= item.valueAt(j);
			Object temp1=item.valueAt(j-1);
			item.setValue(temp, j-1);
			item.setValue(temp1, j);



				j = j-1;
			}
		}

	}


	public static boolean checkSort(Sortable item)
	{
		boolean ans = true;

		for (int i=0; ans&&i< item.size()-1; i++){

			if(item.compare(item.valueAt(i), item.valueAt(i+1))>0){
				ans = false;
			}
		}
		return ans;

	}


}
