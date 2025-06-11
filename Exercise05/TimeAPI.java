package ra.Exercise05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Scanner;

public class TimeAPI {
    public static String getString(Scanner scanner, String string){
        do {
            System.out.println(string);
            String input = scanner.nextLine();
            if (Objects.equals(input, "")){
                System.out.println("K thể nhập chuỗi rỗng");
            }else {
                return input;
            }
        }while (true);
    }

    public static LocalDateTime getDateTime(Scanner scanner,String string){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        do {
            System.out.println(string);
            String input = scanner.nextLine();
            try {
                return LocalDateTime.parse(input,formatter);
            }catch (Exception e) {
                System.out.println("Nhập ngày k hợp lệ");
            }
        }while (true);
    }

    public static LocalDateTime getDate(Scanner scanner , String string) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        do {
            System.out.println(string);
            String input = scanner.nextLine();
            try {
                return LocalDateTime.parse(input+ " 00:00",formatter);
            }catch (Exception e) {
                System.out.println("Nhập ngày k hợp lệ");
            }
        }while (true);
    }
}
