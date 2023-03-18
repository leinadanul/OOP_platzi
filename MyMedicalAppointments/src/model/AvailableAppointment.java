package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AvailableAppointment {
    private Integer id_availableAppointment;
    private Date date;
    private String time;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public AvailableAppointment(String date, String time) {
        try {
            this.date = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.time = time;
    }

    public Integer getId_availableAppointment() {
        return id_availableAppointment;
    }

    public void setId_availableAppointment(Integer id_availableAppointment) {
        this.id_availableAppointment = id_availableAppointment;
    }

    public Date getDate(String DATE) {
        return date;
    }
    public String getDate(){
        return format.format(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    @Override
    public String toString() {
        return "Available Appointment " +
                "\nDate: " + date +
                "\nTime: " + time;
    }
}
