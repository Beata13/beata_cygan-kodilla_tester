package bank;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    CashMachine cashMachine = new CashMachine();

    @Test
    public void shouldAddTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(-300);

        int[] values = cashMachine.getTransaction();
        assertEquals(2, values.length);
        assertEquals(200, values[0]);
        assertEquals(-300, values[1]);
    }

    @Test
    public void shouldReturnSumTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(0);
        cashMachine.addTransaction(-200);
        assertEquals(100, cashMachine.sumTransaction());
    }

    @Test
    public void shouldCountPositivesTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(0);
        cashMachine.addTransaction(-200);
        assertEquals(1, cashMachine.countPositiveTransactions());
    }

    @Test
    public void shouldCountNegativeTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(0);
        cashMachine.addTransaction(-200);
        assertEquals(1, cashMachine.countNegativeTransactions());
    }

    @Test
    public void shouldGetAveragePositivesTX() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-200);
        assertEquals(200, cashMachine.getAveragePositiveTransactions(), 0.01);
    }

    @Test
    public void shouldGetNegativePositivesTX() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(-200);
        assertEquals(100, cashMachine.getAverageNegativeTransactions(), 100);


    }

    @Test
    public void shouldCalculateBalance() {
        Bank bank = new Bank();

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine1.addTransaction(100);
        cashMachine2.addTransaction(300);
        bank.addNewCashMachine(cashMachine1);
        bank.addNewCashMachine(cashMachine2);
        int balance = bank.balance();
        assertEquals(400, balance);
    }

    @Test
    public void shouldCountPosTX() {
        Bank bank = new Bank();

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine1.addTransaction(100);
        cashMachine2.addTransaction(-200);
        bank.addNewCashMachine(cashMachine1);
        bank.addNewCashMachine(cashMachine2);
        int PosTX = bank.CashMachinesPositiveTransactions();
        assertEquals(1, PosTX);

    }

    @Test
    public void shouldCountNegTX() {
        Bank bank = new Bank();

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine1.addTransaction(100);
        cashMachine2.addTransaction(-200);
        cashMachine2.addTransaction(-50);
        bank.addNewCashMachine(cashMachine1);
        bank.addNewCashMachine(cashMachine2);
        int NegTX = bank.CashMachinesNegativeTransactions();
        assertEquals(2, NegTX);

    }

    @Test
    public void shouldCountAveragePosTX() {
        Bank bank = new Bank();

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine1.addTransaction(100);
        cashMachine2.addTransaction(100);
        bank.addNewCashMachine(cashMachine1);
        bank.addNewCashMachine(cashMachine2);
        double PosAverage = bank.CashMachinesPosAverage();
        assertEquals(100, PosAverage);

    }

    @Test
    public void shouldCountAverageNegTX() {
        Bank bank = new Bank();

        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine1.addTransaction(-100);
        cashMachine2.addTransaction(-100);
        bank.addNewCashMachine(cashMachine1);
        bank.addNewCashMachine(cashMachine2);
        double PosAverage = bank.CashMachinesPosAverage();
        assertEquals(-100, PosAverage);
    }
}
