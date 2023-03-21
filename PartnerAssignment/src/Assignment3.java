import java.time.LocalDate;
        import java.time.format.DateTimeFormatter;
        import java.time.format.DateTimeParseException;
        import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LocalDate date = null;
        while (true) {
            DateTimeFormatter formatter1 =
                    DateTimeFormatter.ofPattern("M/d/yyyy");
//            LocalDate date = LocalDate.parse(input, formatter);
            System.out.printf("Enter your birth date M/D/YYYY: ");
            String value = scanner.nextLine();
            try {
                date = LocalDate.parse(value, formatter1);
            } catch (DateTimeParseException e1) {
                System.out.println("Invalid date");
                break;// break added
            }
            String sign = null;
            assert date != null;
            date.getDayOfMonth();

            switch (date.getMonthValue()) {
                case 1:
                    sign = (date.getDayOfMonth() < 20) ? ("Capricorn") : ("Aquarius");
                    break;
                case 2:
                    sign = (date.getDayOfMonth() < 19) ? ("Aquarius") : ("Pisces");
                    break;
                case 3:
                    sign = (date.getDayOfMonth() < 21) ? ("Pisces") : ("Aries");
                    break;
                case 4:
                    sign = (date.getDayOfMonth() < 20) ? ("Aries") : ("Taurus");
                    break;
                case 5:
                    sign = (date.getDayOfMonth() < 20) ? ("Aries") : ("Gemini");
                    break;
                case 6:
                    sign = (date.getDayOfMonth() < 20) ? ("Gemini") : ("Cancer");
                    break;
                case 7:
                    sign = (date.getDayOfMonth() < 23) ? ("Cancer") : ("Leo");
                    break;
                case 8:
                    sign = (date.getDayOfMonth() < 23) ? ("Leo") : ("Virgo");
                    break;
                case 9:
                    sign = (date.getDayOfMonth() < 23) ? ("Virgo") : ("Libra");
                    break;
                case 10:
                    sign = (date.getDayOfMonth() < 23) ? ("Libra") : ("Scorpio");
                    break;
                case 11:
                    sign = (date.getDayOfMonth() < 22) ? ("Scorpio") : ("Sagittarius");
                    break;
                case 12:
                    sign = (date.getDayOfMonth() < 22) ? ("Sagittarius") : ("Capricorn");
                    break;
            }

            char c = sign.charAt(0);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.println("You are an " + sign);
            } else {
                System.out.println("You are a " + sign);
            }
            break;// brake added to avoid infinite loop

        }
    }
}