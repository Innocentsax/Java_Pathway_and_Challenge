package ComputerFactory;

public class Monitor extends Product{
    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println(String.format("Drawing pixel at %d,%d in color %s ", x, y, color));
    }
}
