import java.util.ArrayList;
import java.util.List;

public class vendingMachine {
    private state machineState;
    private List<Coins> coinsList;
    private List<Item> item;
    private int totalselling;
    vendingMachine()
    {
        machineState=new IdleState();
        coinsList=new ArrayList<>();
        item=new ArrayList<>();
        totalselling=0;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }
    public void addItem(Item Item)
    {
        item.add(Item);
    }
    public state getMachineState() {
        return machineState;
    }

    public void setMachineState(state machineState) {
        this.machineState = machineState;
    }

    public void setCoinsList(Coins coins) {
        coinsList.add(coins);
    }


    public List<Coins> getCoinsList() {
        return coinsList;
    }

    public List<Item> getItem() {
        return item;
    }

    public int getTotalselling() {
        return totalselling;
    }

    public void setTotalselling(int totalselling) {
        this.totalselling = totalselling;
    }

    public void setCoinsList(List<Coins> coinsList)
    {
        this.coinsList=coinsList;
    }
}
