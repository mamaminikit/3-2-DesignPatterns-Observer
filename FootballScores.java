/* Kitthanya Teachanontkullawat (Mine) 64050027 */
import java.util.Scanner;

public class FootballScores {
    static String input;
    public static void main(String[] args) {
        LiveAudience live = new LiveAudience();
        NewsAudience news = new NewsAudience();
        Announcer announcer = new Announcer();
        announcer.add(live);
        announcer.add(news);
        while (getInput() != "") {
            announcer.setResult(input);
        }
    }

    private static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Score: ");
        return input = scanner.nextLine();
    }
}
