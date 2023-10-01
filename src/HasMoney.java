import java.util.ArrayList;
import java.util.Objects;

public class HasMoney implements state{
    @Override
    public void clickonInsertCoinsButton(vendingMachine machine) throws Exception{
        return;
    }

    @Override
    public void insertCoins(vendingMachine machine, Coins coin) throws Exception {
        machine.setCoinsList(coin);
        System.out.println("coin is added successfully");
    }
    @Override
    public void clickOnProductSelectionButton(vendingMachine machine) throws Exception
    {
        machine.setMachineState(new selectionstate());
    }

    @Override
    public void dispenseItem(vendingMachine machine, String code) throws Exception {
        System.out.println("Not able to dispense item please put the money and then select item");
    }

    @Override
    public void selectItems(vendingMachine machine, String code) throws Exception {
        System.out.println("Not able to select please insert coins first");
    }

    @Override
    public void refund(vendingMachine machine,String code) throws Exception {
        if (machine.getItem().stream().anyMatch(x -> Objects.equals(x.getCode(), code)))
        {       int sum = 0;
        for (int i = 0; i < machine.getCoinsList().size(); i++) {
            sum = sum + machine.getCoinsList().get(i).value;
        }
        System.out.println("you refund is :" + Integer.toString(sum));
        machine.setCoinsList(new ArrayList<>());
    }}
}
