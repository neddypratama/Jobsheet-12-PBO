package percobaan1;

public class ElectricityBill implements Payable {
    private int kwh;
    private String category;

    public ElectricityBill(String category, int kwh) {
        this.kwh = kwh;
        this.category = category;
    }

    public int getKwh() {
        return kwh;
    }

    public void setKwh(int kwh) {
        this.kwh = kwh;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int getPaymentAmount() {
        return kwh * getBasePrice();
    }

    public int getBasePrice() {
        int bprice = 0;
        switch(category) {
            case "R-1" : bprice = 100; break;
            case "R-2" : bprice = 200; break;
        }
        return bprice;
    }

    public String getBillInfo() {
        return "kwh = " +kwh + "\n" + 
                "Category = " + category + "(" + getBasePrice() + " per kWH)\n";
    }
}
