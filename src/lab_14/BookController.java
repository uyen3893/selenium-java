package lab_14;

import java.util.*;

public class BookController {

    public static void printMenu() {
        boolean isContinuing = true;
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        while(isContinuing) {
            System.out.println("-----------MENU----------");
            System.out.println("Press 1: Create a new book");
            System.out.println("Press 2: Find a book by ISBN");
            System.out.println("Press 3: Update a book by ISBN");
            System.out.println("Press 4: Delete a book");
            System.out.println("Press 5: Print a book list");
            System.out.println("Press 0: Exit");
            System.out.print("Your choice: ");
            try {
                option = scanner.nextInt();
                if (option > 5 || option < 0) {
                    System.out.println("Please choose again!");
                } else if (option == 1) {
                    createNewBook();
                } else if (option == 2) {
                    findBook();
                } else if (option == 3) {
                    updateBook();
                } else if (option == 4) {
                    deleteBook();
                } else if (option == 5) {
                    printBookList();
                } else if (option == 0) {
                    System.out.println("Exit");
                    isContinuing = false;
                }
            } catch (Exception e) {
                System.out.println("Your choice must be a positive number!");
                scanner.nextLine();
            }
        }
    }

    public static void createNewBook() {
        Scanner scanner = new Scanner(System.in);
        boolean isContinuing = true;
        List<Book> bookDataList = DataFactory.convertDataIntoBookList(Config.dataFileAbsolutePath);
        int ISBN = 0;
        int year = 0;
        while(isContinuing) {
            System.out.print("Please input ISBN: ");
            try {
                ISBN = Integer.parseInt(scanner.nextLine());
                if (ISBN <= 0) {
                    System.out.println("ISBN must be a positive number!");
                    break;
                } else {
                    for (Book book : bookDataList) {
                        if (ISBN == book.getISBN()) {
                            System.out.println("This ISBN has already existed!");
                            isContinuing = true;
                            break;
                        } else {
                            isContinuing = false;
                        }
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("ISBN must be a positive number!");
            }
        }
        System.out.print("Please input the title: ");
        String title = scanner.nextLine();
        System.out.print("Please input the author: ");
        String author = scanner.nextLine();
        isContinuing = true;
        while (isContinuing) {
            System.out.print("Please input the year: ");
            try {
                year = Integer.parseInt(scanner.nextLine());
                if (year <= 0) {
                    System.out.println("Year must be a positive number!");
                } else if (year > 2022) {
                    System.out.println("The current year is 2022!");
                } else {
                    isContinuing = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Year must be a positive number!");
            }
        }
        Book newBook = new Book(ISBN, title, author, year);
        List<Book> newBookList = Arrays.asList(newBook);
        DataFactory.saveBookList(newBookList, Config.dataFileAbsolutePath);
        System.out.println("The book is saved into DB with info: " + newBook);
    }

    public static void findBook() {
        Scanner scanner = new Scanner(System.in);
        boolean isContinuing = true;
        List<Book> bookDataList = DataFactory.convertDataIntoBookList(Config.dataFileAbsolutePath);
        int ISBN = 0;
        int total = 0;
        while (isContinuing) {
            System.out.print("Please input ISBN: ");
            try {
                ISBN = scanner.nextInt();
                if (ISBN <= 0) {
                    System.out.println("ISBN must be a positive number!");
                    isContinuing = true;
                } else {
                    for (Book book : bookDataList) {
                        if (ISBN == book.getISBN()) {
                            System.out.println(book);
                            isContinuing = false;
                            break;
                        } else {
                            total++;
                        }
                    }
                    if (total == bookDataList.size()) {
                        System.out.println("Book with ISBN " + ISBN + " is not found!");
                        isContinuing = false;
                    }
                }
            } catch (Exception e) {
                System.out.println("ISBN must be a positive number!");
                scanner.nextLine();
            }
        }

    }

    public static void updateBook() {
        Scanner scanner = new Scanner(System.in);
        boolean isContinuing = true;
        List<Book> bookDataList = DataFactory.convertDataIntoBookList(Config.dataFileAbsolutePath);
        int ISBN = 0;
        String title = null;
        String author = null;
        int year = 0;
        int total = 0;
        while(isContinuing) {
            System.out.print("Please input ISBN: ");
            try {
                ISBN = scanner.nextInt();
                if (ISBN <= 0) {
                    System.out.println("ISBN must be a positive number!");
                } else {
                    for (Book book : bookDataList) {
                        if (ISBN == book.getISBN()) {
                            bookDataList.remove(book);
                            scanner.nextLine();
                            System.out.print("Please input new title: ");
                            title = scanner.nextLine();
                            System.out.print("Please input new author: ");
                            author = scanner.nextLine();
                            isContinuing = true;
                            while (isContinuing) {
                                System.out.print("Please input the year: ");
                                try {
                                    year = Integer.parseInt(scanner.nextLine());
                                    if (year <= 0) {
                                        System.out.println("Year must be a positive number!");
                                    } else if (year > 2022) {
                                        System.out.println("The current year is 2022!");
                                    } else {
                                        isContinuing = false;
                                    }
                                } catch (NumberFormatException e) {
                                    System.out.println("Year must be a positive number!");
                                }
                            }
                            Book newBook = new Book(ISBN, title, author, year);
                            bookDataList.add(newBook);
                            DataFactory.deleteFile(Config.dataFileAbsolutePath);
                            DataFactory.saveBookList(bookDataList, Config.dataFileAbsolutePath);
                            System.out.println("The book is now updated with new content: " + newBook);
                            isContinuing = false;
                            break;
                        } else {
                            total++;
                        }
                    }
                    if (total == bookDataList.size()) {
                        System.out.println("Book with ISBN " + ISBN + " is not found!");
                        isContinuing = false;
                    }
                }
            } catch (Exception e) {
                System.out.println("ISBN must be a positive number!");
                isContinuing = true;
                scanner.nextLine();
            }
        }
    }

    public static void deleteBook() {
        Scanner scanner = new Scanner(System.in);
        boolean isContinuing = true;
        List<Book> bookDataList = DataFactory.convertDataIntoBookList(Config.dataFileAbsolutePath);
        int ISBN = 0;
        int total = 0;
        int totalBookListBeforeDeleting = bookDataList.size();
        while (isContinuing) {
            try {
                System.out.print("Please input ISBN: ");
                ISBN = scanner.nextInt();
                if (ISBN <= 0) {
                    System.out.println("ISBN must be a positive number!");
                    isContinuing = true;
                } else {
                    for (Book book : bookDataList) {
                        if (ISBN == book.getISBN()) {
                            System.out.println("Delete this " + book);
                            bookDataList.remove(book);
                            DataFactory.deleteFile(Config.dataFileAbsolutePath);
                            DataFactory.saveBookList(bookDataList, Config.dataFileAbsolutePath);
                            isContinuing = false;
                            break;
                        } else {
                            total++;
                        }
                    }
                    if (total == totalBookListBeforeDeleting) {
                        System.out.println("Book with ISBN " + ISBN + " is not found!");
                    }
                }
            } catch (Exception e) {
                System.out.println("ISBN must be a positive number!");
                scanner.nextLine();
            }
        }

    }

    public static void printBookList() {
        List<Book> bookDataList = DataFactory.convertDataIntoBookList(Config.dataFileAbsolutePath);
        System.out.println("List of book: ");
        int numberOfBook = 0;
        if (bookDataList == null) {
            throw new IllegalArgumentException("Book list is empty!");
        } else {
            for (Book book : bookDataList) {
                numberOfBook++;
                System.out.println("Book " + numberOfBook + ": " + book.getTitle());
                System.out.println("\tISBN: " + book.getISBN());
                System.out.println("\tauthor: " + book.getAuthor());
                System.out.println("\tyear: " + book.getYear());
            }
        }
    }


}
