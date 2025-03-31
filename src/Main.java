import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                Scanner sc1 = new Scanner(System.in);
                List<Book> books = new ArrayList<>();
                List<Book> available_books = new ArrayList<>();
                Storage storage = new Storage(books);
                Storage storage_available = new Storage(available_books);
                boolean flag = false;
                int id = 0;
                String title = "";
                String surname = "";
                int yearOfPublish = 0;
                while (!flag) {
                    System.out.println("--------------------------------------");
                    System.out.println("Welcome to Library application system");
                    System.out.println("Choose the function:");
                    System.out.println("1 - add a book");
                    System.out.println("2 - show all books");
                    System.out.println("3 - show available books");
                    System.out.println("4 - borrow book");
                    System.out.println("5 - return book");
                    System.out.println("6 - exit");

                    System.out.println("Enter your choice:");
                    int function = sc.nextInt();
                    switch (function) {
                        case (1): {
                            System.out.println("Введите ID книги:");
                            id = sc.nextInt();

                            System.out.println("Введите название книги:");
                            title = sc1.nextLine();


                            System.out.println("Введите фамилию автора:");
                            surname = sc1.nextLine();

                            System.out.println("Введите год публикования книги:");
                            yearOfPublish = sc.nextInt();


                            Book book1 = new Book(id, title, surname, yearOfPublish);
                            books.add(book1);
                            available_books.add(book1);
                            System.out.println("Данная книга добавлена в библиотеку");
                            break;
                        }
                        case (2): {
                            System.out.println("--------------------------------------");
                            for (Book book : storage.books) {
                                System.out.println(book);
                            }
                            break;
                        }
                        case (3): {
                            for (Book book : available_books) {
                                System.out.println(book);
                            }
                            if (available_books.isEmpty()){
                                System.out.println("В библиотеке нет доступных книг");
                            }
                            break;
                        }
                        case (4): {
                            System.out.println("Введите ID книги, которую вы хотите взять:");
                            int ID = sc.nextInt();
                            for (int i = 0; i < available_books.size(); i++) {
                                if (available_books.get(i).getID() == ID){
                                    available_books.remove(i);
                                }
                                System.out.println("Вы взяли книгу с ID - " + ID);
                            }
                            break;
                        }
                        case (5): {
                            System.out.println("Введите ID книги, которую вы хотите вернуть:");
                            int returnID = sc.nextInt();
                            for (int i = 0; i < books.size(); i++) {
                                if (books.get(i).getID() == returnID){
                                    available_books.add(books.get(i));
                                }
                                System.out.println("Вы вернули книгу с ID - " + returnID);
                            }
                            break;
                        }
                        case (6): {
                            flag = true;
                            break;
                        }
                    }
                }

            }
        }
