package ExerciseTest;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;

public class ReceiverAgent extends Agent {
    @Override
    protected void setup() {
        ACLMessage message = receive();
        if(message != null) {
            System.out.println("Hi!");
        }
      //this.addBehaviour(new AgentBehaviour(Agent agent) );
        receive();
    }
}
