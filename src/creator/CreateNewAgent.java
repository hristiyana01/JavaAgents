package creator;

import jade.core.Agent;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import restaurant.meal.CookRecipe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateNewAgent extends Agent {
    @Override
    protected void setup() {
        System.out.println("My local name is " + getLocalName());
        System.out.println("Hello World! My name is " + getAID());
        String name = "Tom";
        ContainerController c = getContainerController();
        try {
            AgentController a = c.createNewAgent(name, "hello.Agent001", null);
            a.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
