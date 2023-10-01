public class Main {
    public static void main(String[] args) throws Exception {
        vendingMachine machine=new vendingMachine();
        Item item101=new Item("Pepsi","101",25);
        Item item102=new Item("Pepsi","102",10);

        Item item103=new Item("Pepsi","103",1);
        Item item104=new Item("Coke","104",50);
        Item item105=new Item("Coke","105",100);
        Item item106=new Item("Coke","106",50);
        Item item107=new Item("Mountain dew","107",50);
        Item item108=new Item("Mountain dew","108",25);
        Item item109=new Item("Mountain dew","109",25);

        machine.addItem(item101);
        machine.addItem(item102);machine.addItem(item103);machine.addItem(item104);machine.addItem(item105);machine.addItem(item106);machine.addItem(item107);
        machine.addItem(item108);machine.addItem(item109);

        state state= machine.getMachineState();
        state.clickonInsertCoinsButton(machine);
        state=machine.getMachineState();
        state.insertCoins(machine,Coins.COPPER);
        state.insertCoins(machine,Coins.SILVER);
        state.insertCoins(machine,Coins.SILVER);
        state=machine.getMachineState();
        state.clickOnProductSelectionButton(machine);

        state=machine.getMachineState();
        state.selectItems(machine,"102");

    }
}