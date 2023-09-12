package util;

import java.util.Scanner;

public class InputUtil {
    public static int InputRequiredInt(String title){
        Scanner scanner =  new Scanner(System.in);
        System.out.println(title);
        return scanner.nextInt();
    }
    public static String InputRequiredString(String title){
        Scanner scanner =  new Scanner(System.in);
        System.out.println(title);
        return scanner.nextLine();
    }
}
