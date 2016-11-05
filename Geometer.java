public class Geometer extends Turtle {
	public Geometer() {
		super();
	}
public void asterisk(int points, double length){ //Draw a set of lines with given length all radiating out from one point
	for(int i = 0; i<=points; i++){
		super.move(length);
		super.move(-length);
		super.rt(360./points);
	}
	super.penUp();
}

public void asterisks(int points, double length){ //Draws sequence of asterisks with given points and lengths, each new asterix after the first is 4/5 the length of previous 
	while(points>0){
		asterisk(points, length);
		lt(360./points);
		penDown();
		length = length * .8;
		move(length);
		points --;

}
}

public void stack(int boxes){ //Draws a stack of squares
	for(int i = boxes; i>0; i--){
		for(int j = 0; j<4; j++){
			super.move(1);
			super.rt();
		}
	 super.move(1);
	}
	penUp();	
}


public void stacks(int boxes){ //Draw a sequence of stacks, starting with the given size and trailing off to the right one stack size smaller
	for(int k = boxes; k>0; k--){
		penDown();
		stack(k);
		move(-k);
		rt();
		move(1);
		lt();
		}
}

public void doubleStacks(int boxes){ //Draws stack with the given number of boxes, then smaller stacks trailing off to both sides
	stacks(boxes);
	lt();
	move(2*boxes - 1);
	rt();
	for(int m = boxes-1; m>0; m--){
		penDown();
		stack(boxes-m);
		move(-(boxes-m));
		rt();
		move(1);
		lt();
	}
	
}

public void polygon(int sides){ //Draws polygon with specified number of sides
	int angle = 180 - ((180*(sides-2))/sides);
	for(int i = 0; i<sides; sides--){
		super.move(1);
		super.rt(angle);
}
}

public void polygons(int sides){ //Draws series of polygons, from a triangle up to the number of sides given
	for(int i = 3; i<=sides; i++){
		polygon(i);
	}
}

public void star(int points, double angle){ //draws a star with given points and angle 
	for(int a = 1; a<=points; a++){
		move(1);
		rt(180-angle);
		move(1);
		lt((180*(points-2)/points)-angle);
		
	}
	
}
public void stars(int points, double angle){//draws a sequence of stars from 2 points to the given points 
	for(int b = 2; b<=points; b++){
		star(b, angle);
	}
}

}
