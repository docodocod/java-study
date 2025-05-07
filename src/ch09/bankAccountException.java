package ch09;

public class bankAccountException {
    public static void main(String[] args) {
        BankAccount account=new BankAccount(100000);
        try{
            account.deposit(50000);
            account.withdraw(200000);
        }catch(LowBalanceException e){
            System.out.println("오류:"+e.getMessage());
        }finally{
            System.out.println("현재 잔액:"+account.getBalance()+"원");
        }
    }
}
class LowBalanceException extends Exception{
    public LowBalanceException(String message){
        super(message);
    }
}
class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        this.balance=initialBalance;
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println(amount+"원이 입금되었습니다.");
        System.out.println("현재 잔액:"+balance+"원");
    }
    public void withdraw(double amount) throws LowBalanceException{
        System.out.println(amount+"원을 출금합니다.");
        if(amount>balance){
            throw new LowBalanceException("잔액이 부족합니다.");
        }
        balance-=amount;
        System.out.println(amount+"원이 출금 됐습니다.");
        System.out.println("현재 잔액:"+balance+"원");
    }
    public double getBalance(){
        return balance;
    }
}
