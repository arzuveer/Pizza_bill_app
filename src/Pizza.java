public class Pizza {
    private int price;
    private boolean isVeg;
    private String bill;
    private int toppings;//toppings price varies for veg and non-veg

    boolean isExtraCheeseAdded;
    boolean isExtraToppingsAdded;
    boolean isBillCreated;
    boolean isTakeAway;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        if (isVeg) {
            this.price = 300;
            this.toppings = 70;
        } else {
            this.price = 400;
            this.toppings = 120;
        }
        /*this.isExtraCheeseAdded = false;
        this.isExtraToppingsAdded = false;
        this.isBillCreated = false;
        this.isTakeAway = false;*/

        this.bill="Base Price Of The Pizza: "+ this.price+"\n";

    }

    public int getPrice() {
        return price;
    }
    public void addExtraCheese()
    {
      if(!isExtraCheeseAdded)
      {
          this.price+=80;
          this.isExtraCheeseAdded=true;
      }
    }
    public void addExtraToppings()
    {
        if(!isExtraToppingsAdded)
        {
            this.price += this.toppings;
            this.isExtraToppingsAdded= true;
        }
    }
    public void addTakeAway()
    {
       if(!isTakeAway)
       {
           this.price += 20;
           this.isTakeAway= true;
       }
    }
    public String getBill()
    {
        if(!isBillCreated) {
            if (isExtraCheeseAdded)
                this.bill += "Extra Cheese Added: 80" + "\n";
            if (isExtraToppingsAdded)
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            if (isTakeAway)
                this.bill += "PaperBag Added: 20" + "\n";

            this.bill += "Total Price: " + this.price;
            this.isBillCreated=true;
            return this.bill;
        }
       return "Bill generated already";
    }
}
