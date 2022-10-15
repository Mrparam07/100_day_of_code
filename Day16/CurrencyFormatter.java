/*
Task
Given a double-precision number, payment, denoting an amount of money, use the NumberFormat class’ getCurrencyInstance method to convert payment into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:
US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
where formattedPayment is payment formatted according to the appropriate Locale‘s currency.
Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).
Input Format
A single double-precision number denoting payment.
Constraints
0 <= payment <= 109
Output Format
On the first line, print US: u where u is payment formatted for US currency.
On the second line, print India: i where i is payment formatted for Indian currency.
On the third line, print China: c where c is payment formatted for Chinese currency.
On the fourth line, print France: f, where f is payment formatted for French currency.
Sample Input
12324.134
Sample Output
US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
*/
import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        String us=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india=NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
        String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
/*
TEST CASE 0
Input (stdin)

Download
12324.134
Expected Output

Download
US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €

TEST CASE 1
0.999
Expected Output

Download
US: $1.00
India: Rs.1.00
China: ￥1.00
France: 1,00 €

TEST CASE 2
12399449.3434
Expected Output

Download
US: $12,399,449.34
India: Rs.12,399,449.34
China: ￥12,399,449.34
France: 12 399 449,34 €

TEST CASE 3
Input (stdin)

Download
998763.999
Expected Output

Download
US: $998,764.00
India: Rs.998,764.00
China: ￥998,764.00
France: 998 764,00 €

TEST CASE 4
Input (stdin)

Download
9987.99
Expected Output

Download
US: $9,987.99
India: Rs.9,987.99
China: ￥9,987.99
France: 9 987,99 €

TEST CASE 5
Input (stdin)

Download
23.0094
Expected Output

Download
US: $23.01
India: Rs.23.01
China: ￥23.01
France: 23,01 €

TEST CASE 6
Input (stdin)

Download
10000005
Expected Output

Download
US: $10,000,005.00
India: Rs.10,000,005.00
China: ￥10,000,005.00
France: 10 000 005,00 €

TEST CASE 7
Input (stdin)

Download
1010.139999
Expected Output

Download
US: $1,010.14
India: Rs.1,010.14
China: ￥1,010.14
France: 1 010,14 €
*/


