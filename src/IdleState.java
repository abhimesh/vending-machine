import java.util.ArrayList;

public class IdleState implements state{
    IdleState()
    {

    }
    @Override
    public void clickonInsertCoinsButton(vendingMachine machine) {
        machine.setMachineState(new HasMoney());
    }

    @Override
    public void insertCoins(vendingMachine machine, Coins coin) throws Exception {
        throw new Exception("coins cannot be inserted in Idle state please press Insert Button first");
    }

    @Override
    public void selectItems(vendingMachine machine, String code) throws Exception{

        throw new Exception(" cannot select Item in Idle state please Insert coins first");
    }

    @Override
    public void refund(vendingMachine machine, String code) throws Exception {

    }

    @Override
    public void clickOnProductSelectionButton(vendingMachine machine) throws Exception {

    }

    @Override
    public void dispenseItem(vendingMachine machine, String code) throws Exception {

    }


}
