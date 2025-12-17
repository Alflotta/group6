public class Main {
    public static void main(String[] args) {

        Clinic clinic = new Clinic("City Health Clinic");
        Doctor doctor = new Doctor("Smith", "Therapist");
        Patient patient = new Patient("Alice");

        Appointment appointment =
                clinic.scheduleAppointment(patient, doctor, "10:00 AM");

        doctor.consult(patient, appointment);
        clinic.complete(appointment);

        System.out.println("Appointment status: " + appointment.getStatus());
        System.out.println("Patient medical history:");
        for (String record : patient.getMedicalHistory()) {
            System.out.println("- " + record);
        }
    }
}
