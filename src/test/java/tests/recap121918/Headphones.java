package tests.recap121918;

public class Headphones {
   private String type;
    private int price;
    private String soundQuality;


    public String getType(){
        return this.type;
    }
    public void setType(String type){
        if(!(type.equals("inEar") ||(type.equals("OverTheEar"))||(type.equals("onEar")))){
        this.type = type;
        }else{
            System.out.println("Invalid type");
        }

    }
    public String soundQuality(){
        return this.soundQuality;
    }
    public void setSoundQuality(String qual){
        if(!(qual.equals("poor")||(qual.equals("medium")||(qual.equals("high"))))){
            this.soundQuality = qual;
        } else {
            System.out.println("Data not matching");
        }
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        if(price > 50 && price<= 200){
            this.price = price;
        }else {
            System.out.println("Data not matching");
        }
    }
}

