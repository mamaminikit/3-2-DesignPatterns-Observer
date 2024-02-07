/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class Announcer extends Source {
    private String result;
    public void setResult(String result) {
        this.result = result;
        notifyResult();
    }
    public String getResult() {
        return result;
    }
}
