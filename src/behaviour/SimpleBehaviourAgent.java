package behaviour;
import jade.core.Agent;
import jade.core.behaviours.SimpleBehaviour;

public class SimpleBehaviourAgent extends Agent {


    private static final long serialVersionUID = 1L;

    public SimpleBehaviourAgent() {
    }

    protected void setup() {
        addBehaviour(new MySimpleBehaviour(this));
    }


}
