package Enum;
public enum Day {
//    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
//    THURSDAY, FRIDAY, SATURDAY;
	
	SUNDAY("Sun"), MONDAY("Mon"), TUESDAY("Tues"),
	WEDNESDAY("Wed"), THURSDAY("Thurs"),
	FRIDAY("Fri"), SATURDAY("Sat");
	
	private String abbreviation;
	
	private Day(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public String getAbbreviation() {
		return(abbreviation);
	}
	
	public boolean isWeekend() {
		return(this == SATURDAY || this == SUNDAY);
	}
	public boolean isWeekday() {
		return(!isWeekend());
	}
}