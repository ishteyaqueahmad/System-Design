public class Minister extends MPs {
    @Override
    public boolean exceedsSpendingLimit(){
        return this.getExpense()>1000000;
    }
}
