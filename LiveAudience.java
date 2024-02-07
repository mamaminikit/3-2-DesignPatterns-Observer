/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class LiveAudience implements Observer {
    @Override
    public void update(Source o) {
        System.out.println("live result: " + ((Announcer)o).getResult());
    }
}
