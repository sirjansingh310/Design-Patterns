package assignment.facade;
import java.util.Scanner;
public class SynDocMain {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ABC hospital appointment booking portal\n"+"You can book an appointment with the following doctors");
        System.out.println("1) Dr A. Mathur(Cardiologist)\n2) Dr P. Agarwal(Anesthesiologist)\n3) Dr K. Sharma(Plastic Surgeon)\n" +
                "4) Dr M. Reddy(Ophthalmologist)\n5) Dr R. Agarwal(Psychiatrist)\n6) Dr K.L Reddy(Gynecologist)\n" +
                "7) Dr M. Khan(Neurologist)\n8) Dr J. Thakur(Gastroenterologist)\n9)Dr P. Singh(Oncologist)\n" +
                "10) Dr A. Verma(Dermatologist)");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        DoctorFacade doctor;
        if(choice>=1 && choice<=10) {
            doctor = new DoctorFacade(choice);
            doctor.bookAppointment();
        }
        else
            System.out.println("Invalid choice");



    }
}
