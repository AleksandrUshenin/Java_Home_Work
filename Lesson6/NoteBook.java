package Lesson6;
public class NoteBook extends BaseNoteBook {
    private double cost;
    private String marketName;

    public NoteBook(String name, String idConfig, String windowsSise,
                    String ram, String memory, String processor, String typeWindows, String color,
                    double cost, String marketName) {
        super(name, idConfig, windowsSise, ram, memory, processor, typeWindows, color);
        this.cost = cost;
        this.marketName = marketName;
    }

    public double getCost() {
        return cost;
    }

    public String getMarketName() {
        return marketName;
    }
    // @Override
    // public String toString() {
    //     return "%s %s %s %s %s %s %s %s %s %s".formatted(name, idConfig, windowsSise, ram, memory,
    //                 processor, typeWindows, color, cost, marketName);
    // }
    public String tags() {
        return name + " : " + idConfig + " : " + windowsSise + " : " + ram + " : " + memory + " : " +
                    processor + " : " + typeWindows + " : " + color + " : " + cost + " : " +  marketName;
    }
}
