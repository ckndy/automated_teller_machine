import org.junit.*;
import static org.junit.Assert.assertEquals;
import automated_teller_machine_management.*;

public class CustomerTest {

  AutomatedTellerMachine automatedtellermachine;
  Customer customer;

  @before
  public void before() {
    automatedtellermachine = new AutomatedTellerMachine(???, 250, "Ashton Lane")
    customer = new Customer("Chris Kennedy", ???);
  }

  @Test
  public void customerHasName() {
    assertEquals("Chris Kennedy", customer.getName());
  }

  @Test
  public void canWithdrawCash() {
    customer.withdrawCash(???, automatedtellermachine);
    assertEquals(???, customer.getWallet());
    assertEquals(???, automatedtellermachine.getCash());
  }
}