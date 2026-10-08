/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiclerrentalapp;

/**
 *
 * @author User
 */
public class VehiclerRentalApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Vehicle("SD001", "Toyota", "Vios ", 2024, 3, "Sedan", 5, 000.00);
        vehicles[1] = new Vehicle("SD001", "Toyota", "HiAce ", 2023, 2, "Van", 7, 000.00);
        vehicles[2] = new Vehicle("SD001", "Honda", "Click 160 ", 2024, 4, "Motorcycle", 2, 600.00);

        System.out.println("===============DINA AND GAT RENT A RIDE SERVICE VEHICLE RENTAL SYSTEM=================");
        System.out.println("");

        for (Vehicle vehicle : vehicles) {
            vehicle.displayVechielInfo();
        }//Sir papasara rakan kos sir Please:(
    }

}
