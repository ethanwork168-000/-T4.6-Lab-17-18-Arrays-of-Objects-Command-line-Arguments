public class Invoice {
    private String invNumber;
    private Item[] itemList;
    private int itemCount;

    public Invoice(String invNumber, int itemNum) {
        this.invNumber = invNumber;
        this.itemList = new Item[itemNum];
        this.itemCount = 0;
    }

    public String getInvNumber() {
        return invNumber;
    }

    public Item[] getItemList() {
        return itemList;
    }

    public int getItemCount() {
        return itemCount;
    }

    public Item getItem(int index) {
        return itemList[index];
    }

    public void addItem(String productCode, double price, int quantity) {
        if (itemCount < itemList.length) {
            itemList[itemCount] = new Item(productCode, price, quantity);
            itemCount++;
        } else {
            System.out.println("Failed to add new item; max already");
        }
    }

    public double getTotalValue() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            if (itemList[i] != null) {
                total += itemList[i].getItemTotal();
            }
        }
        return total;
    }
}
