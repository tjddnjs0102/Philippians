import java.util.Scanner;

public class Philippians3 {
    private static final String[] verses = {
            "종말로 나의 형제들아 주 안에서 기뻐하라 너희에게 같은 말을 쓰는 것이 내게는 수고로움이 없고 너희에게는 안전하니라",
            "개들을 삼가고 행악하는 자들을 삼가고 손할례당을 삼가라",
            "하나님의 성령으로 봉사하며 그리스도 예수로 자랑하고 육체를 신뢰하지 아니하는 우리가 곧 할례당이라",
            "그러나 나도 육체를 신뢰할만하니 만일 누구든지 다른이가 육체를 신뢰할 것이 있는 줄로 생각하면 나는 더욱 그러하리니",
            "내가 팔일만에 할례를 받고 이스라엘의 족속이요 베냐민의 지파요 히브리인 중의 히브리인이요 율법으로는 바리새인이요",
            "열심으로는 교회를 핍박하고 율법의 의로는 흠이 없는 자로라",
            "그러나 무엇이든지 내게 유익하던 것을 내가 그리스도를 위하여 다 해로 여길뿐더러",
            "또한 모든 것을 해로 여김은 내 주 그리스도 예수를 아는 지식이 가장 고상함을 인함이라 내가 그를 위하여 모든 것을 잃어버리고 배설물로 여김은 그리스도를 얻고",
            "내가 이미 얻었다 함도 아니요 온전히 이룬 것도 아니라 오직 내가 그리스도 예수께 잡힌바 된 그것을 잡으려고 좇아가노라",
            "형제들아 나는 아직 내가 잡은 줄로 여기지 아니하고 오직 한 일 즉 뒤에 있는 것은 잊어버리고 앞에 있는 것을 잡으려고",
            "푯대를 향하여 그리스도 예수 안에서 하나님이 위에서 부르신 부름의 상을 위하여 좇아가노라",
            "그러므로 누구든지 우리 온전히 이룬 자들은 이렇게 생각할찌니 만일 무슨 일에 너희가 달리 생각하면 하나님이 이것도 너희에게 나타내시리라",
            "오직 우리가 어디까지 이르렀든지 그대로 행할 것이라",
            "형제들아 너희는 함께 나를 본받으라 또 우리로 본을 삼은 것 같이 그대로 행하는 자들을 보이라",
            "내가 여러 번 너희에게 말하였거니와 이제도 눈물을 흘리며 말하노니 여러 사람들이 그리스도 십자가의 원수로 행하느니라",
            "저희의 마침은 멸망이요 저희의 신은 배요 그 영광은 저희의 부끄러움에 있고 땅의 일을 생각하는 자라",
            "오직 우리의 시민권은 하늘에 있는지라 거기로서 구원하는 자 곧 주 예수 그리스도를 기다리노니",
            "그가 만물을 자기에게 복종케 하실 수 있는 자의 역사로 우리의 낮은 몸을 자기 영광의 몸의 형체와 같이 변케 하시리라"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("안녕하세요? 빌립보서 3장을 암송하시려면 3을 입력하세요. (0으로 종료): ");
            String userInput = scanner.nextLine();

            if (userInput.equals("3")) {
                processChapter(scanner);
            } else if (userInput.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 3을 입력하여 시작하거나 0을 입력하여 종료하세요.");
            }
        }
    }

    private static void processChapter(Scanner scanner) {
        for (int i = 0; i < verses.length; i++) {
            System.out.println("3장 " + (i + 1) + "절");
            System.out.print("암송한 절을 입력하세요: ");
            String verseInput = scanner.nextLine();

            if (verseInput.equals(verses[i])) {
                System.out.println("정확한 절을 암송하셨습니다.");
            } else {
                System.out.println("잘못된 입력입니다. 정확한 절을 암송하세요.");
                i--; // 다시 현재 절로 돌아가기
            }
        }

        System.out.println("3장의 모든 절을 암송하셨습니다.");
    }
}
