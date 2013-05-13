package uk.co.news.international;

/**
 * this class will hold the information of coordinates
 * @author Arsalan
 *
 */
public class Coordinate {
	
	private int x;
	private int y;
	
	Coordinate(){
		x = 0;
		y = 0;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void increaseX(){
		x++;
	}
	public void decreaseX(){
		x--;
	}
	public void increaseY(){
		y++;
	}
	public void decreaseY(){
		y--;
	}

}
