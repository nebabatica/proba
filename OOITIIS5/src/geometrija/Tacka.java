package geometrija;

public class Tacka {
	private int x;
	private int y;

	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int novoX){
		x = novoX;
	}
	public void setY(int novoY){
		y = novoY;
	}

	public void pomeriNa(int novoX, int novoY){
		x = novoX;
		setY(novoY);
	}
	public void pomeriZa(int novoX, int novoY){
		x += novoX;
		y = y + novoY;
	}
	public double udaljenost(int x2, int y2){
		double dx = x - x2;
		double dy = y - y2;
		double rezultat = Math.sqrt(dx*dx + dy*dy);
		return rezultat;
	}
}
