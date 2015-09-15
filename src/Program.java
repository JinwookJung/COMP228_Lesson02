 public class Program {
	private static String _name = "";
	public static Person person; // reference to the Person class
	public static void main(String[] args) {
		System.out.println("Program Started...");
		_name = "Tom";
		System.out.println(_name);

		person = new Person(46);
		
		person.setName("Tom");
		
		System.out.println(person.getName());
		
		person.runs();
		
 	}
 
 }