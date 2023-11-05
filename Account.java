public class Account {

    private String id;
    private String name ;
    private int balance =0;
    public Account(String id, String name) {
this.name=name;
this.id=id;
    }
    public Account(String id, String name,int balance) {
        this.name=name;
        this.id=id;
        this.balance=balance;
    }

    public void setId(String id){
        this.id=id;

    }
    public void setName(String name){
        this.name=name;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
public String getId(){
return id;
}
public String getName(){
        return name;
}
public int getBalance(){
        return balance;
}
public int credit(int amount) {
    if (amount < balance){
        balance=amount-balance;
    }
    else System.out.println("The balance is insufficient");
        return balance;
}

    public int debit(int amount){
        balance=amount+balance;
        return balance;
    }
    public int transferTo( Account a2 ,int amount) {
        if (amount < balance){
            balance=amount-balance;
        }
        else System.out.println("The balance is insufficient");
        balance=amount+balance;

        a2.setBalance(a2.getBalance()+amount);
        return a2.getBalance();
    }
    public void toString1(){
        System.out.println("Account Name : "+getName());
        System.out.println("Account ID  :"+getId());
        System.out.println("Debit  :"+debit(60));
        System.out.println("credit :"+ credit(50));

    }
}
