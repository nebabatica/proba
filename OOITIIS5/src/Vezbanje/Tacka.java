package Vezbanje;

public class Tacka {
private int x ;
private int y ;

public int getX(){
	return x ;

}	
public int getY(){
	return y ;
}
public void setX(int novoX){
	x = novoX ;
}
public void setY(int novoY){
	y = novoY ;
}
public void pomerZa(int novoX ,int novoY){
	x+=novoX ;
	y+=novoY ;
}
public void pomeriNa(int novoX ,int novoY){
	x = novoX ;
	y  = novoY ;
}
public double udaljenost (int x2 , int y2){
	int a =x-x2 ;
	int b = y-y2 ;
	double udaljen =Math.sqrt(a*a + b*b);
	return udaljen ;
}
}
