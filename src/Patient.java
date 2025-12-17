import java.util.ArrayList;
import java.util.List;

class Patient {
    private String name;
    private List<String> medicalHistory;

    public Patient(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Patient name cannot be empty");
        }
        this.name = name;
        this.medicalHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addHistoryRecord(Doctor doctor, String note) {
        if (doctor == null || note == null || note.isEmpty()) {
            throw new IllegalArgumentException("Invalid history record");
        }
        medicalHistory.add("Consulted by Dr. " + doctor.getName() + ": " + note);
    }

    public List<String> getMedicalHistory() {
        return medicalHistory;
    }
}
