public class TwoBHK extends  OneBHK{
    public int room2Area;

    TwoBHK(int roomarea,int hallarea,int price, int room2Area ){
        super(roomarea,hallarea,price);
        this.room2Area = room2Area;

    }
    void show(){
        super.show();
        System.out.println("Room 2 area : "+room2Area);
    }
}
