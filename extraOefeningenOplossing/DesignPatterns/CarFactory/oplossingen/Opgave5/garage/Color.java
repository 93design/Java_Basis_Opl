package garage;

import java.util.Arrays;

/**
 * The enumerates the possible values of a color  
 * @author Jamie Goegebeur
 */
public enum Color {
	BLACK(0,0,0),
	WHITE(255,255,255),
	RED(255,0,0),
	GREEN(0,255,0),
	BLUE(0,0,255),
	YELLOW(0,255,255);
	
	private int[] rgb = new int[3];
	
	private Color(int r,int g,int b){
		this.rgb[0] = r;
		this.rgb[1] = g;
		this.rgb[2] = b;
	}
	
	/**
	 * Gets the RGB value. 
	 * @return The RGB value. 
	 */
	public int getRgb() {
		return rgb[0] + rgb[0] + rgb[0];
	}

	@Override
	public String toString(){
		return name() + " rgb=(" + rgb[0] +", " + rgb[1]  + ", " +  rgb[2]+ ")";
	}
}
