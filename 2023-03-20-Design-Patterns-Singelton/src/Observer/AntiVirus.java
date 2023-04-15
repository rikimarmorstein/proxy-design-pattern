package Observer;

public class AntiVirus implements VirusFinder.VirusFinderObserver {

	public void start() {
		VirusFinder finder = new VirusFinder();
		finder.setVirusFinderObserver(this); // To register
		finder.scan();
	}

	@Override
	// Display found virus:
	public void onVirusFound(String virus) {
		System.out.println("Found virus: " + virus);
	}

}
