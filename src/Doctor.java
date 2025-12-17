class Doctor {
    private String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Doctor name cannot be empty");
        }
        this.name = name;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void consult(Patient patient, Appointment appointment) {
        if (appointment.isCompleted()) {
            throw new IllegalStateException("Appointment already completed");
        }

        if (appointment.getDoctor() != this || appointment.getPatient() != patient) {
            throw new IllegalArgumentException("Doctor or patient mismatch");
        }

        patient.addHistoryRecord(this, "General consultation completed");
    }
}

