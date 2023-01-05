public class SpoilerDecorator extends CarDecorator {
    public SpoilerDecorator(Car decoratedCar) {
      super(decoratedCar);
      updateStyle(10);
    }
  
    @Override
    public void displayStats() {
      addSpoiler();
      super.displayStats();
    }
  
    private void addSpoiler() {
      System.out.println("Adding a spoiler to the car.");
    }
  }
  

  

  