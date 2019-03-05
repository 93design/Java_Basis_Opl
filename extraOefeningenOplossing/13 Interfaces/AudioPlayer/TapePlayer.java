package AudioPlayer;

public class TapePlayer implements Recorder{
	
	boolean sound = false;
	boolean recording = true;
	@Override
	public void Play() {
		sound = true;
		System.out.println("TapePlayer is playing");
	}

	@Override
	public void Stop() {
		sound = false;
		System.out.println("TapePlayer is stopped");
	}

	@Override
	public void Pause() {
		sound = false;
		System.out.println("TapePlayer is paused");
	}

	@Override
	public void reverse() {
		sound = true;
		System.out.println("TapePlayer is stopped");
		
	}

	@Override
	public void record() {
		sound = true;
		recording = true;
		System.out.println("TapePlayer is stopped");
	}

}
