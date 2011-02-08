package racetrack

class Registration {
	String name
	Date dateOfBirth
	String gender
	String address
	String state
	String zipcode
	String email
	Date dateCreated
	Date lastUpdated
	
    static constraints = {
    }
	def beforeInsert = {
		System.out.println("Registration beforeInsert")
	}
}
