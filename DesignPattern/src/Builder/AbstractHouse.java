package Builder;

/**
 * 1) 需要建房子:这一过程为打桩、砌墙、封顶
 * 2)房子有各种各样的， 比如普通房，高楼，别墅，各种房子的过程虽然一样，但是要求不要相同的.
 * 3)请编写程序，完成需求.
 */
public abstract class AbstractHouse {
    //打地基
    public abstract void buildBasic();
    //砌墙
    public abstract void buildWalls();
    //盖屋顶
    public abstract void roofed();
    //盖房
    public abstract void build();
}

class CommonHouse extends AbstractHouse{

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

    @Override
    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}

