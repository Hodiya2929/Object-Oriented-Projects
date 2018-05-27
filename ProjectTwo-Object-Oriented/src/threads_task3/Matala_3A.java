package threads_task3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Matala_3A {


	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		int n=500;

		countLinesOneProcess(n);
		countLinesThread(n);

	}

	public static String[] createFiles(int n){
		StringBuilder stringBuilder=new StringBuilder();
		Random r = new Random(123);

		int Lines=r.nextInt(n); 
		int a=1;
		String[] array=new String[n];
		for (int i=0;i<n;i++)
		{

			for (int j = 0; j < Lines; j++) 
				stringBuilder.append("Hello World"+System.lineSeparator());

			array[i]="File_"+(a++)+".txt";
			try {
				FileWriter temp=new FileWriter(array[i].toString());
				temp.write(stringBuilder.toString());
				temp.close();

			} catch (IOException e) {
				System.out.println("Cant create the file");
				e.printStackTrace();
			}
			stringBuilder.delete(0, stringBuilder.length());

		}

		return array;
	}

	public static void deleteFiles(String[] fileNames)
	{
		int temp=fileNames.length;
		for (int i = 0; i < temp; i++) 
		{
			File temp1=new File(fileNames[i]);
			temp1.delete();

		}
	}

	public static void countLinesOneProcess(int numFiles) throws Exception

	{

		String[] array= createFiles(numFiles);
		Integer result=new Integer(0);
		long start=System.currentTimeMillis();
		for (int i = 0; i < numFiles; i++)
		{
			LineCounter linecounter=new LineCounter(array[i]);
			result+=linecounter.call();
		}

		long stop=System.currentTimeMillis();
		System.out.println("linear time ="+(stop-start)+"ms, lines = " +result);

		deleteFiles(array);


	}

	public static void countLinesThread(int numFiles) throws InterruptedException, ExecutionException {

		String[] filenames=createFiles(numFiles);

		long start=System.currentTimeMillis();
		ExecutorService executor=Executors.newFixedThreadPool(numFiles);
		Integer result2=0;
		for (int i = 0; i < numFiles; i++) {
			Callable<Integer> worker=new LineCounter(filenames[i]);
			Future<Integer> x1=executor.submit(worker);
			result2+=x1.get();
		}
		executor.shutdown();
	    long stop=System.currentTimeMillis();
		System.out.println("Threads time ="+(stop-start)+"ms, lines = " +result2);

		deleteFiles(filenames);

	}
}
