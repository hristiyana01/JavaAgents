import jade.core.Agent;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.StaleProxyException;

public class CreateNewAgent extends Agent {

    @Override
    protected void setup() {
        System.out.println("My local name is " + getLocalName());
        System.out.println("Hello World! My name is " + getName());
        String name = "Tom";
        AgentContainer c = getContainerController();
        try {
            AgentController a = c.createNewAgent(name, "examples.hello.HelloWorldAgent", null);
            a.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
