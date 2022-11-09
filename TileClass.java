import java.util.Scanner;

 class TileClass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length : ");
        Tile t  = new Tile(sc.nextInt());
        System.out.println("Enter the length and width : ");
        Tile.Floor f = new Tile.Floor(sc.nextInt(), sc.nextInt());
        f.totalTile(t);
    }
}
