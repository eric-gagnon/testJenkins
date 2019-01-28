package main;

/**
 * This is the Person class.
 */
public class Person {
	/**
	 * Person firstname.
	 */
    private String firstname;
    /**
     * Person lastname.
     */
    private String lastname;
    /**
     * Person gender.
     */
    private String gender;

    /**
     * Person Constructor.
     * @param fn The firstname
     * @param ln The lastname
     * @param g The gender
     */
    public Person(String fn, String ln, String g) {
    	this.firstname = fn;
    	this.lastname = ln;
    	this.gender = g;
    }

    /**
     * Person name setter.
     * @param fn The firstname
     * @param ln The lastname
     */
    public void setName(String fn, String ln) {
    	this.firstname = fn;
    	this.lastname = ln;
    }

    /**
     * Person name getter.
     * @return The name
     */
    public String getName() {
    	return this.firstname + " " + this.lastname;
    }

    /**
     * Person gender setter.
     * @param g The gender
     */
    public void setGender(String g) {
    	this.gender = g;
    }

    /**
     * Person gender getter.
     * @return The gender
     */
    public String getGender() {
    	return this.gender;
    }

    /**
     * Main program.
     * @param args Main arguments
     */
    public static void main(String[] args) {
    	Person p = new Person("Xavier", "Lachance", "Male");
    	String name = p.getName();
    	String gender = p.getGender();
    	System.out.println("Name : " + name);
    	System.out.println("Gender : " + gender);
    }
}
