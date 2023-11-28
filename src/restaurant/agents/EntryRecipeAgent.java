package restaurant.agents;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;

import java.util.Scanner;

public class EntryRecipeAgent extends Agent {
    protected void setup() {

        Scanner scan = new Scanner(System.in);
        ACLMessage msg = new ACLMessage(ACLMessage.REQUEST);


        System.out.println("Recipe: ");

        String mealName = scan.nextLine();

        scan.close();

        ContainerController controller = getContainerController();

        Object[] arg = {mealName};

        //sending recipe with message
        try {
            AgentController a = controller.createNewAgent("Cooker", "restaurant.agents.MealAgent", arg);

            a.start();
        } catch (StaleProxyException e) {
            e.printStackTrace();
        }
        sendMessage();
        doDelete();
    }
    private void sendMessage() {
        AID r = new AID("Peter", AID.ISLOCALNAME);
        ACLMessage aclMessage = new
                ACLMessage(ACLMessage.REQUEST);
        aclMessage.addReceiver(r);
        aclMessage.setContent("Hello! How are you?");
        this.send(aclMessage);
    }
}
