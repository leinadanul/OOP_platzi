package model;

public class Nurse  extends User{

    private String speciality;


    public Nurse(String name, String email) {
        super(name, email);
    }

    @Override
    public void showData() {
        System.out.println("Employed hospital: Royal health ");
        System.out.println("Speciality: Triage ");

    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
