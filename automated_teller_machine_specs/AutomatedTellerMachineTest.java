import org.junit.*;
import static org.junit.Assert.assertEquals;
import automated_teller_machine_management.*;

public class AutomatedTellermachineTest {

  AutomatedTellerMachine automatedtellermachine;

  @before 
  public void before() {
    automatedtellermachine = new AutomatedTellermachine(???, 250, "Ashton Lane");
  }

  @Test
  public void automatedTellerMachineHaslocation() {
    assertEquals("Ashton Lane", automatedtellermachine.getLocation());
  }

  @Test
  public void automatedTellerMachineHasCash() {
    assertEquals(???, automatedtellermachine.getCash());
  }

  @Test
  public void automatedTellerMachineHasMaxWithdrawal() {
    assertEquals(250, automatedtellermachine.getMaxWithdrawal());
  }

  // @Test
  // public void fillUP() {
  //   automatedtellermachine.withdrawCash(???);
  //   assertEquals(0, automatedtellermachine.cash());
  //   automatedtellermachine.fillUp(???);
  //   assertEquals(???, automatedtellermachine.getCash());

  // Uncertain if this was right?

  }
}



 