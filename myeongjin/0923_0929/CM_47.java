import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CM_47 {
        public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in); 
        String p = scanner.next();
        String q = scanner.next();
        int n=scanner.nextInt();
        BigDecimal bigP = new BigDecimal(p);
        BigDecimal bigQ = new BigDecimal(q);
        BigDecimal result = bigP.divide(bigQ, n + 1, RoundingMode.HALF_UP);
        // c만큼 소수점 표현
        String format = "%." + n + "f%n"; // c에 따라 포맷 문자열 생성
        System.out.printf(format, result); 
    }
}
