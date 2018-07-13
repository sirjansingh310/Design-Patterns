package assignment.facade;

import java.util.Scanner;

public class DoctorFacade {
    int type;
    Doctor doc = null;
    DoctorFacade(int type){
        this.type = type;
        switch (type) {
            case 1:
                doc = new Cardiologist();
                break;
            case 2:
                doc = new Anesthesiologist();
                break;
            case 3:
                doc = new PlasticSurgeon();
                break;
            case 4:
                doc = new Ophthalmologist();
                break;
            case 5:
                doc = new Psychiatrist();
                break;
            case 6:
                doc = new Gynecologist();
                break;
            case 7:
                doc = new Neurologist();
                break;
            case 8:
                doc = new Gastroenterologist();
                break;
            case 9:
                doc = new Oncologist();
                break;
            case 10:
                doc = new Dermatologist();
                break;

        }


    }
    public void bookAppointment()
    {
      System.out.print("Please choose day: ");
      doc.showAvailableDays();
      Scanner sc = new Scanner(System.in);
      String day = sc.nextLine();
      System.out.print("Please choose time:\n 1)Morning 2)Evening 3)Night");
      String time = sc.nextLine();
      System.out.print("Enter your name:");
      String name = sc.nextLine();
      System.out.print("Enter mobile number:");
      String mobile= sc.nextLine();
      System.out.print("An OTP is sent to your mobile. Enter OTP:");
      String otp = sc.nextLine();
      time= day+" "+time;
      System.out.println();
      doc.confirmAppointment(name,mobile,time);

    }


}
