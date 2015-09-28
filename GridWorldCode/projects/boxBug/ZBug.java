import info.gridworld.actor.Bug;
public class ZBug  extends Bug{
	private int sideLength;
	private int steps;
	private int counter;
	public ZBug(int length){
		turn();
		turn();
		sideLength = length;
	}
	public void act() {
		if (steps < sideLength && canMove()) {
			move();
			steps++;
		}
		else if (counter != 2){
			turn();
			turn();
			turn();
			steps = 0;
			counter++;
			if (counter == 2){
				turn();
				turn();
			}
		}
	}
}