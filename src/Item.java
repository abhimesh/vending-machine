public class Item {
    String Name;
    String code;
    int price;
    Item(String Name,String code,int price)
    {
        this.code=code;
        this.price=price;
        this.Name=Name;
    }

    public String getCode() {
        return code;
    }

    public int getPrice() {
        return price;
    }
}
