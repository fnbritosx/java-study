package devbrito.maratonajava.introducao;

public class Class04ConditionalStructures05 {
    public static void main(String[] args) {
        // Print day of the week considering 1 as Sunday.
        // switch - char, int, byte, short, enum, String

        byte day = 2;

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }

        // Print the person sex

        char sex = 'M';

        switch (sex) {
            case 'M':
                System.out.println("Your sex is Masculine!");
                break;
            case 'F':
                System.out.println("Your sex is Feminine!");
                break;
            default:
                System.out.println("Invalid Option!");
                break;
        }

        }
    }

