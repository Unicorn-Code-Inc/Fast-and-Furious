package practice_java;

public class FastandFurious {
      
    public static void main(String[] args) {
      
    	myCar Torreto = new myCar();
    	System.out.println("Once upon a time...\n\n[Engines reviving]");
    	Torreto.startCar();
    	System.out.println("[Torreto] Ride or die.\n[Letty] Ride or die.");
    	Torreto.gettingReady("closed", "on", "loose");
    	System.out.println("\n[Announcer] Ladies and Gentlemen, This is New York!  Are you readyyy....\n[Torreto's engine] Vrhooam vhroooaaam\n[Letty's engine] Vroom Vroooom\n\n");
    	int gears = 0;
    	while(gears < 6) {
    		Torreto.moveCar(gears);
    		gears++;
    		if(gears == 3) {
    			System.out.println("\nLetty is winnng the race\n[Location] the time square.\n");
    		}
    		else if(gears == 5) {
    			System.out.println("\n[Police reporting...] this is the NYPD patrol unit, there's an ongoing race around the time square.");
    			System.out.println("[Police reporting...] suspects two, main suspect Torreto.\n[Police reporting...] Car: "+Torreto.carBrand+" "+Torreto.carName);
    			System.out.println("[Police reporting...] Car color: "+Torreto.carColor+"\n[Police reporting...] Car plate: "+Torreto.carPlate+"\n");
    		}
    		else if(gears == 6) {
    			System.out.println("\n[Torreto] Opens nitro\nHe's went pass Letty.\n[Location] at the finish line.\nTorreto wins the race, now trying to escape the police.");
    		}
    	}

    }
    
}