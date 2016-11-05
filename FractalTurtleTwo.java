//alphabet: xfy
//start: yf
//rules
//1: 'X'to 'YF+XF+Y'
//2:'Y' to 'XF-YF-X'


public class FractalTurtleTwo extends Turtle {
	public FractalTurtleTwo() {
		super();
	}

	// DEBUG: System.out.println(f.bob("XF", "XF+Y", "YF-X", 2))
	// FractalTurtleTwo f = new FractalTurtleTwo()
	// bob the builder makes an l system based on the given rules
	
public String bob(String axiom, String xRep, String yRep, int level)
	{
		if(level == 0)
		{
			return axiom;
		}
		else
		{
			axiom = axiom.replaceAll("X", "K");
			axiom = axiom.replaceAll("Y", yRep);
			axiom = axiom.replaceAll("K", xRep);
			return bob(axiom, xRep, yRep, level-1);
		}
	}

	// gogh draws out the shape using the given angle
	public void gogh(String l, double ang)
	{
		for(int i = 0; i < l.length(); ++i)
		{
			String c = l.substring(i, i+1);
			if(c.equals("F"))
			{
				move();
			}
			else if (c.equals("+")) {
				rt(ang);
			}
			else if (c.equals("-")) {
				lt(ang);
			}
			else if (c.equals("[")){
				rt(ang/2);
			}
			else if (c.equals("]")){
				lt(ang/2);
			}
			else if (c.equals("Z")){
				move(1/Math.sqrt(2));
			}
		}
	}

// Draws the arrowhead fractal
	public void arrowhead(int level)
	{
		String lsyst = bob("YF", "YF+XF+Y", "XF-YF-X", level);
		gogh(lsyst, 60);
	}

// Draws the dragon curve fractal
	public void dragon(int level)
	{
		String lsyst = bob("FX", "X+YF+", "-FX-Y", level);
		gogh(lsyst, 90);
	}

//Draws the hilbert curve fractal
	public void hilbert(int level)
	{
		String lsyst = bob("X", "+YF-XFX-FY+", "-XF+YFY+FX-", level);
		gogh(lsyst, 90);
	}
	
//Draws the peanoGosper curve fractal
	public void peano(int level)
	{
		String lsyst = bob("X", "X+YF++YF-FX--FXFX-YF+", "-FX+YFYF++YF+FX--FX-Y", level);
		gogh(lsyst, 60);
	}
	
	public void tree(int level)
	{
		String lsyst = bob("F-F-F-F-F-FX", "+[Z+Z-Z-Z-ZZ+Z+Z+ZY", "F-F-F-F-F-FX+[Z+Z-Z-Z-ZZ+Z+Z+ZY", level);
		gogh(lsyst, 90);
	}
}
