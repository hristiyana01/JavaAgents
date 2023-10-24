import jade.wrapper.StaleProxyException;

import java.lang.String;
import java.lang.Object;
public interface AgentController {
    public AgentController createNewAgent(String nickname, String className, Object[] args)
            throws StaleProxyException;
}
