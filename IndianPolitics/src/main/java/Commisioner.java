public class Commisioner {
    public static void main(String[] args) {
        MPs mps=new MPs();
        mps.setConstituncy("Siwan");
        mps.setExpense(1000000);
        mps.setVehicle(new Car());

        System.out.println(canArrest(mps));
    }

    private static boolean canArrest(MPs mps) {
        if(mps instanceof PM)
        return false;
        else if (mps instanceof Minister)
            return PM.issueArrestPermission(mps);
        else if (mps.exceedsSpendingLimit())
            return true;

        return false;

    }
}
