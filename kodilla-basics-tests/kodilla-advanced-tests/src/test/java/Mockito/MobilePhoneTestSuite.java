package Mockito;

import com.kodilla.mockito.MobilePhone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MobilePhoneTestSuite {
    MobilePhone myPhone = Mockito.mock(MobilePhone.class);

    @Test
    public void testDefaultBehaviourOfTestDouble() {
        Assertions.assertFalse(myPhone.needsCharging());
        Assertions.assertEquals(0.0, myPhone.getFreeStorage());
    }
    @Test
    public void testExpectation() {
        Assertions.assertFalse(myPhone.needsCharging());
        Mockito.when(myPhone.needsCharging()).thenReturn(true);
        Assertions.assertTrue(myPhone.needsCharging());
    }
}