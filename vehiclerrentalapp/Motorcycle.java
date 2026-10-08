/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerrentalapp;

/**
 *
 * @author User
 */
public class Motorcycle extends Vehicle {

    public Motorcycle(String vehicleID, String brand, String model, int year, int RentalDays , double dailyRate , double HelmetFee) {
        super(vehicleID, brand, model, year, RentalDays);
    }

    @Override
    public double calculateRentalFee() {
        return (RentalDays * dailyRate) + helmetFee ;
    }

    @Override
    public String displayVehicleType() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void displayVehicleInfo() {
       
    }
    
    
    
}
