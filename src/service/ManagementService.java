package service;

import global.GlobalData;
import util.InputUtil;
import util.MenuUtil;

public class ManagementService {
    public static void bookManage(){
        while (true){
            int option = MenuUtil.entryMenu();
            switch (option) {

                case 0:
                    System.out.println("finish program");
                    System.exit(-1);
                case 1:
                    System.out.println("add book");
                    BookService.registerBook();
                    break;
                case 2:
                    System.out.println("delete book");
                    BookService.deleteBook();
                    break;
                case 3:
                    System.out.println("update book");
                    BookService.updateBook();
                    break;
                case 4:
                    System.out.println("show books");
                    BookService.showBooks();
                    break;
                case 5:
                    System.out.println("search books");
                    break;
                default:
                    System.out.println("invalid option");
            }
        }
    }
    public static void manageField() {
        while (true) {
            int option2 = MenuUtil.fieldMenu();
            switch (option2) {

                case 1:
                    System.out.println("change name");
                    InputUtil.InputRequiredString("adi daxil edin");

                    break;
                case 2:
                    System.out.println("delete book");
                    BookService.deleteBook();
                    break;
                case 3:
            }
        }
    }
}