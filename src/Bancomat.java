public class Bancomat {

    public void Money(int money) {
        Dollar10Dispenser ten = new Dollar10Dispenser();
        Dollar20Dispenser twenty = new Dollar20Dispenser();
        Dollar100Dispenser hundred = new Dollar100Dispenser();
        hundred.next = twenty;
        twenty.next = ten;

        hundred.getAmount(new Currency(money));


    }
}
