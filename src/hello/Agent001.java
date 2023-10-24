package hello;

import jade.core.Agent;
import jade.core.Location;

public class Agent001 extends Agent {
    protected void setup() {
        Location location = here();
        System.out.println("Agent Started: Hello World!");
        System.out.println("-----About Me:-----");
        System.out.println("My local name is: " + getLocalName());
        System.out.println("My globally unique name is: " + getName());
        System.out.println("-----About Here:-----");
        System.out.println("I am running in a location called:" + location.getAddress());
        System.out.println("Which is identified uniquely as: " + location.getID());
        System.out.println("And is contactable at: " + location.getAddress());
        System.out.println("Using the protocol: " + location.getProtocol());

        //make this agent terminate
        //doDelete();
    }
}
