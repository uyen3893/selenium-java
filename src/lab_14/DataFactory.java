package lab_14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataFactory {

    public static List<Book> convertDataIntoBookList(String filePath) {
        List<Book> bookList = new ArrayList<>();
        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                ) {
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                String[] bookData = dataLine.split(";");
                int bookIBSN = Integer.parseInt(bookData[0]);
                String bookName = bookData[1];
                String bookAuthor = bookData[2];
                int bookYear = Integer.parseInt(bookData[3]);
                Book newBook = new Book(bookIBSN, bookName, bookAuthor, bookYear);
                bookList.add(newBook);
                dataLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookList;
    }

    public static void saveBookList(List<Book> bookList, String filePath) {
        if (bookList == null || filePath == null) {
            throw new IllegalArgumentException("Book list and file path can't be null");
        }
        if (bookList.isEmpty()) {
            return;
        }
        try(
                FileOutputStream fileOutputStream = new FileOutputStream(filePath, true);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
                ) {
            for(Book book: bookList) {
                int ISBN = book.getISBN();
                String title = book.getTitle();
                String author = book.getAuthor();
                int year = book.getYear();
                String dataLine =
                        String.valueOf(ISBN).concat(";").concat(title).concat(";").concat(author).concat(";").concat(String.valueOf(year));
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteFile(String filePath) {
        if (filePath == null) {
            throw new IllegalArgumentException("File path can't be null");
        }
        try (FileOutputStream fos = new FileOutputStream(filePath, false)) { }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
