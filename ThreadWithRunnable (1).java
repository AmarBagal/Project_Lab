package MultipleThread_may3;
class Rectangle implements Runnable
{  Thread r;

Rectangle(int x,String y)
{
	r= new Thread(this);
	r.setPriority(x);
	r.setName(y);
	r.start();
}
	public void run()
	{
	try {
	for(int i=0;i<10;i++)
	{
		System.out.println(r.getName());
		Thread.sleep(1000);
	}}
	catch(Exception d) {}
	
	}
}
public class ThreadWithRunnable {

	public static void main(String[] args) {
		 Rectangle u= new Rectangle(10,"cdac");
		 Rectangle u1= new Rectangle(4,"Delhi");
		 

	}

}
