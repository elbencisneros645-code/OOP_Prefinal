/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerrentalapp;

/**
 *
 * @author User
 */
public abstract class Vehicle {

    protected String vehicleID;
    protected String brand;
    protected String model;
    protected int year;
    protected int RentalDays;
    public double dailyRate;
    public double insuranceFee;
    public double driverFee;
    public double helmetFee;

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRentalDays(int RentalDays) {
        this.RentalDays = RentalDays;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getRentalDays() {
        return RentalDays;
    }
    

    public Vehicle(String vehicleID, String brand, String model, int year, int RentalDays ) {
        this.vehicleID = vehicleID;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.RentalDays = RentalDays;
    }

    public abstract double calculateRentalFee();
     public abstract String displayVehicleType();
     public abstract void displayVehicleInfo();

    public static int getVehicleCount() {
        return 3;
    }

    public void displayVechielInfo() {

        System.out.println("==================Vehicle Information================");
        System.out.println("Vehicle ID; " + vehicleID);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year " + year);
        System.out.println("Rental Days:" + RentalDays);
        System.out.println("DailyRate " + dailyRate);
        System.out.println("insuranceFee" + insuranceFee);
        System.out.println("driverFee" + driverFee);
        System.out.println("helmetFee" + helmetFee);
    }

}
