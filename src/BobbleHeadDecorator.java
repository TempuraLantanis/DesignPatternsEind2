public class BobbleHeadDecorator extends CarDecorator {
    public BobbleHeadDecorator(Car decoratedCar) {
      super(decoratedCar);
      decoratedCar.setcomfort(9999);
    }
  
    @Override
    public void displayStats() {
      addBobblehead();
      super.displayStats();
    }
  
    private void addBobblehead() {
      System.out.println("Adding a Bobble Head to the car.");

  }

  @Override
  public void execute(){
        addBobblehead();

  }


}


  

  

  