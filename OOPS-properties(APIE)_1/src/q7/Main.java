package q7;

abstract class Hospital {
	
	String name;
    String location;
    int totalBeds;
    int totalstaff;
    String establishedYear;
    
	public Hospital(String name, String location, int totalBeds, int totalstaff, String establishedyear) {
		super();
		this.name = name;
		this.location = location;
		this.totalBeds = totalBeds;
		this.totalstaff = totalstaff;
		this.establishedYear = establishedyear;
	}
	
	abstract void displayDetails();
    abstract void addRecord();
    abstract void updateRecord();
    abstract void deleteRecord();
    abstract void getRecords();
}

class Doctor extends Hospital {
    private String specialization;
    private int experience;
    private String doctorID;
    private String shiftTiming;
    private double salary;

    public Doctor(String name, String location, int totalBeds, int totalStaff, String establishedYear,
                  String specialization, int experience, String doctorID, String shiftTiming, double salary) {
        super(name, location, totalBeds, totalStaff, establishedYear);
        this.specialization = specialization;
        this.experience = experience;
        this.doctorID = doctorID;
        this.shiftTiming = shiftTiming;
        this.salary = salary;
    }

    @Override
    void displayDetails() {
        System.out.println("Doctor: " + doctorID + " - " + specialization + ".Experience(yrs):" + experience + ". Shift -" + shiftTiming+ "Salary: "+salary);
    }

    @Override
    void addRecord() { System.out.println("Doctor added successfully."); }

    @Override
    void updateRecord() { System.out.println("Doctor record updated."); }

    @Override
    void deleteRecord() { System.out.println("Doctor record deleted."); }

    @Override
    void getRecords() { System.out.println("Fetching all doctors..."); }
}

class Patient extends Hospital {
    private String patientID;
    private int age;
    private String disease;
    private String admissionDate;
    private String dischargeDate;

    public Patient(String name, String location, int totalBeds, int totalStaff, String establishedYear,
                   String patientID, int age, String disease, String admissionDate, String dischargeDate) {
        super(name, location, totalBeds, totalStaff, establishedYear);
        this.patientID = patientID;
        this.age = age;
        this.disease = disease;
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
    }

    @Override
    void displayDetails() {
        System.out.println("Patient: " + patientID + " - " + disease + "Age: "+ age+ "Duration of stay:"+ admissionDate+ "-"+ dischargeDate);
    }

    @Override
    void addRecord() { System.out.println("Patient added successfully."); }

    @Override
    void updateRecord() { System.out.println("Patient record updated."); }

    @Override
    void deleteRecord() { System.out.println("Patient record deleted."); }

    @Override
    void getRecords() { System.out.println("Fetching all patients..."); }
}



public class Main {
public static void main(String[] args) {
	Doctor doc = new Doctor("Stro hospital", "Mumbai", 100, 1000, "1989", "Surgeon", 8, "1", "Morning", 50000);
    doc.displayDetails();
    doc.addRecord();

    Patient pat = new Patient("Stro Hospital", "Mumbai York", 500, 200, "1990",
            "P1", 30, "Flu", "2025-02-10", "2025-02-15");
    pat.displayDetails();
    pat.addRecord();
	
	
}
}
