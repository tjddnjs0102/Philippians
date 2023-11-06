import java.util.Scanner;

public class Philippians {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("안녕하세요? 빌립보서 몇 장을 암송하실건가요?");
        System.out.print(" (1)1장 (2)2장 (3)3장 (4)4장\n");
        String userInput = scanner.nextLine();

        if (userInput.equals("1")) {
            System.out.println("1장을 선택하셨습니다.");
            // 1절 입력하라고 하고 1절의 내용과 일치해야만 2절로 이동 -> 30절까지 동일하게 진행, 틀리면 다시 1절부터 입력, 처음 질문으로 돌아가려면 0번을 입력하기
        } else if (userInput.equals("2")) {
            System.out.println("2장을 선택하셨습니다.");
            // 1절 입력하라고 하고 1절의 내용과 일치해야만 2절로 이동 -> 30절까지 동일하게 진행, 틀리면 다시 1절부터 입력, 처음 질문으로 돌아가려면 0번을 입력하기
        } else if (userInput.equals("3")) {
            System.out.println("3장을 선택하셨습니다.");
            // 1절 입력하라고 하고 1절의 내용과 일치해야만 2절로 이동 -> 21절까지 동일하게 진행, 틀리면 다시 1절부터 입력, 처음 질문으로 돌아가려면 0번을 입력하기
        } else if (userInput.equals("4")) {
            System.out.println("4장을 선택하셨습니다.");
            // 1절 입력하라고 하고 1절의 내용과 일치해야만 2절로 이동 -> 23절까지 동일하게 진행, 틀리면 다시 1절부터 입력, 처음 질문으로 돌아가려면 0번을 입력하기
        } else {
            System.out.println("잘못된 입력입니다. 1부터 4 사이의 번호를 입력하세요.");
            // 잘못된 입력 후 다시 첫번째 질문으로 돌아가도록 설정하기
        }

        scanner.close();
    }
}
