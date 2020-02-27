package Builder.BuilderPattern;

public class House {
    private String basic;
    private String walls;
    private String roof;

    public House(String basic, String walls, String roof) {
        this.basic = basic;
        this.walls = walls;
        this.roof = roof;
    }

    public House() {
    }

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }
}
