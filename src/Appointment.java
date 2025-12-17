class Appointment {
    enum AppointmentStatus {
        SCHEDULED,
        COMPLETED
    }
    private Patient patient;
    private Doctor doctor;
    private String time;
    private AppointmentStatus status;

    public Appointment(Patient patient, Doctor doctor, String time) {
        if (patient == null || doctor == null || time == null || time.isEmpty()) {
            throw new IllegalArgumentException("Invalid appointment data");
        }
        this.patient = patient;
        this.doctor = doctor;
        this.time = time;
        this.status = AppointmentStatus.SCHEDULED;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public boolean isCompleted() {
        return status == AppointmentStatus.COMPLETED;
    }

    public void markCompleted() {
        if (status == AppointmentStatus.COMPLETED) {
            throw new IllegalStateException("Appointment already completed");
        }
        status = AppointmentStatus.COMPLETED;
    }
}
