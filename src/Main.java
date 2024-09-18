
import model.*;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Vehicle> listOfVehicles = new ArrayList<>();

        Motorcycle moto1 = new Motorcycle("Honda", 5000.00, KindOfVehicle.MOTORCYCLE, 250);
        listOfVehicles.add(moto1);
        UtilitaryVehicle util1 = new UtilitaryVehicle("Traffic", 12000.00, KindOfVehicle.UTILITARY, 10000.00, 3.00);
        listOfVehicles.add(util1);
        RacingCar racing1 = new RacingCar("Ferrari", 20000.00, KindOfVehicle.AUTOMOBILE, 2, 300);
        listOfVehicles.add(racing1);
        UrbanVehicle urban1 = new UrbanVehicle("Ford", 8000.00, KindOfVehicle.AUTOMOBILE, 2,5);
        listOfVehicles.add(urban1);

        for (Vehicle v: listOfVehicles)
        {
            System.out.println(v);
        }
        System.out.println("\n\nPrices updates");
        for (Vehicle v: listOfVehicles)
        {
            List<Vehicle>newList = new ArrayList<>();
            Double percentage = 0d;
            if (v instanceof Motorcycle) percentage = 5d;
            if (v instanceof UtilitaryVehicle) percentage = 10d;
            if (v instanceof Automobile)percentage = 15d;
            if (v instanceof RacingCar) percentage = 20d;

            v.setPrice(v.calculatePrice(percentage));
            newList.add(v);
            System.out.println(v);
        }

        }
    }
