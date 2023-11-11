package restaurant.agents;

import jade.core.behaviours.CyclicBehaviour;

public class MyAgentBehaviour extends CyclicBehaviour {

    @Override
    public void action() {
        System.out.println("My agent have to make a choice from all of meals: ");
    }
}
