public class Card implements Comparable<Card> {
    int number;
    String type;

    static String[] types = {"Spades","Clubs","Diamonds","Hearts"};
    static int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13};

    public Card(String type, int number){
        this.type =type;
        this.number=number;
    }

    @Override
    public int compareTo(Card o){
        return Integer.compare(this.number,o.number);
    }

    @Override
    public String toString(){
        return "Type: "+ type +"   number: "+number;
    }
}
