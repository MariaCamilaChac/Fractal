import processing.core.PApplet;

public class GUI_Fractal extends PApplet {

	
	public static void main(String [] Args ){
	PApplet.main("GUI_Fractal");	
	

	}
	int square_size = 8, width=50, heigth= 50, rule;
	
	Fractal ca = new Fractal ( width, heigth, rule );
	
	public void settings(){
		size(width*square_size, heigth * square_size);
		
	}
	
	public void draw(){
		
		background(50);
		
	
			for (int j = 0; j < width; j++) {
				
				if (ca.rule[j]==1)
					fill(0,255,0);
				else 
					fill(0);
				
				rect(j * square_size, initialize * square_size, square_size, square_size);
				
			}
			try{
				Thread.sleep(20);
				ca.generateFractal();
				
			}
			catch (Exception e){e.printStackTrace();}
			
		}
	}

