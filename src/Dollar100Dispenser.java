class Dollar100Dispenser extends Dispencer{

    @Override
    public void getAmount(Currency currency){
        {
            int m = currency.getMoney();
            next.getAmount(new Currency(m%100));
            System.out.print(m/100 + " 100 dollars bills ");
        }
}
}
