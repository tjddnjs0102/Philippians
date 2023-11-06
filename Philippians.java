import java.util.Scanner;

public class Philippians {
    private static final String[][] chapters = {
            {
                    "그리스도 예수의 종 바울과 디모데는 그리스도 예수 안에서 빌립보에 사는 모든 성도와 또는 감독들과 집사들에게 편지하노니",
                    "하나님 우리 아버지와 주 예수 그리스도에게로서 은혜와 평강이 너희에게 있을찌어다",
                    "내가 너희를 생각할 때마다 나의 하나님께 감사하며",
                    "간구할 때마다 너희 무리를 위하여 기쁨으로 항상 간구함은",
                    "첫날부터 이제까지 복음에서 너희가 교제함을 인함이라",
                    "너희 속에 착한 일을 시작하신 이가 그리스도 예수의 날까지 이루실 줄을 우리가 확신하노라",
                    "내가 너희 무리를 위하여 이와 같이 생각하는 것이 마땅하니 이는 너희가 내 마음에 있음이며 나의 매임과 복음을 변명함과 확정함에 너희가 다 나와 함께 은혜에 참예한 자가 됨이라",
                    "내가 예수 그리스도의 심장으로 너희 무리를 어떻게 사모하는지 하나님이 내 증인이시니라",
                    "내가 기도하노라 너희 사랑을 지식과 모든 총명으로 점점 더 풍성하게 하사",
                    "너희로 지극히 선한 것을 분별하며 또 진실하여 허물 없이 그리스도의 날까지 이르고",
                    "예수 그리스도로 말미암아 의의 열매가 가득하여 하나님의 영광과 찬송이 되게 하시기를 구하노라",
                    "형제들아 나의 당한 일이 도리어 복음의 진보가 된 줄을 너희가 알기를 원하노라",
                    "이러므로 나의 매임이 그리스도 안에서 온 시위대 안과 기타 모든 사람에게 나타났으니",
                    "형제 중 다수가 나의 매임을 인하여 주 안에서 신뢰하므로 겁 없이 하나님의 말씀을 더욱 담대히 말하게 되었느니라",
                    "어떤이들은 투기와 분쟁으로, 어떤이들은 착한 뜻으로 그리스도를 전파하나니",
                    "이들은 내가 복음을 변명하기 위하여 세우심을 받은줄 알고 사랑으로 하나",
                    "저들은 나의 매임에 괴로움을 더하게 할 줄로 생각하여 순전치 못하게 다툼으로 그리스도를 전파하느니라",
                    "그러면 무엇이뇨 외모로 하나 참으로 하나 무슨 방도로 하든지 전파되는 것은 그리스도니 이로써 내가 기뻐하고 또한 기뻐하리라",
                    "이것이 너희 간구와 예수 그리스도의 성령의 도우심으로 내 구원에 이르게 할줄 아는고로",
                    "나의 간절한 기대와 소망을 따라 아무 일에든지 부끄럽지 아니하고 오직 전과 같이 이제도 온전히 담대하여 살든지 죽든지 내 몸에서 그리스도가 존귀히 되게 하나니",
                    "이는 내게 사는 것이 그리스도니 죽는 것도 유익함이니라",
                    "그러나 만일 육신으로 사는 이것이 내 일의 열매일찐대 무엇을 가릴는지 나는 알지 못하노라",
                    "내가 그 두 사이에 끼였으니 떠나서 그리스도와 함께 있을 욕망을 가진 이것이 더욱 좋으나",
                    "그러나 내가 육신에 거하는 것이 너희를 위하여 더 유익하리라",
                    "내가 살 것과 너희 믿음의 진보와 기쁨을 위하여 너희 무리와 함께 거할 이것을 확실히 아노니",
                    "내가 다시 너희와 같이 있음으로 그리스도 예수 안에서 너희 자랑이 나를 인하여 풍성하게 하려 함이라",
                    "오직 너희는 그리스도 복음에 합당하게 생활하라 이는 내가 너희를 가보나 떠나 있으나 너희가 일심으로 서서 한 뜻으로 복음의 신앙을 위하여 협력하는 것과",
                    "아무 일에든지 대적하는 자를 인하여 두려워하지 아니하는 이 일을 듣고자 함이라 이것이 저희에게는 멸망의 빙거요 너희에게는 구원의 빙거니 이는 하나님께로부터 난 것이니라",
                    "그리스도를 위하여 너희에게 은혜를 주신 것은 다만 그를 믿을뿐 아니라 또한 그를 위하여 고난도 받게 하심이라",
                    "너희에게도 같은 싸움이 있으니 너흝가 내 안에서 본 바요 이제도 내 안에서 듣는 바니라"
            },
            {
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
            },
            {
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
            },
            {
                    "그러므로 나의 사랑하고 사모하는 형제들, 나의 기쁨이요 면류관인 사랑하는 자들아 이와 같이 주 안에 서라",
                    "내가 유오디아를 권하고 순두게를 권하노니 주 안에서 같은 마음을 품으라",
                    "또 참으로 나와 멍에를 같이 한 자 네게 구하노니 복음에 나와 함께 힘쓰던 저 부녀들을 돕고 또한 글레멘드와 그 외에 나의 동역자들을 도우라 그 이름들이 생명책에 있느니라",
                    "주 안에서 항상 기뻐하라 내가 다시 말하노니 기뻐하라",
                    "너희 관용을 모든 사람에게 알게 하라 주께서 가까우시니라",
                    "아무 것도 염려하지 말고 오직 모든 일에 기도와 간구로, 너희 구할 것을 감사함으로 하나님께 아뢰라",
                    "그리하면 모든 지각에 뛰어난 하나님의 평강이 그리스도 예수 안에서 너희 마음과 생각을 지키시리라",
                    "종말로 형제들아 무엇에든지 참되며 무엇에든지 경건하며 무엇에든지 옳으며 무엇에든지 정결하며 무엇에든지 사랑할만하며 무엇에든지 칭찬할만하며 무슨 덕이 있든지 무슨 기림이 있든지 이것들을 생각하라",
                    "너희는 내게 배우고 받고 듣고 본 바를 행하라 그리하면 평강의 하나님이 너희와 함께 계시리라",
                    "내가 주 안에서 크게 기뻐함은 너희가 나를 생각하던 것이 이제 다시 싹이 남이니 너희가 또한 이를 위하여 생각은 하였으나 기회가 없었느니라",
                    "내가 궁핍하므로 말하는 것이 아니라 어떠한 형편에든지 내가 자족하기를 배웠노니",
                    "내가 비천에 처할 줄도 알고 풍부에 처할 줄도 알아 모든 일에 배부르며 배고픔과 풍부와 궁핍에도 일체의 비결을 배웠노라",
                    "내게는 능력 주시는 자 안에서 내가 모든 것을 할 수 있느니라",
                    "그러나 너희가 내 괴로움에 함께 참예하였으니 잘하였도다",
                    "빌립보 사람들아 너희도 알거니와 복음의 시초에 내가 마게도냐를 떠날 때에 주고 받는 내 일에 참예한 교회가 너희 외에 아무도 없었느니라",
                    "데살로니가에 있을 때에도 너희가 한번 두번 나의 쓸 것을 보내었도다",
                    "내가 선물을 구함이 아니요 오직 너희에게 유익하도록 과실이 번성하기를 구함이라",
                    "내게는 모든 것이 있고 또 풍부한지라 에바브로디도 편에 너희의 준 것을 받으므로 내가 풍족하니 이는 받으실만한 향기로운 제물이요 하나님을 기쁘시게 한 것이라",
                    "나의 하나님이 그리스도 예수 안에서 영광 가운데 그 풍성한대로 너희 모든 쓸 것을 채우시리라",
                    "하나님 곧 우리 아버지께 세세 무궁토록 영광을 돌릴찌어다 아멘",
                    "그리스도 예수 안에 있는 성도에게 각각 문안하라 나와 함께 있는 형제들이 너희에게 문안하고",
                    "모든 성도들이 너희에게 문안하되 특별히 가이사집 사람 중 몇이니라",
                    "주 예수 그리스도의 은혜가 너희 심령에 있을찌어다"
            }
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("안녕하세요? 빌립보서의 장을 선택하세요 (1-4, 0으로 종료): ");
            int chapterNumber = Integer.parseInt(scanner.nextLine());

            if (chapterNumber >= 1 && chapterNumber <= 4) {
                processChapter(scanner, chapterNumber);
            } else if (chapterNumber == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 1부터 4 사이의 숫자를 입력하여 선택하세요.");
            }
        }
    }

    private static void processChapter(Scanner scanner, int chapterNumber) {
        String[] chapter = chapters[chapterNumber - 1];
        for (int i = 0; i < chapter.length; i++) {
            System.out.println(chapterNumber + "장 " + (i + 1) + "절");
            System.out.print("암송한 절을 입력하세요: ");
            String verseInput = scanner.nextLine();

            if (verseInput.equals(chapter[i])) {
                System.out.println("정확한 절을 암송하셨습니다.");
            } else {
                System.out.println("잘못된 입력입니다. 정확한 절을 암송하세요.");
                i--; // 다시 현재 절로 돌아가기
            }
        }

        System.out.println(chapterNumber + "장의 모든 절을 암송하셨습니다.");
    }
}
