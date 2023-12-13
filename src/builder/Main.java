package builder;

import java.util.Scanner;

public class Main {
    public static String[] prompts = {
            "age = ",
            "firstName = ",
            "lastName = ",
            "isAdmin = ",
            "nationality = ",
    };
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0;

        int userAge = 0;
        String userFirstName = "";
        String userLastName = "";
        boolean userIsAdmin = false;
        String userNationality = "";
        while(true) {
            System.out.print(prompts[i]);
            String str = s.nextLine();
            switch (i) {
                case 0:
                    userAge = Integer.valueOf(str);
                    break;
                case 1:
                    userFirstName = str;
                    break;
                case 2:
                    userLastName = str;
                    break;
                case 3:
                    userIsAdmin = ("Yy".indexOf(str.charAt(0)) != -1);
                    break;
                case 4:
                    userNationality = str;
                    break;
                default:
                    break;
            }
            i++;
            if (i == 5) {
                break;
            }
        }
        User uglyUser = new User(userAge, userFirstName, userLastName, userIsAdmin, userNationality);

        i = 0;
        UserBuilder ub = new UserBuilder("Alex", "Calciu");
        while(s.hasNextLine()) {
            System.out.print(prompts[i]);
            String str = s.nextLine();
            switch (i) {
                case 0:
                    ub.setAge(Integer.valueOf(str));
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    ub.setAdmin("Yy".indexOf(str.charAt(0)) != -1);
                    break;
                case 4:
                    ub.setNationality(str);
                    break;
                default:
                    break;
            }
            i++;
            if (i == 5) {
                break;
            }
        }
        ub.setAge(3).setAdmin(true).setFirstName("alex");
        User beautifulUser = ub.build();
        System.out.println(beautifulUser);
    }
}
