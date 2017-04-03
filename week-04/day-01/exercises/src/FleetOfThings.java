public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    fleet.add(new Thing("Get milk"));
    fleet.add(new Thing("Remove the obstacles"));
    fleet.add(newThingWithStatus("Stand up", true));
    fleet.add(newThingWithStatus("Remove the obstacles", true));

    System.out.println(fleet);
  }

  private static Thing newThingWithStatus(String thingName, boolean completed) {
    Thing newThing = new Thing(thingName);
    if (completed == true) {
      newThing.complete();
    }
    return newThing;
  }
}
