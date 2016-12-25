class Dollar10Dispenser extends Dispencer {

    @Override
    public void getAmount(Currency currency){
        int m = currency.getMoney();
        System.out.print(m/10 + " 10 dollars bills + ");
    }
}
