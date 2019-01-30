package main;

public class Prog {

	public static void main(String[] args) {
		Person p = new Person("Xavier", "Lachance", "Male");
		String name = p.getName();
		String gender = p.getGender();
		System.out.println("Name : " + name);
		System.out.println("Gender : " + gender);
	}

}
