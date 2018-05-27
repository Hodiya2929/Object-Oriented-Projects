package threads_task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Callable;

public class LineCounter implements Callable<Integer>{

	String nameoffile;

	public LineCounter(String name) {
		nameoffile=name;
	}

	@Override
	public Integer call() throws Exception {
		
		Integer numoflines=0;
		
		try {

			FileReader reader=new FileReader(nameoffile);
			BufferedReader br=new BufferedReader(reader);
			while(br.readLine()!=null)
				numoflines++;

			br.close();
			reader.close();

		} catch (IOException e) {
			System.out.println("Cant open the file... sorry");
			e.printStackTrace();
		}

		return numoflines;
	}
}