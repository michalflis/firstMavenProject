public class WeekdayName {

    public String getWeekdayName (Weekday weekday) {

        switch (weekday) {
            case Monday : return "Monday";
            case Tuesday : return "Tuesday";
            case Wednesday : return "Wednesday";
            case Thursday : return "Thursday";
            case Friday : return "Friday";
            case Saturday : return "Saturday";
            case Sunday : return "Sunday";

        }

        return null;

    }

}