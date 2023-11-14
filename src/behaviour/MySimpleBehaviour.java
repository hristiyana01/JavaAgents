package behaviour;

import jade.core.Agent;
import jade.core.behaviours.SimpleBehaviour;

public class MySimpleBehaviour extends SimpleBehaviour {
    private boolean finished = true;
    private int round = 0;

    public MySimpleBehaviour(Agent agent) {
        super(agent);
    }

    @Override
    public void action() {
        System.out.println("Inside ACTION:: " + round++);
    }
    @Override
    public boolean done() {
        return finished;
    }
}
