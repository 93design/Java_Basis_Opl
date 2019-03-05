package AudioPlayer;

public class DvdPlayer implements Player {
	
	boolean sound = false;
	@Override
	public void Play() {
		sound = true;
		System.out.println("Dvd is playing");
	}

	@Override
	public void Stop() {
		sound = false;
		System.out.println("Dvd is stopped");
	}

	@Override
	public void Pause() {
		sound = false;
		System.out.println("Dvd is Paused");
	}

	@Override
	public void reverse() {
		sound = true;
		System.out.println("Dvd had gone to loadScreen");
	}

}
