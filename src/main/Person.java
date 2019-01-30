package main;

/**
 * This is the Person class.
 */
public class Person {
	/**
	 * Person first name.
	 */
    private String firstname;
    /**
     * Person last name.
     */
    private String lastname;
    /**
     * Person gender.
     */
    private String gender;

    /**
     * Person Constructor.
     * @param fn The first name
     * @param ln The last name
     * @param g The gender
     */
    public Person(String fn, String ln, String g) {
    	this.firstname = fn;
    	this.lastname = ln;
    	this.gender = g;
    }

    /**
     * Person name setter.
     * @param fn The first name
     * @param ln The last name
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
}
