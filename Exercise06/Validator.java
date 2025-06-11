package ra.Exercise06;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Validator {
    public static LocalDateTime getDate(Scanner scanner, String message) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine();
            try {
                LocalDate date = LocalDate.parse(input, formatter);
                return date.atStartOfDay();
            } catch (DateTimeParseException e) {
                System.out.println("Định dạng sai. Vui lòng nhập lại (dd-MM-yyyy).");
            }
        }
    }
}
