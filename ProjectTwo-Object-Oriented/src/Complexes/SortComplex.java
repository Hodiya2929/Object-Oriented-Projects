package Complexes;

public class SortComplex implements Sortable {

	private Complex[] cArr;

	public SortComplex (Complex[] c)
	{
		this.cArr=new Complex[c.length];

		for (int i=0; i<c.length;i++)
		{
			Complex temp =new Complex(c[i].a,c[i].b);
			cArr[i]=temp;
		}
		
	}

	@Override
	public int compare(Object left, Object right) {
		return  ( ((Complex) left).compare((Complex)right));

	}

	@Override
	public Object valueAt(int position) {

		return (cArr[position]);
	}

	@Override
	public void setValue(Object value, int position) {
		this.cArr[position].add((Complex)value);	
		

	}

	@Override
	public int size() {

		return this.cArr.length;
	}



}
