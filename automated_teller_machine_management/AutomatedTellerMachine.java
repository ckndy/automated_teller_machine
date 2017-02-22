package automated_teller_machine_management;

public class AutomatedTellerMachine {

  private String location;
  private int cash;
  private int maxwithdrawal;
  

  public AutomatedTellerMachine(String location, int cash, int maxwithdrawal) {
    this.location = location;
    this.cash = cash;
    this.maxwithdrawal = maxwithdrawal;
    
  }

  public String getLocation() {
    return this.location;
  }

  public int getCash() {
    return this.cash;
  }

  public int getMaxWithdrawal() {
    return this.maxwithdrawal;
  }

  public void withdrawCash(int cash) {
    this.cash -= cash;
  }
}