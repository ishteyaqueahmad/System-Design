public class PM extends MPs{

    private Aircraft aircraft;

    @Override
    public boolean exceedsSpendingLimit(){
        return this.getExpense()>10000000;
    }
    public static boolean issueArrestPermission(MPs mPs){
        return mPs instanceof Minister && mPs.exceedsSpendingLimit();
    }
}
