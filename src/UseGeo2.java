/**
 * Created by Frank Hall on 6/25/2016.
 */
public class UseGeo2
{
    public static void main(String[]args)
    {
        GeometricFigure2[] figure = new GeometricFigure2[2];// makes an array of GeometricFigures
        figure[0] = new Triangle2(10,15, "Triangle");// assigns the values to the constrctors of the child classes
        figure[1] = new Square2(12, 12, "Square"); // assigns the values to the constrctors of the child classes

        for(int x = 0; x < figure.length; x++)// for statement to print out the array items.
        {
            String val = figure[x].getFigure();
            System.out.println("\nThe area of a " +
                    figure[x].getFigure() + " is: " + figure[x].figureArea(figure[x].getHeight(), figure[x].getWidth()));
            System.out.println("The number of sides are: ");
            figure[x].displaySides(val);
            // the above print out says to get figure[x].getFigure(name of the figure; Triangle, square) and also go to the figurearea method and get the height and width.
            //figure area has the perameters of figure[x].getHeight(), figure[x].getWidth() so it know what info to get from the method.
        }

    }
}
