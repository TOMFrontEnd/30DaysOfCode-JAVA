public class AnotherEnum {

    public static void main(String[] args) {

        Weekday day = Weekday.SUN;

        switch(day) {

        case MON, TUE, WED, THU, FRI -> System.out.println("Today is " + day + ". Work at office!");

        case SAT, SUN -> System.out.println("Today is " + day + ". Work at home!");

        default -> throw new RuntimeException("cannot process " + day);

        }

    }

}

enum Weekday {

    MON, TUE, WED, THU, FRI, SAT, SUN;

}

//上述采用了新式 switch 语句