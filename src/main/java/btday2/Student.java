package btday2;

public class Student {
    private DrawCircle drawCircle;

    public DrawCircle getDrawCircle() {
        return drawCircle;
    }

    public void setDrawCircle(DrawCircle drawCircle) {
        this.drawCircle = drawCircle;
    }

    public void drawCircle(){
        drawCircle.draw();
    }

}
