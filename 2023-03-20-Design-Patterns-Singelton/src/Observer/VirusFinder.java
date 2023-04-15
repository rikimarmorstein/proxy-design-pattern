package Observer;

public class VirusFinder {

	private VirusFinderObserver observer;

	public void setVirusFinderObserver(VirusFinderObserver observer) {
		this.observer = observer;
	}

	public void scan() {

		for (int i = 1; i <= 10; i++) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

			// Demo for finding virus:
			String virus = Math.random() * 100 + ".exe";

			// We must not display here anything!
			if (observer != null) {
				observer.onVirusFound(virus); // To report
			}

		}

	}

	public interface VirusFinderObserver {
		void onVirusFound(String virus);
	}

}
