package restaurant.agents;

import jade.core.Agent;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;

import java.util.Scanner;

public class EntryRecipeAgent extends Agent {
    protected void setup() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Recipe: ");

        String mealName = scan.nextLine();

        scan.close();

        ContainerController controller = getContainerController();

        Object[] arg = {mealName};

        try {
            AgentController a = controller.createNewAgent("Cooker", "restaurant.agents.MealAgent", arg);

            a.start();
        } catch (StaleProxyException e) {
            e.printStackTrace();
        }

        doDelete();
    }
}
