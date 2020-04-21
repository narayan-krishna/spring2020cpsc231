


public class Card{
  private String value;
  private String suit;

  public Card(){
    value = "X";
    suit = "X";
  }

  public Card(String value, String suit){
    this.value = value;
    this.suit = suit;
  }

  public void setValue(String value){
    this.value = value;
  }

  public String getValue(){
    return value;
  }

  public void setSuit(String suit){
    this.suit = suit;
  }

  public String getSuit(){
    return suit;
  }

  public int getWorth(){
    if(value.equals("2")){
      return 2;
    }else if(value.equals("3")){
      return 3;
    }else if(value.equals("4")){
      return 4;
    }else if(value.equals("5")){
      return 5;
    }else if(value.equals("6")){
      return 6;
    }else if(value.equals("7")){
      return 7;
    }else if(value.equals("8")){
      return 8;
    }else if(value.equals("9")){
      return 9;
    }else if(value.equals("10")){
      return 10;
    }else if(value.equals("J")){
      return 11;
    }else if(value.equals("Q")){
      return 12;
    }else if(value.equals("K")){
      return 13;
    }else{
      return 14;
    }
  }

  public boolean equals(Card card){
    if((this.value).equals(card.getValue()) && (this.suit).equals(card.getSuit())){
      return true;
    }else{
      return false;
    }
  }

  public String toString(){
    return value + suit;
  }
}
