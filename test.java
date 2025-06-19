package designpattern;

public class test {
	public static void main(String[] args)
	{
		Logger log1=Logger.getInstance();
		log1.log("First Log");
		Logger log2=Logger.getInstance();
		log2.log("Second Log");
		if(log1==log2)
		{
			System.out.println("Represents Singleton Pttern");
		}
		else {
			System.out.println("Not a Singleton Pttern");
		}
	}

}
