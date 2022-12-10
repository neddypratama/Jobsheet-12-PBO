package percobaan1;

public class IntershipEmployee extends Employee {
    private int length;

    public IntershipEmployee(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    } 

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo()+ "\n";
        info += "Registered as intership employee for " + length + "month/s\n";
        return info;
    }
}
