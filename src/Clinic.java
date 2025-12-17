import java.util.ArrayList;
import java.util.List;

class Clinic {
    private String name;
    private List<Appointment> appointments;

    public Clinic(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Clinic name cannot be empty");
        }
        this.name = name;
        this.appointments = new ArrayList<>();
    }

    public Appointment scheduleAppointment(Patient patient, Doctor doctor, String time) {
        Appointment appointment = new Appointment(patient, doctor, time);
        appointments.add(appointment);
        return appointment;
    }

    public void complete(Appointment appointment) {
        if (!appointments.contains(appointment)) {
            throw new IllegalArgumentException("Appointment not found in this clinic");
        }
        appointment.markCompleted();
    }
}
