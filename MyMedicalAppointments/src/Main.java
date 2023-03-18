import model.*;

import java.util.Date;

import static ui.UIMenu.showMenu;

public class Main {
    public static void main(String[] args) {
        showMenu();



/*
        Doctor myDoc = new Doctor("luis", "Dentist");
        myDoc.addAvailableAppointment(String.valueOf(new Date()), "5pm");
        myDoc.addAvailableAppointment(String.valueOf(new Date()), "1pm");
        myDoc.addAvailableAppointment(String.valueOf(new Date()), "9pm");
        System.out.println(myDoc);

        User user = new Doctor("Carlo", "carlo@mail.com");
        user.showData();

        User userPa = new Patient("jose", "jose@mail.com");
        userPa.showData();

        User user1 = new User("maria", "maria@mail.com") {
            @Override
            public void showData() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Santo thomas de aquiles");
                System.out.println("Speciality: Dentist");
            }
        };
        user1.showData();
        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

 */

        /*

        for (model.AvailableAppointment aA: myDoc.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
            
        }
        model.Patient patient = new model.Patient("Maria", "mari@mail.com");
        System.out.println(patient);

         */




        /*model.Doctor myDoctor = new model.Doctor();
        myDoctor.name = "luis jose";
        myDoctor.showName();
        myDoctor.showId();

        model.Doctor myDoc = new model.Doctor();
        myDoctor.showId();

         */


        //showMenu();
      /*  model.Doctor myDoctor = new model.Doctor("Dany jose", "odontologist");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        model.Patient patient = new model.Patient("LUIS", "CARLO@MAIL.COM");
        patient.setWeight(55.5);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());

       */
    }
}