package percobaan1;

public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill("R-1", 5);
        ow.pay(eBill); // pay for electricity bill
        System.out.println("----------------------------");

        PermanenEmployee pEmp = new PermanenEmployee("Dedik", 500);
        ow.pay(pEmp); // pay for permanent employee
        System.out.println("----------------------------");

        IntershipEmployee iEmp = new IntershipEmployee("Sunarto", 5);
        ow.showMyEmployee(pEmp); // show permanent employee info
        System.out.println("----------------------------");
        ow.showMyEmployee(iEmp); // show intership employee info
    }
}
