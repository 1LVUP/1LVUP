package box_and_rec;

public class App {
    public static void main(String[] args) {
        Box box1 = new Box(6.0f, 5.3f, 2.1f, 'M', 10.5);
        Box box2 = new Box(3.1f, 8.0f, 0.8f, 'W', 6.3);

        System.out.println("Box1의 가로: " + box1.getWidth() + ", 세로: " + box1.getHeight() + ", 높이: " + box1.getDepth()
                            + ", Box1의 재질타입: " + box1.getMaterialType() + ", 무게: " + box1.getWeight());
        System.out.println("Box2의 가로: " + box2.getWidth() + ", 세로: " + box2.getHeight() + ", 높이: " + box2.getDepth()
                            + ", Box2의 재질타입: " + box2.getMaterialType() + ", 무게: " + box2.getWeight());

        System.out.println("Box1의 부피: " + box1.calculateVolume());
        System.out.println("Box2의 부피: " + box2.calculateVolume());

        System.out.println("Box1이 Box2보다 무겁습니까? " + box1.isHeavierThan(box2));
        System.out.println("Box2이 Box1보다 무겁습니까? " + box2.isHeavierThan(box1));

        System.out.println("Box1과 Box2가 동일합니까? " + box1.equals(box2));

        Rec rec1 = box1.toRec();
        System.out.println("Box1에서 변환된 Rec의 가로: " + rec1.getWidth());
        System.out.println("Box1에서 변환된 Rec의 세로: " + rec1.getHeight());

        Rec rec2 = new Rec(5, 4, 'B', 0.5f);
        Rec rec3 = new Rec(2, 8, 'G', 1.0f);

        System.out.println("Rec2의 가로: " + rec2.getWidth() + ", 세로: " + rec2.getHeight() 
                            + ", 색깔 코드 " + rec2.getColorCode() + "테두리 두께: "+rec2.getBorderThickness());
        System.out.println("Rec3의 가로: " + rec3.getWidth() + ", 세로: " + rec3.getHeight()
                            + ", 색깔 코드 " + rec3.getColorCode() + "테두리 두께: "+rec3.getBorderThickness());

        System.out.println("Rec1의 면적: " + rec1.calculateArea());
        System.out.println("Rec2의 면적: " + rec2.calculateArea());
        System.out.println("Rec3의 면적: " + rec3.calculateArea());

        System.out.println("Rec1와 Rec2의 면적이 동일합니까? " + rec1.hasSameArea(rec2));
        System.out.println("Rec2와 Rec3의 면적이 동일합니까? " + rec2.hasSameArea(rec3));
        System.out.println("Rec3와 Rec1의 면적이 동일합니까? " + rec3.hasSameArea(rec1));

        Box box3 = new Box(-0.8f, -1.2f, 5.4f, 'R', 10.5);
        System.out.println("Box3의 가로: " + box3.getWidth() + ", 세로: " + box3.getHeight() + ", 높이: " + box3.getDepth()
                            + ", 재질타입: " + box3.getMaterialType() + ", 무게: " + box3.getWeight());

        Rec rec4 = new Rec(-5, -7, 'P', 2.5f);
        System.out.println("Rec4의 가로: " + rec4.getWidth() + ", 세로: " + rec4.getHeight()
                            + ", 색깔 코드 " + rec4.getColorCode() + ", 테두리 두께: "+rec4.getBorderThickness());
    }
}

