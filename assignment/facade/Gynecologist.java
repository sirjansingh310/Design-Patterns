package assignment.facade;

public class Gynecologist implements Doctor {
    String days[] ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    @Override
    public void showAvailableDays() {
        for(String day: days){
            System.out.print(day+" ");
        }
    }

    @Override
    public void confirmAppointment(String name,String mobile,String dayAndTime) {
        System.out.println("Your Appointment is confirmed!");
        System.out.println("Here are the details");
        System.out.println("Doctor: Dr K.L Reddy(Gynecologist)\nPatient Name: "+name+"Patient mobile number: "+mobile+
                "\nAppointment time:"+dayAndTime);
    }
}
