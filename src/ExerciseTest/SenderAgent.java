package ExerciseTest;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;

public class SenderAgent extends Agent {
    @Override
    protected void setup() {
        ACLMessage message = new ACLMessage(ACLMessage.INFORM);
        message.addReceiver(new AID("Bella", AID.ISLOCALNAME));
        message.setContent("Hello, darling!");
        send(message);
    }
}
