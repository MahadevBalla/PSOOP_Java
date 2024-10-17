import java.util.Date;

class Person {
    protected String name;
    protected Date date;

    public Person(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Date: " + date;
    }
}

class Doctor extends Person {
    private String specialty;
    double fees;
    double income;

    public Doctor(String name, Date date, String specialty, double fees) {
        super(name, date);
        this.specialty = specialty;
        this.fees = fees;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return super.toString() + ", Specialty: " + specialty + ", Fees: " + fees + ", Income: " + income;
    }
}

class Patient extends Person {
    private Doctor doctor;

    public Patient(String name, Date date, Doctor doctor) {
        super(name, date);
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Doctor: " + doctor.name;
    }
}

class Billing {
    private Patient patient;
    private Doctor doctor;
    private Date date;
    private double amountDue;

    public Billing(Patient patient, Doctor doctor, Date date, double amountDue) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.amountDue = amountDue;
    }

    @Override
    public String toString() {
        return "Patient: " + patient.name + ", Doctor: " + doctor.name + ", Date: " + date + ", Amount Due: " + amountDue;
    }
}

public class clinic {
    public static void main(String[] args) {
        // Creating doctors
        Doctor doctor1 = new Doctor("Dr. Smith", new Date(), "Pediatrician", 100);
        Doctor doctor2 = new Doctor("Dr. Johnson", new Date(), "Cardiologist", 150);

        // Creating patients
        Patient patient1 = new Patient("John", new Date(), doctor1);
        Patient patient2 = new Patient("Alice", new Date(), doctor2);

        // Creating billing records
        Date billingDate = new Date();
        Billing billing1 = new Billing(patient1, doctor1, billingDate, calculateBill(patient1, billingDate, doctor1));
        Billing billing2 = new Billing(patient2, doctor2, billingDate, calculateBill(patient2, billingDate, doctor2));

        // Printing billing records
        System.out.println("Billing Records:");
        System.out.println(billing1);
        System.out.println(billing2);

        // Updating doctor income
        updateDoctorIncome(doctor1, billingDate);
        updateDoctorIncome(doctor2, billingDate);

        // Printing doctor details after updating income
        System.out.println("\nDoctor Details:");
        System.out.println(doctor1);
        System.out.println(doctor2);
    }

    private static double calculateBill(Patient patient, Date billingDate, Doctor doctor) {
        Date admittedDate = patient.date;
        long daysAdmitted = (billingDate.getTime() - admittedDate.getTime()) / (1000 * 60 * 60 * 24);
        double patientBill = daysAdmitted * 2000 + doctor.fees * daysAdmitted;
        return patientBill;
    }

    private static void updateDoctorIncome(Doctor doctor, Date billingDate) {
        Date admittedDate = doctor.date;
        long daysSinceAdmission = (billingDate.getTime() - admittedDate.getTime()) / (1000 * 60 * 60 * 24);
        doctor.setIncome(doctor.income + (doctor.fees * daysSinceAdmission));
    }
}