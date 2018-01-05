
public class ComputerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer underTest = new Computer("make", "model", 0);
		Computer underTest2 = new Computer("make","model", 0);
		
		System.out.println(underTest);
		System.out.println(underTest2);
		System.out.println(" ");
		
		underTest = underTest2; //make an alias
		
		System.out.println(underTest);
		System.out.println(underTest2);
	}

}
