import java.util.Scanner;

public class Philippians {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("안녕하세요? 빌립보서 몇 장을 암송하실건가요?");
            System.out.print(" (1)1장 (2)2장 (3)3장 (4)4장\n");
            String userInput = scanner.nextLine();

            if (userInput.equals("1")) {
                // 1장을 선택하셨습니다.
                processChapter(1, scanner);
            } else if (userInput.equals("2")) {
                // 2장을 선택하셨습니다.
                processChapter(2, scanner);
            } else if (userInput.equals("3")) {
                // 3장을 선택하셨습니다.
                processChapter(3, scanner);
            } else if (userInput.equals("4")) {
                // 4장을 선택하셨습니다.
                processChapter(4, scanner);
            } else {
                System.out.println("잘못된 입력입니다. 1부터 4 사이의 번호를 입력하세요.");
            }
        }
    }

    private static void processChapter(int selectedChapter, Scanner scanner) {
        int currentVerse = 1;    // 사용자가 현재 암송 중인 절
        int totalVerses = 0; // 선택한 장의 총 절 수

        switch (selectedChapter) {
            case 1:
                totalVerses = 30; // 1장은 30절까지
                break;
            case 2:
                totalVerses = 30; // 2장은 30절까지
                break;
            case 3:
                totalVerses = 21; // 3장은 21절까지
                break;
            case 4:
                totalVerses = 23; // 4장은 23절까지
                break;
            default:
                break;
        }

        while (currentVerse <= totalVerses) {
            System.out.println("현재 " + selectedChapter + "장의 " + currentVerse + "절을 암송 중입니다.");
            System.out.print("암송한 절을 입력하세요: ");
            String verseInput = scanner.nextLine();

            if (verseInput.equals(Integer.toString(currentVerse))) {
                currentVerse++;
                if (currentVerse > totalVerses) {
                    System.out.println(selectedChapter + "장의 모든 절을 암송하셨습니다.");
                    break;
                }
            } else if (verseInput.equals("0")) {
                System.out.println("첫 번째 질문으로 돌아갑니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. " + currentVerse + "절을 암송하세요.");
            }
        }
    }
}
