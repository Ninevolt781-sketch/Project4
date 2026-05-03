package test;
import model.Car;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

;

class VehicleTest{
    
    @Test
    void testingConstructor(){
        Car testingCar = new Car();
        assertEquals(500, testingCar.calculateRent(1));

        //use cd "c:\Users\david\Downloads\Project_4"
// java -cp "bin;lib\junit-platform-console-standalone-1.9.3.jar" org.junit.platform.console.ConsoleLauncher --scan-classpath
    }

}