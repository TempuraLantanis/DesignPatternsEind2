public class SpoilerDecorator extends CarDecorator implements decoratorInt {
    public SpoilerDecorator(Car decoratedCar) {
      super(decoratedCar);
      decoratedCar.setExtra_style(10);
      addSpoiler();
    }
  
    @Override
    public void displayStats() {
      super.displayStats();
    }


    private void addSpoiler() {
        System.out.println("Adding a spoiler to the car.");
    }


    @Override
    public void execute(){
        addSpoiler();
    }
}
  

  

  