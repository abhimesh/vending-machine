import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class selectionstate implements state {
    @Override
    public void clickonInsertCoinsButton(vendingMachine machine) throws Exception {
        System.out.println("Not able to insert any coin please select Item");
    }

    @Override
    public void insertCoins(vendingMachine machine, Coins coin) throws Exception {
        System.out.println("Not able to insert any coin please select Item");
    }

    @Override
    public void selectItems(vendingMachine machine, String code) throws Exception {
        List<Item> ItemList=machine.getItem().stream().filter(x-> x.getCode().equals(code)).toList();
        int sum=0;
        for(int i=0;i<machine.getCoinsList().size();i++)
        {sum=sum+machine.getCoinsList().get(i).value;}
        if(sum>=ItemList.get(0).price)
        {
            refund(machine,code);
            machine.setMachineState(new dispenseState(machine,ItemList.get(0)));

        }
        else {
            throw new Exception("insufficent Amount");
        }



    }

    @Override
    public void refund(vendingMachine machine,String code) throws Exception {
        List<Item> ItemList=machine.getItem().stream().filter(item -> item.getCode().equals(code)).toList();
        int sum=0;
        for(int i=0;i<machine.getCoinsList().size();i++)
        {
            sum=sum+machine.getCoinsList().get(i).value;
        }
        System.out.println("Your Refund is :"+ Integer.toString(sum-ItemList.get(0).getPrice()));
        machine.setTotalselling(machine.getTotalselling()+sum-ItemList.get(0).getPrice());
        machine.setCoinsList(new ArrayList<>());
    }

    @Override
    public void clickOnProductSelectionButton(vendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void dispenseItem(vendingMachine machine, String code) throws Exception {
        System.out.println("please select the Item");
    }
}
