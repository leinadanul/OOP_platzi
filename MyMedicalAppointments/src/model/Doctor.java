package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor  extends User{

    private String speciality;
    private AvailableAppointment availableAppointment;
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();


    public Doctor(String name, String email){
        super(name, email);
       /* System.out.println("The name of the doctor is: " + name);
        this.speciality = speciality;

        */
    }

    @Override
    public String toString() {
        return super.toString() +"\nSpeciality: " +speciality+ "\nAvailable" + availableAppointments.toString();
    }

    @Override
    public void showData() {
        System.out.println("Employed hospital: Saint Thomas");
        System.out.println("Speciality: Oncology");
    }

    public void addAvailableAppointment(String date, String time){
        availableAppointments.add(new AvailableAppointment(date,time));
    }
    public  ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }


}
