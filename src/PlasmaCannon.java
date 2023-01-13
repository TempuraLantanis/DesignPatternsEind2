import PlasmaCannonEngines.Facade;

public class PlasmaCannon extends CarDecorator{

    Facade plasmaCannon = new Facade();


    public PlasmaCannon(Car decoratedCar) {
            super(decoratedCar);
    }


    public void fire(){
        plasmaCannon.fireCannon("Magic Missile");

    }

    @Override
    public void execute() {
        fire();
    }
}
