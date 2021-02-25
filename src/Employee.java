import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String firstName, lastName;
    private LocalDate birthday;
    private int employeeNum;
    private static int nextEmployeeNum = 10001;

    public Employee(String firstName, String lastName, LocalDate birthday) {
        setFirstName(firstName);
        setLastName(lastName);
        setBirthday(birthday);
        setEmployeeNum(nextEmployeeNum++);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        //can't be born in the future
        if (birthday.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("You cannot be an employee if born " +
                                                    "in the future");
        else if (getAge(birthday) < 14)
            throw new IllegalArgumentException("You must be at least 14 years old");
        else
            this.birthday = birthday;
    }

    private int getAge(LocalDate birthday)
    {
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String toString()
    {
        return String.format("%s %s employee number: %d ->%s",firstName,lastName,
                                        employeeNum, getClass());
    }
}
