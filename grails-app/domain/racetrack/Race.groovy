package racetrack

class Race {
	static mapping = {
	  sort "startDate"
	}
	
	String name
	Date startDate
	String city
	String state
	BigDecimal distance
	BigDecimal cost
	Integer maxRunners = 100000
    static constraints = {
    }
}
