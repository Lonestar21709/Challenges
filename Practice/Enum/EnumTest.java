package Enum;

public class EnumTest {
    Day day;
    
 
    public EnumTest(Day day) {
        this.day = day;
    }
    
    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    
    public static void main(String[] args) {
    	
    	System.out.println("Monday is weekend? " +
    			Day.MONDAY.isWeekend());
    			System.out.println("Saturday is weekend? " +
    			Day.SATURDAY.isWeekend());
    			
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellItLikeItIs();
        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
        
        
        
        Day day1 = Day.MONDAY;
        System.out.println(day1.getAbbreviation() +
        					" is weekend? " +
        					day1.isWeekend());
        Day day2 = Day.SATURDAY;
        System.out.println(day2.getAbbreviation() +
        					" is weekend? " +
        					day2.isWeekend());
        
    }
}