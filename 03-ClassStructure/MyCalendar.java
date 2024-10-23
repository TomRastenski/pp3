public class MyCalendar {
    static int year= 2024;
    static int month=10;
    static int day = 23;

    static String myDate(){
        String s;
        s=year+"-"+month+"-"+day;
        return s;
    }

    static int days(){
        int[] a={31, // January
            28, // February (29 for leap years)
            31, // March
            30, // April
            31, // May
            30, // June
            31, // July
            31, // August
            30, // September
            31, // October
            30, // November
            31};

        int d=0;
        for(int i=0; i<month;i++){
            d +=a[i];
        }
        d+=day;
        return d;
    }

    static String monthName(){
        String[] a={"j","f","m","a","m","j","jul","a","s","o","n","d"};
        return a[month-1];
    }

    public static void main(String[] args) {
        System.out.println(myDate());
        System.out.println(days());
        System.out.println(monthName());
    }

}
