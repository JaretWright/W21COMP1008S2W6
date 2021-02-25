import java.time.LocalDate;

public class HourlyEmployee extends Employee{
    private double hourlyRate, hoursWorked;

    public HourlyEmployee(String firstName, String lastName, LocalDate birthday, double hourlyRate) {
        super(firstName, lastName, birthday);
        setHourlyRate(hourlyRate);
        hoursWorked=0;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate>= 14)
            this.hourlyRate = hourlyRate;
        else
            throw new IllegalArgumentException("hourly rate must be >= 14");
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
