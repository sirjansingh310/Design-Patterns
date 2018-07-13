package assignment.facade;

public interface Doctor {
    public void showAvailableDays();
    public void confirmAppointment(String name,String mobile,String dayAndTime);
}
