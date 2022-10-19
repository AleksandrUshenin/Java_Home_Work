package Lesson6;
public class BaseNoteBook {
    protected String name;
    protected String idConfig;
    protected String windowsSise;
    protected String ram;
    protected String memory;
    protected String processor;
    protected String typeWindows;
    protected String color;

    public BaseNoteBook(String name, String idConfig, String windowsSise,
                        String ram, String memory, String processor, String typeWindows, String color) {
        this.name = name;
        this.idConfig = idConfig;
        this.windowsSise = windowsSise;
        this.ram = ram;
        this.memory = memory;
        this.processor = processor;
        this.typeWindows = typeWindows;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getIdConfig() {
        return idConfig;
    }

    public String getWindowsSise() {
        return windowsSise;
    }

    public String getRam() {
        return ram;
    }

    public String getMemory() {
        return memory;
    }

    public String getProcessor() {
        return processor;
    }

    public String getTypeWindows() {
        return typeWindows;
    }

    public String getColor() {
        return color;
    }
}
