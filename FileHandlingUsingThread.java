package MultipleThread_may3;
import java.io.FileInputStream;
//program to read data from two or more file using thread 
class filereading 
{
synchronized 	void readFile(String p) throws Exception
	{
		FileInputStream f= new FileInputStream(p);
		int i;
		do
		{
			i=f.read();
			System.out.print((char)i);
			Thread.sleep(1000);
		}while(i!=-1);
	}
}

class thread2 extends Thread
{
	filereading t;
	String file;
	thread2(filereading p,String file)
	{
		t= p;
		this.file= file;
		
	}
	public void run()
	{
		try {
		t.readFile(file);
		Thread.sleep(1000);
	   }
	catch(Exception d) {}
	}
}
public class FileHandlingUsingThread {

	public static void main(String[] args) {

filereading e= new filereading();
thread2 y= new thread2(e, "p1.txt");

thread2 y1= new thread2(e, "p2.txt");

y.start();
y1.start();

	}

}
