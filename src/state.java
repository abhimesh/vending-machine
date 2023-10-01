public interface state {

    void clickonInsertCoinsButton(vendingMachine machine) throws Exception;
    void insertCoins(vendingMachine machine,Coins coin) throws Exception;
    void selectItems(vendingMachine machine,String code) throws Exception;
    void refund(vendingMachine machine,String code) throws Exception;
    void clickOnProductSelectionButton(vendingMachine machine) throws Exception;
    void dispenseItem(vendingMachine machine,String code) throws Exception;

}
