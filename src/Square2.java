/**
 * Created by Frank Hall on 6/25/2016.
 */
public class Square2 extends GeometricFigure2 //child of GeometricFigure
{
    public Square2(int height, int width, String figure) //constructor
    {
        super(height, width, figure);//refers to the variables in the parent class
    }

    public double figureArea(int height, int width)//the method that was abstract in the parent class. this will determine the area for triangle and square
    {
        double area;
        int side;
        side = width;
        area = side * side;
        return area;
    }


}
