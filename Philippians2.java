import java.util.Scanner;

public class Philippians2 {
    private static final String[] verses = {
            "그러므로 그리스도 안에 무슨 권면이나 사랑에 무슨 위로나 성령의 무슨 교제나 긍휼이나 자비가 있거든",
            "마음을 같이 하여 같은 사랑을 가지고 뜻을 합하며 한 마음을 품어",
            "아무 일에든지 다툼이나 허영으로 하지 말고 오직 겸손한 마음으로 각각 자기보다 남을 낫게 여기고",
            "각각 자기 일을 돌아볼 뿐더러 또한 각각 다른 사람들의 일을 돌아보아 나의 기쁨을 충만케 하라",
            "너희 안에 이 마음을 품으라 곧 그리스도 예수의 마음이니",
            "그는 근본 하나님의 본체시나 하나님과 동등됨을 취할 것으로 여기지 아니하시고",
            "오히려 자기를 비워 종의 형체를 가져 사람들과 같이 되었고",
            "사람의 모양으로 나타나셨으매 자기를 낮추시고 죽기까지 복종하셨으니 곧 십자가에 죽으심이라",
            "이러므로 하나님이 그를 지극히 높여 모든 이름 위에 뛰어난 이름을 주사",
            "하늘에 있는 자들과 땅에 있는 자들과 땅 아래 있는 자들로 모든 무릎을 예수의 이름에 꿇게 하시고",
            "모든 입으로 예수 그리스도를 주라 시인하여 하나님 아버지께 영광을 돌리게 하셨느니라",
            "그러므로 나의 사랑하는 자들아 너희가 나 있을 때 뿐아니라 더욱 지금 나 없을 때에도 항상 복종하여 두렵고 떨림으로 너희 구원을 이루라",
            "너희 안에서 행하시는 이는 하나님이시니 자기의 기쁘신 뜻을 위하여 너희로 소원을 두고 행하게 하시나니",
            "모든 일을 원망과 시비가 없이 하라",
            "이는 너희가 흠이 없고 순전하여 어그러지고 거스리는 세대 가운데서 하나님의 흠 없는 자녀로 세상에서 그들 가운데 빛들로 나타내며",
            "생명의 말씀을 밝혀 나의 달음질도 헛되지 아니하고 수고도 헛되지 아니함으로 그리스도의 날에 나로 자랑할 것이 있게 하려 함이라",
            "만일 너희 믿음의 제물과 봉사 위에 내가 나를 관제로 드릴찌라도 나는 기뻐하고 너희 무리와 함께 기뻐하리니",
            "이와 같이 너희도 기뻐하고 나와 함께 기뻐하라",
            "내가 디모데를 속히 너희에게 보내기를 주 안에서 바람은 너희 사정을 앎으로 안위를 받으려 함이니",
            "이는 뜻을 같이 하여 너희 사정을 진실히 생각할 자가 이 밖에 내게 없음이라",
            "저희가 다 자기 일을 구하고 그리스도 예수의 일을 구하지 아니하되",
            "디모데의 연단을 너희가 아나니 자식이 아비에게 함같이 나와 함께 복음을 위하여 수고하였느니라",
            "그러므로 내가 내 일이 어떻게 될 것을 보아서 곧 이 사람을 보내기를 바라고",
            "나도 속히 가기를 주 안에서 확신하노라",
            "그러나 에바브로디도를 너희에게 보내는 것이 필요한 줄로 생각하노니 그는 나의 형제요 함께 수고하고 함께 군사된 자요 너희 사자로 나의 쓸 것을 돕는 자라",
            "그가 너희 무리를 간절히 사모하고 자기 병든 것을 너희가 들은 줄을 알고 심히 근심한지라",
            "저가 병들어 죽게 되었으나 하나님이 저를 긍휼히 여기셨고 저뿐 아니라 또 나를 긍휜히 여기사 내 근심 위에 근심을 면하게 하셨느니라",
            "그러므로 내가 더욱 급히 저를 보낸 것은 너희로 저를 다시 보고 기뻐하게 하며 내 근심도 덜려 함이니",
            "이러므로 너희가 주 안에서 모든 기쁨으로 저를 영접하고 또 이와 같은 자들을 존귀히 여기라",
            "저가 그리스도의 일을 위하여 죽기에 이르러도 자기 목숨을 돌아보지 아니한 것은 나를 섬기는 너희의 일에 부족함을 채우려 함이니라"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("안녕하세요? 빌립보서 2장을 암송하시려면 1을 입력하세요. (0으로 종료): ");
            String userInput = scanner.nextLine();

            if (userInput.equals("1")) {
                processChapter(scanner);
            } else if (userInput.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 1을 입력하여 시작하거나 0을 입력하여 종료하세요.");
            }
        }
    }

    private static void processChapter(Scanner scanner) {
        for (int i = 0; i < verses.length; i++) {
            System.out.println("2장 " + (i + 1) + "절");
            System.out.print("암송한 절을 입력하세요: ");
            String verseInput = scanner.nextLine();

            if (verseInput.equals(verses[i])) {
                System.out.println("정확한 절을 암송하셨습니다.");
            } else {
                System.out.println("잘못된 입력입니다. 정확한 절을 암송하세요.");
                i--; // 다시 현재 절로 돌아가기
            }
        }

        System.out.println("2장의 모든 절을 암송하셨습니다.");
    }
}