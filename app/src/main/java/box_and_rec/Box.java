package box_and_rec;

public class Box {
    private float width;
    private float height;
    private float depth;
    private char materialType;
    private double weight;

    public Box(float width, float height, float depth, char materialType, double weight) {
        setWidth(width);
        setHeight(height);
        setDepth(depth);
        setMaterialType(materialType);
        setWeight(weight);
    }

    public float calculateVolume() {
        return width * height * depth;
    }

    public boolean isHeavierThan(Box other) {
        return this.weight > other.weight;
    }

    public boolean equals(Box other) {
        return this.width == other.width && this.height == other.height &&
        this.depth == other.depth && this.materialType == other.materialType;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getDepth() {
        return depth;
    }

    public char getMaterialType() {
        return materialType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWidth(float width) {
        if(width > 0){
            this.width = width;
        } 
        else {
            this.width = 1.0f;
        }
    }

    public void setHeight(float height) {
        if(height > 0){
            this.height = height;
        } 
        else {
            this.height = 1.0f;
        }
    }

    public void setDepth(float depth) {
        if(depth > 0){
            this.depth = depth;
        } 
        else {
            this.depth = 1.0f;
        }
    }

    public void setMaterialType(char materialType) {
        if(materialType == 'P' || materialType == 'M' || materialType == 'W') {
            this.materialType = materialType;
        } 
        else {
            this.materialType = 'P';
        }
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Rec toRec() {
        return new Rec((int) this.width, (int) this.height, 'R', 1.0f);
    }
}
