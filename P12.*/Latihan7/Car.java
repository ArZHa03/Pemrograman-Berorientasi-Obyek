public abstract class Car implements Fuel {
    public void move(Fuel fuel) {
        fuel.runEngine();
    }

    public void loadBaggage() {
        System.out.println("Loading baggage");
    }
}