import info.gridworld.actor.Bug;
public class SpiralBug  extends Bug{
	private int sideLength;
	private int steps;
	public SpiralBug(int length){
		sideLength = length;
	}
	public void act() {
		if (steps < sideLength && canMove()) {
			move();
			steps++;
		}
		else {
			turn();
			turn();
			sideLength++;
			steps = 0;
		}
	}
}