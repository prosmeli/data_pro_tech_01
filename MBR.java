package exe01;

public class MBR {
    private double xMin;
    private double xMax;
    private double yMin;
    private double yMax;

    // Default Constructor
    public MBR() {}

    // Overloaded Constructor
    public MBR(double xMin, double xMax, double yMin, double yMax) {
        this.xMin = xMin;
        this.xMax = xMax;
        this.yMin = yMin;
        this.yMax = yMax;
    }

    // Copy Constructor
    public MBR(MBR other) {
        this.xMin = other.xMin;
        this.xMax = other.xMax;
        this.yMin = other.yMin;
        this.yMax = other.yMax;
    }

    public double getxMin() {
        return xMin;
    }

    public void setxMin(double xMin) {
        this.xMin = xMin;
    }

    public double getxMax() {
        return xMax;
    }

    public void setxMax(double xMax) {
        this.xMax = xMax;
    }

    public double getyMin() {
        return yMin;
    }

    public void setyMin(double yMin) {
        this.yMin = yMin;
    }

    public double getyMax() {
        return yMax;
    }

    public void setyMax(double yMax) {
        this.yMax = yMax;
    }

    @Override
    public String toString() {
        return "MBR{" +
                "xMin=" + xMin +
                ", xMax=" + xMax +
                ", yMin=" + yMin +
                ", yMax=" + yMax +
                '}';
    }
}
