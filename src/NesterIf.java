
public class NesterIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day="Friday";
		int date=13;
		int time=12;
		
		if(day.equals("Monday"))

				{
		System.out.println("I am going to the movies today");
		
	if(date==13) {
		
		System.out.println("I am watching a scary movie");
	}else {
		System.out.println("I am watching a comedy today");
	}
	
	}else {
		
		System.out.println("I am going to study");
		
		if (time>23) {
			System.out.println("I have to go to sleep cause I have class");
		
	}
	
				}
	}

}

