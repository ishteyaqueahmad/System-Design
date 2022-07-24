public class MPs {
    private String constituncy;
    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    private int expense;

    public String getConstituncy() {
        return constituncy;
    }

    public void setConstituncy(String constituncy) {
        this.constituncy = constituncy;
    }

    public int getExpense() {
        return expense;
    }

    public void setExpense(int expense) {
        this.expense = expense;
    }

    public boolean exceedsSpendingLimit(){
        return expense>100000;
    }
}
