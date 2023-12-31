package org.designpattern.composite.simple;

public class CompositeRunner {
    public static void main(String[] args) {
        Component superComposite = new Composite("SUPER COMPOSITE");


        Component composite1 = new Composite("COMPOSITE 1(No Component)");

        Component composite2 = new Composite("COMPOSITE 2(1 Composite)");
        composite2.add(new Composite("EMPTY COMPOSITE"));

        Component composite3 = new Composite("COMPOSITE 3(1 Leaf)");
        composite3.add(new Leaf("LEAF",true));

        superComposite.add(composite1);
        superComposite.add(composite2);
        superComposite.add(composite3);

        Client client = new Client(superComposite);
        client.printStatus();
    }
}
