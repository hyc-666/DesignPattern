package Builder.BuilderPattern;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通房屋打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房屋砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房屋盖屋顶");
    }
}
 class HighBuilding extends HouseBuilder{
     @Override
     public void buildBasic() {
         System.out.println("高楼打地基");
     }

     @Override
     public void buildWalls() {
         System.out.println("高楼砌墙");
     }

     @Override
     public void roofed() {
         System.out.println("高楼盖屋顶");
     }
 }