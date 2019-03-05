package AudioPlayer;

public class CDPlayer implements Player{
	boolean sound = true;
	@Override
	public void Play() {
		sound = true;
		System.out.println("CD is playing");
	}

	@Override
	public void Stop() {
		sound = true;
		System.out.println("CD is Stopped");
	}

	@Override
	public void Pause() {
		sound = true;
		System.out.println("CD is Paused");
	}

	@Override
	public void reverse() {
		sound = true;
		System.out.println("CD is Being reversed: sounds like a deamon");
	}

}
