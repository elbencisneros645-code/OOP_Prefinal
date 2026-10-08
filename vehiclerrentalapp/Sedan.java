/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerrentalapp;

/**
 *
 * @author User
 */
public class Sedan extends Vehicle {

    public Sedan(String vehicleID, String brand, String model, int year, int RentalDays , double dailyRate , double insuranceFee) {
        super(vehicleID, "Sedan ", model, year, RentalDays );
    }

    

    @Override
    public double calculateRentalFee() {
        
        return (RentalDays * dailyRate ) + insuranceFee;
        
    }

    @Override
    public String displayVehicleType() {
        
        return "Sedan ";
        
    }

    @Override
    public void displayVehicleInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

    
    
    
}
