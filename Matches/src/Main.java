import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long N, answer = 0, M = 0;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextLong();
        while (M*M < N) M++;
        M--;
        answer += M * (M+1) * 2;
        answer += (N - M*M)*2;
        answer++;
        if (N - M*M > M) answer++;
        System.out.println(answer);
    }
}
