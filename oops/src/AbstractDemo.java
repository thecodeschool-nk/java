import java.util.Date;

public class AbstractDemo {

    public static void main(String[] args) {
//        Doctor doctor = new Doctor();
        Doctor doctor = new Physician();

//        doctor.visitWard();
    }
}

abstract class Doctor {
    private Date shiftStartTime;
    private Date shiftEndTime;

    public Doctor() {
        super();
        this.shiftStartTime = new Date();
        System.out.println("Doctor constructor");
    }

    public abstract void visitWard();

    public void attendPatient() {
        System.out.println("Attending Patient");
    }
}

class Physician extends Doctor {

    public Physician() {
        super();
        System.out.println("Physician constructor");
    }

    @Override
    public void visitWard() {
        System.out.println("Physician visiting ward");
    }
}
