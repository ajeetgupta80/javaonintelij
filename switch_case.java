import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("type a fruit name ");
//        String fruit = input.next();
//
//        switch (fruit) {
//            case "mango" -> System.out.println("its mango my dear!");
//            case "apple" -> System.out.println("its apple my dear ");
//            case "grapes" -> System.out.println("its your grapes my dear");
//            default -> System.out.println("out of the line!");
//        }
//        ----------------------------------------------------------------
        int employID = input.nextInt();
        String depart = input.next();

        switch (employID) {
            case 1:
                System.out.println("ajeet gupta");
                break;
            case 2:
                System.out.println("shivam ");
                break;
            case 3:
                System.out.println("its employe no 3");
                switch (depart) {
                    case "it":
                        System.out.println("IT department");
                        break;
                    case "cs":
                        System.out.println("CS department");
                        break;
                    default:
                        System.out.println("no department you entered");
                        break;
                }
                break;
            default:
                System.out.println("wrong employe id !");
                break;
        }
    }
}
//        -------------------------------------------------------------
//        better way to write switch statements
//        switch (employID) {
//            case 1 -> System.out.println("ajeet gupta");
//            case 2 -> System.out.println("shivam ");
//            case 3 -> {
//                System.out.println("its employe no 3");
//                switch (depart) {
//                    case "it" -> System.out.println("IT department");
//                    case "cs" -> System.out.println("CS department");
//                    default -> System.out.println("no department you entered");
//                }
//            }
//            default -> System.out.println("wrong employe id !");
//        }
//
//
//    }
//}
