public class Account{
  String name;
  int pin;
  double balance;
  int accountNum;


  Account(String name, double balance, int accountNum, int pin){
    this.name=name;
    this.balance=balance;
    this.accountNum=accountNum;
    this.pin=pin;
  }

//checks balance method
  void checkBalance(){
    System.out.println("Here is the balance you have: "+ this.balance);
  }

//deposit money method
  void depositMoney(double deposit){
    if(deposit<=0){
        System.out.println("You cannot deposit");
    }
    else{
        this.balance=this.balance+deposit;
        System.out.println("Deposit: "+this.balance);
    }
  }

//withdraw money method
  void withdrawMoney(double withdraw){
    if(withdraw>this.balance || withdraw<=0){
        System.out.println("You cannot withdraw");
    } 
    else{
      this.balance=this.balance-withdraw;
      System.out.println("withdraw: "+ this.balance);
    }
  }

//changes the pin
  void changePin(int updatePin){
    this.pin=updatePin;
    System.out.println("Your pin has been updated");
  }

  boolean pinLogin(int input){
    if(input==this.pin){
        System.out.println("You are logged in!");
        return true;
    }
    else{
        System.out.println("Invalid PIN");
        return false;
    }
  }
}
