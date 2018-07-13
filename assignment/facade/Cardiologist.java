package assignment.facade;

public class Cardiologist implements Doctor {
    String days[] = {"Tuesday","Wednesday","Thursday","Friday"};

    @Override
    public void showAvailableDays() {
        for(String day: days)
        {
            System.out.print(day+" ");
        }
    }

    @Override
    public void confirmAppointment(String name,String mobile,String dayAndTime) {
        System.out.println("Your Appointment is confirmed!");
        System.out.println("Here are the details");
        System.out.println("Doctor: Dr A. Mathur(Cardiologist)\nPatient Name: "+name+"Patient mobile number: "+mobile+
                "\nAppointment time:"+dayAndTime);
    }
}
