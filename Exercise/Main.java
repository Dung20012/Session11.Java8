package ra.Exercise;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Tạo danh sách số nguyên
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        Sử dụng LambdaExpression để in ra từng phẩn tử
//        numbers.forEach(number -> System.out.println(number)); // cách 1
        numbers.forEach(System.out::println); // cách 2
//        Tính tổng các dãy số
//        tạo 1 luồng danh sách
//        chuyển phần tử từ Integer qua int
//        tính tổng
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Tổng các dãy số là: " + sum);
    }
}
