import java.util.Scanner;

 class Tile {
     int edge;
     int area;

     Tile(int edge) {
         this.edge = edge;
         area = edge*edge;
         this.area = area;
     }

     static class Floor {
         int length;
         int width;

         Floor(int length, int breadth) {
             this.length = length;
             this.width = breadth;
         }

         void totalTile(Tile t) {
             int TileArea = t.area;
             int FloorArea = length*width;
             int numTiles = FloorArea / TileArea;
             System.out.println("Number of tiles : " + numTiles);
         }
     }
 }
