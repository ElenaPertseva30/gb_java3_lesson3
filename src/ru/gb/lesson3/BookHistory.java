package ru.gb.lesson3;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BookHistory {

        public static void main(String[] args) {
            String nameBook = "Book name";
            String file = "history" + nameBook + ".txt";

            for (int i = 0; i < 10; i++) {
                addWritingToHistoryBook(file, nameBook, "Name Book" + i);

            }
        }

        private static void addWritingToHistoryBook(String file, String nameBook, String message ) {
            String text = message + "\n";
            try {
                writeStringToHistory(nameBook, text);
            }
            catch (IOException e) {
                System.out.println(e);
            }

        }

        private static void writeStringToHistory(String nameBook, String text) throws IOException {
            BufferedWriter bufferWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nameBook, true), StandardCharsets.UTF_8));
            bufferWriter.write(text);
            bufferWriter.close();
        }

        private static void clearToHistory(String nameBook){
            try {
                PrintWriter writer = new PrintWriter(nameBook);
                writer.print("");
                writer.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }








