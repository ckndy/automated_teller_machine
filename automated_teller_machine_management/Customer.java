package automatedtellermachine_management;

public class Customer {

  private String name;
  private int wallet;

  public Customer(String name, int wallet) {
    this.name = name;
    this.wallet = wallet;
  }

  public String getName() {
    return this.name;
  }

  public int getWallet() {
    return this.wallet;
  }

  public void withdrawCash(int cash, AutomatedTellerMachine automatedtellermachine) {
    this.wallet -= cash;
    automatedtellermachine.spitsOut(cash);
  }
}