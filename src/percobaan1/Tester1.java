package percobaan1;

public class Tester1 {
    public static void main(String[] args) {
        PermanenEmployee pEmp = new PermanenEmployee("Dedik", 500);
        IntershipEmployee iEmp = new IntershipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill("A-1", 5);

        Employee e;
        Payable p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }
}
