class Dollar20Dispenser extends Dispencer{

    @Override
    public void getAmount(Currency currency)
    {
        int m = currency.getMoney();
        next.getAmount(new Currency(m%20));
        System.out.print(m/20 + " 20 dollars bills + ");
    }
}
