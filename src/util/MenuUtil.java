package util;

public class MenuUtil {
    public static int entryMenu(){
        System.out.println(
                "[1]add book\n" +
                "[2]delete book\n" +
                "[3]update book\n" +
                "[4]show book\n" +
                "[5]search book\n"+
                "[0]exit program");
        return InputUtil.InputRequiredInt("choose option");
    }
    public static int fieldMenu(){
        System.out.println("hansı özəlliyini deyişmək istəyisiz?\n" +
                "[1] Name\n" +
                "[2] Description\n"+
                "[3] Author\n");
        return InputUtil.InputRequiredInt("choose option");
    }
}
