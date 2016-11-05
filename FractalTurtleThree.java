public class FractalTurtleThree extends Object {
	public FractalTurtleThree() {
		super();
	}
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
public void sierpinski(){

	}
}