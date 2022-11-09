public class OneBHK {
    public  int roomarea;
    public int hallarea;
    public int price;
    OneBHK(){
        roomarea = 0;
        hallarea =0;
        price=0;
    }
    OneBHK(int roomarea,int hallarea,int price){
        this.roomarea = roomarea;
        this.hallarea = hallarea;
        this.price = price;
    }

    void  show(){
        System.out.println("\nRoom area : "+roomarea+"\nHall Area : "+hallarea+"\nPrice: "+price);
    }
}
