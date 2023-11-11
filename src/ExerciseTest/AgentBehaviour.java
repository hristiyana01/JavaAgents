package ExerciseTest;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class AgentBehaviour extends CyclicBehaviour {
    public AgentBehaviour(Agent agent) {
        super(agent);
    }
    @Override
    public void action() {
        ACLMessage aclMessage = myAgent.receive();

        if(aclMessage != null) {
            String str = aclMessage.getContent();
            if(str.equalsIgnoreCase("hello, darling!")) {
                System.out.println("Hello, my sweaty!");
            }
        } else {
            block();
        }
    }
}
