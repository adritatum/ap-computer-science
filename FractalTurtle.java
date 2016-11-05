import java.awt.Color;
public class FractalTurtle extends Turtle {
	private int hue;
	private int maxHue;
	public FractalTurtle() {
		super();
		hue = 0;
		maxHue = 100;

		}
	private void nextHue() {
	   hue = hue + 1;
	   if(hue >= maxHue) {
	      hue = 0;
	   }
		 setColor(Color.getHSBColor(hue / (float)maxHue, 1, 1));
	}

	public void koch(double num){ //creates a koch curve by dividing a line into 3 and replacing the middle segment with an equilateral then repeat for each of the new line segments  
		if(num < .1){
			nextHue();
			move(num);
		}else{
			nextHue();
			koch(num/3.);
			lt(60);
			nextHue();
			koch(num/3.);
			rt(120);
			nextHue();
			koch(num/3.);
			lt(60);
			nextHue();
			koch(num/3.);
		}
	}
		public void kochFractal(double num){ //makes a snowflake using the koch curve
			koch(num);
			rt(120);
			koch(num);
			rt(120);
			koch(num);
			rt(120);
		}

		public void hammer(double num){ //divides a line into four equal parts replaces the second part with a square above the line without the bottom base and then repeates with each of the new line segments
			if(num < .1){
				nextHue();
				move(num);
			}else{
				nextHue();
				hammer(num/4);
				lt();
				nextHue();
				hammer(num/4);
				rt();
				nextHue();
				hammer(num/4);
				rt();
				nextHue();
				hammer(num/4);
				lt();
				nextHue();
				hammer(num/4);
				nextHue();
				hammer(num/4);
			}
		}
			public void fractalHammer(double num){ //creates a square using the hammer fractal shape
				hammer(num);
				rt();
				hammer(num);
				rt();
				hammer(num);
				rt();
				hammer(num);
				rt();
			}

		public void dragon(double num){ //repeatedly divides a line into four equal parts replaces the second part with a square above the line without the bottom base and replaces the third section with a square below the line without a top basethen repeates with each of the new line segments
			if(num < .1){
				nextHue();
				move(num);
			}else{
				nextHue();
				dragon(num/4);
				lt();
				nextHue();
				dragon(num/4);
				rt();
				nextHue();
				dragon(num/4);
				rt();
				nextHue();
				dragon(num/2);
				lt();
				nextHue();
				dragon(num/4);
				lt();
				nextHue();
				dragon(num/4);
				rt();
				nextHue();
				dragon(num/4);
		}
	}

	public void fractalDragon(double num){ //draws a swastika like shape using the dragon fractal 
		dragon(num);
		rt();
		dragon(num);
		rt();
		dragon(num);
		rt();
		dragon(num);
	}
	public void wobble(double num){ //repeatedly divides a line in two and draws a thirty sixty ninety triangle above the first segment and a thirty sixty ninety triangle below the line
		if(num < 5){
			nextHue();
			move(num);
		}else{
			nextHue();
			wobble(num/2);
			rt(120);
			nextHue();
			wobble(num/2);
			lt(120);
			nextHue();
			wobble(num/2);
		}
	}
	public void p(double num){
		if(num<1){
			move(num);
	}else{
		p(num/3);
		lt(45);
		p(num/3);
		lt(135);
		p(num/3);
		rt(45);
		p(num/3);
		rt(135);
		p(2*num/3);
		rt(45);
		p(num/3);
		lt(45);

	}
}
}
