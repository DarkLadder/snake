package Element;

import Line.Grid;

import java.awt.*;

/**
 * Created by Dmitrii on 26.06.2017.
 */
public class ElemFood extends Element {
    public ElemFood(Grid grid, int x, int y) {
        super(grid, x, y);
    }

    @Override
    public void print(Graphics g) {
        g.setColor(Colors.clrCherry);
        g.fillOval(getXX(), getYY(), grid.getCellPx(), grid.getCellPx());
    }

    @Override
    public void clear(Graphics g) {
        g.setColor(Colors.clrBack);
        g.fillOval(getXX(), getYY(), grid.getCellPx(), grid.getCellPx());
    }

    @Override
    public Element getElement  (){
        return this;
    }
}
