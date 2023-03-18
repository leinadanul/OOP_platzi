package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient  extends  User {

    private String birthday;
    private Double weight;
    private Double height;
    private String bloodType;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void AddAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public Patient(String name, String email) {
        super(name, email);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return this.weight + "Kg.";
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + "Mts.";
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nAge: " + birthday +
                "\nWeight: " + weight +
                "\nHeight: " + height +
                "\nBloodType: " + bloodType;
    }

    @Override
    public void showData() {
        System.out.println("Patient");
        System.out.println("Medical record: not have ");

    }
}
