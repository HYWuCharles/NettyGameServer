
import java.util.Map;

public interface IClientPackageProcesser {

    public Map<String, Object> getPackage(int playerNumber, int frame);

    public void putPackage(Map<String, Object> pack);

    public void sendPackageClient() throws InterruptedException;

}
