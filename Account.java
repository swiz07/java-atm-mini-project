public class Account{
  String name;
  int pin;
  double balance;
  int accountNum;


  Account(String name, double balance, int accountNum){
    this.name=name;
    this.balance=balance;
    this.accountNum=accountNum;
  }

//checks balance method
  void checkBalance(){
    System.out.println(this.balance);
  }

//deposit money method
  void depositMoney(int deposit){
    this.balance=this.balance+deposit;
    System.out.println(this.balance);
  }

//withdraw money method
  void withdrawMoney(int withdraw){
    if(withdraw>this.balance){
        System.out.println("You cannot withdraw");
    }else{
      this.balance=this.balance-withdraw;
      System.out.println("withdraw: "+ this.balance);
    }
  }

//changes the pin
  void changePin(int updatePin){
    this.pin=updatePin;
    System.out.println("Your pin has been updated");
  }
}