/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class NewsAudience implements Observer{
    @Override
    public void update(Source o) {
        System.out.println("News result: " + ((Announcer)o).getResult());
    }
}
