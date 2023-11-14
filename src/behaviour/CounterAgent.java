package behaviour;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;

public class CounterAgent extends Agent {
    private int counter = 0;

    protected void setup() {
        addBehaviour(new CheckCounterBehaviour());
        addBehaviour(new PrintCounterBehaviour());
    }

    private class CheckCounterBehaviour extends CyclicBehaviour {
        public void action() {
            if (counter >= 20) {
                System.out.println("Reached 20!!!");
                myAgent.doDelete();
            }

        }
    }
    private class PrintCounterBehaviour extends CyclicBehaviour {
        public void action() {
            System.out.println("Counter value: " + counter);
            counter++;
        }
    }
}
