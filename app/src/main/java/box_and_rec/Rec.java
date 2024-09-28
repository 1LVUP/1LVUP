package box_and_rec;

public class Rec {
    private int width;
    private int height;
    private char colorCode;
    private float borderThickness;

    public Rec(int width, int height, char colorCode, float borderThickness) {
        setWidth(width);
        setHeight(height);
        setColorCode(colorCode);
        setBorderThickness(borderThickness);
    }

    public int calculateArea() {
        return width * height;
    }

    public boolean hasSameArea(Rec other) {
        return this.calculateArea() == other.calculateArea();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public char getColorCode() {
        return colorCode;
    }

    public float getBorderThickness() {
        return borderThickness;
    }

    public void setWidth(int width) {
        if(width > 0){
            this.width = width;
        } 
        else {
            this.width = 1;
        }
    }

    public void setHeight(int height) {
        if(height > 0){
            this.height = height;
        } 
        else {
            this.height = 1;
        }
    }

    public void setColorCode(char colorCode) {
        if(colorCode == 'R' || colorCode == 'G' || colorCode == 'B') {
            this.colorCode = colorCode;
        }
        else {
            this.colorCode = 'R';
        }
    }

    public void setBorderThickness(float borderThickness) {
        this.borderThickness = borderThickness;
    }
}
