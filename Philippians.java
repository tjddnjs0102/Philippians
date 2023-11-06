import java.util.Scanner;

public class Philippians {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("안녕하세요? 빌립보서 몇 장을 암송하실건가요?");
        System.out.print(" (1)1장 (2)2장 (3)3장 (4)4장\n");
        String userInput = scanner.nextLine();

        if (userInput.equals("1")) {
            System.out.println("1장을 선택하셨습니다.");
            // 1장에 대한 추가 동작을 여기에 추가하세요.
        } else if (userInput.equals("2")) {
            System.out.println("2장을 선택하셨습니다.");
            // 2장에 대한 추가 동작을 여기에 추가하세요.
        } else if (userInput.equals("3")) {
            System.out.println("3장을 선택하셨습니다.");
            // 3장에 대한 추가 동작을 여기에 추가하세요.
        } else if (userInput.equals("4")) {
            System.out.println("4장을 선택하셨습니다.");
            // 4장에 대한 추가 동작을 여기에 추가하세요.
        } else {
            System.out.println("잘못된 입력입니다. 1부터 4 사이의 번호를 입력하세요.");
        }

        scanner.close();
    }
}
