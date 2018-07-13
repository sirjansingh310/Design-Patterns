package assignment.facade;

public class Psychiatrist implements Doctor {
    String days[] = {"Thursday","Friday","Saturday","Sunday"};
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
        System.out.println("Doctor: R. Agarwal(Psychiatrist)\nPatient Name: "+name+"Patient mobile number: "+mobile+
                "\nAppointment time:"+dayAndTime);
    }
}
