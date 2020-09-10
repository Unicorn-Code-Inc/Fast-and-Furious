package Fast-and-Furious;

public class myCar {

    String carColor = "Black";
    String carType = "Sports";
    String carBrand = "Dodge";
    String carName = "Challenger GTX";
    String carPlate = "GX 453 R";
    
    //starting the car
    void startCar(){
        System.out.println("Chrr vroom vroooooom...🔥🔥");
        System.out.println("Engine started.\n");
        System.out.println("Fuel: Full\nTemperature: 20℃\nGear: Neutral\nLights: Off\nDoors: Closed\n");
    }

    //some necessary steps to take before car's moved
    void gettingReady(String doors, String lights, String belt){
        System.out.print("\n");
        switch (doors.trim()) {
            case "open":
                System.out.println("Door is open.");
                break;
            case "close":
                System.out.println("Door closed");
                break;
            default:
                System.out.println("Doors are closed!"); 
        }
        switch (lights.trim()) {
            case "on":
                System.out.println("Lights turned on.");
                break;
            case "off":
                System.out.println("Lights turned off.");
                break;
                default:
                break;
        }
        switch (belt.trim()) {
            case "fasten":
                System.out.println("Seat belts have been fastened!");
                break;
            case "loose":
                System.out.println("Seat belts are loose, ⚠Warning: Fasten Seat Belt ⚠");
                break;
            default:
                break;
        }

    }

    //Moving the car
    void  moveCar(int Gear){
        switch(Gear){
            case 0:
            System.out.println("Gears placed at 0, car's not moving");
            break;
            case 1:
            System.out.println("Gears placed at 1, car's moving at 7 km per hr.");
            break;
            case 2:
            System.out.println("Gears at 2, car's moving a bit fast at 9 km per hr.");
            break;
            case 3 :
            System.out.println("Gears at 3, car's moving fast at 12 km per hr.");
            break;
            case 4 :
            System.out.println("Gears at 4, car's moving very fast at 15 km per hr. ");
            break;
            case 5:
            System.out.println("Gears at 5, car's moving at top speed, ⚠ Warning: Be Careful ⚠");
        }

    }
}
