import java.io.*;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num1, num2;
    String[] input;
    input = br.readLine().split(" ");
    num1 = Integer.parseInt(input[0]);
    num2 = Integer.parseInt(input[1]);
    System.out.printf("Factorial #1: %d%nFactorial #2: %d%n", getFactorial(num1), getFactorial(num2));
  }
  public static int getFactorial(int num) {
    return (num == 0) ? 1 : num * getFactorial(num - 1);
  }
}
