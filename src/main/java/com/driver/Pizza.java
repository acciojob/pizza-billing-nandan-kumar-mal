package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;
    private int toppingPrice;
    private int takeAwayPrice;

    boolean isCheeseAdded;
    boolean isToppingsAdded;

    boolean isTakeAwayAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.cheesePrice=80;
        this.takeAwayPrice=20;

        if(isVeg){
            this.price=300;
            this.toppingPrice=70;

        }else{
            this.price=400;
            this.toppingPrice=120;
        }
        this.isCheeseAdded=false;
        this.isToppingsAdded=false;
        this.isTakeAwayAdded=false;
        this.isBillGenerated=false;

        this.bill="Base Price Of The Pizza: "+this.price+"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            this.price=this.price+this.cheesePrice;
            isCheeseAdded=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded==false){
            this.price=this.price+this.toppingPrice;
            isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded==false){
            this.price=this.price+this.takeAwayPrice;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false){
            if(isCheeseAdded==true){
                this.bill=this.bill+"Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(isToppingsAdded==true){
                this.bill=this.bill+"Extra Toppings Added: "+this.toppingPrice+"\n";
            }
            if(isTakeAwayAdded==true){
                this.bill=this.bill+"PaperBag Added: "+this.takeAwayPrice+"\n";
            }
            this.bill=this.bill+"Total Price: "+this.price+"\n";

            isBillGenerated=true;
        }
        return this.bill;
    }
}
