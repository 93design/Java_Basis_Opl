package graphics;



@SuppressWarnings("rawtypes")
public class Drawing implements Drawable {
	
	private final int MAX = 10;

	private Drawable[] drawables = new Drawable[MAX];

	private int size = 0;


	public void add(Drawable d) {
		if (!present(d)) {
			int location = getFreeLocation();
			drawables[location] = d;
			size++;
		}
	}

	public void clear() {
		drawables = new Drawable[100];
		size = 0;
	}

	

	private int getFreeLocation() {
		for (int i = 0; i < drawables.length; i++) {
			if (drawables[i] == null)
				return i;
		}
		// Create new array
		Drawable[] temp = new Drawable[drawables.length + MAX];
		for (int i = 0; i < drawables.length; i++) {
			temp[i] = drawables[i];
		}
		int location = drawables.length;
		drawables = temp;

		return location;
	}



	public int getSize() {
		return size;
	}

	/* Private methods */
	private boolean present(Drawable s) {
		for (int i = 0; i < drawables.length; i++) {
			if (s.equals(drawables[i]))
				return true;
		}
		return false;
	}

   public void remove(Drawable d) {
		for (int i = 0; i < drawables.length; i++) {
			if (d.equals(drawables[i])) {
				drawables[i] = null;
				size--;
				return;
			}
		}
	}
	
	public void scale(int factor) {
		for (int i = 0; i < drawables.length; i++) {
			if (drawables[i] != null) {
				drawables[i].scale(factor);
			}
		}
	}

	public Drawable[] getDrawables() {
		return drawables;
	}

	public void setDrawables(Drawable[] drawables) {
		this.drawables = drawables;
	}
	
	
}
