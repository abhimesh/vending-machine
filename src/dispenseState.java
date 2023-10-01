import java.util.List;

public class dispenseState implements state {
    private final Item item;
    vendingMachine machine;
    dispenseState(vendingMachine machine,Item item){
        this.machine=machine;
        this.item=item;
        try {
            dispenseItem(machine,item.getCode());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void clickonInsertCoinsButton(vendingMachine machine) throws Exception {
        throw new Exception("Please collect the item ");
    }

    @Override
    public void insertCoins(vendingMachine machine, Coins coin) throws Exception {
        throw new Exception("Please collect the item ");
    }

    @Override
    public void selectItems(vendingMachine machine, String code) throws Exception {
        throw new Exception("Please collect the item ");
    }

    @Override
    public void refund(vendingMachine machine,String code) throws Exception {
        throw new Exception("Please collect the item ");
    }

    @Override
    public void clickOnProductSelectionButton(vendingMachine machine) throws Exception {
        throw new Exception("Please collect the item ");
    }

    @Override
    public void dispenseItem(vendingMachine machine, String code) throws Exception {
        List<Item> ItemList=machine.getItem();
        System.out.println("your item :" + ItemList.get(0).Name);
        ItemList.remove(item);
        machine.setItem(ItemList);
        machine.setMachineState(new IdleState());

    }
}
