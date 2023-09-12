package service;

import global.GlobalData;
import model.Book;
import util.InputUtil;
import util.MenuUtil;

import java.util.Scanner;

public class BookService {
    public static void registerBook() {
        int registerCount = InputUtil.InputRequiredInt("how many book register");
        GlobalData.books = new model.Book[registerCount];
        for (int i = 0; i < GlobalData.books.length; i++) {
            // int id = InputUtil.InputRequiredInt("Enter id:");
            String name = InputUtil.InputRequiredString("Enter name:");
            String description = InputUtil.InputRequiredString("Enter description");
            String author = InputUtil.InputRequiredString("Enter author:");
            GlobalData.books[i] = new model.Book(i + 1, name, description, author);
        }
    }

    public static void showBooks() {
        for (int i = 0; i < GlobalData.books.length; i++) {
            System.out.println(GlobalData.books[i].getInfo());
        }

    }

    public static void deleteBook() {
        Scanner scanner = new Scanner(System.in);
        int bookId = scanner.nextInt();
        for (int i = 0; i < GlobalData.books.length; i++) {
            if (bookId == GlobalData.books[i].getId()) {
                GlobalData.books[i] = null;
            }
            else {
                System.out.println("kitab movcud deyil");
            }
        }
    }
    public static void updateBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID daxil edin");
        int bookId = scanner.nextInt();
        for (int i = 0; i < GlobalData.books.length; i++) {
            if (bookId == GlobalData.books[i].getId()){
                System.out.println("adi daxil edin");
                String setName = scanner.nextLine();
                GlobalData.books[i].setName(setName);
            }


        }
    }
}



