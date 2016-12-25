public abstract class Dispencer {
    public Dispencer next;

    public abstract void getAmount(Currency currency);
    public void setNext(Dispencer next){
        this.next = next;
    }
}