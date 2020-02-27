package Builder;

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

