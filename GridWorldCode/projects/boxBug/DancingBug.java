import info.gridworld.actor.Bug;
import java.util.*;
public class DancingBug  extends Bug{
	private int[] turns;
	private int count;
	private int moves;
	public DancingBug(int[] turns){
		this.turns = turns;
		count = this.turns.length;
		moves = 0;
	}
	public void act() {
		if (moves == count){
			moves = 0;
		}
		for (int x = 0; x < turns[moves]; x++){
			turn();
		}
		moves++;
	}
}