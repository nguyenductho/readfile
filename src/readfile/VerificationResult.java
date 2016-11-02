package readfile;

public class VerificationResult {
	int retry, data, locations, transitions, symbolicStates, mdpStates, mdpTransitions, mdpChoices;

	public int getRetry() {
		return retry;
	}

	public void setRetry(int retry) {
		this.retry = retry;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getLocations() {
		return locations;
	}

	public void setLocations(int locations) {
		this.locations = locations;
	}

	public int getTransitions() {
		return transitions;
	}

	public void setTransitions(int transitions) {
		this.transitions = transitions;
	}

	public int getSymbolicStates() {
		return symbolicStates;
	}

	public void setSymbolicStates(int symbolicStates) {
		this.symbolicStates = symbolicStates;
	}

	public int getMdpStates() {
		return mdpStates;
	}

	public void setMdpStates(int mdpStates) {
		this.mdpStates = mdpStates;
	}

	public int getMdpTransitions() {
		return mdpTransitions;
	}

	public void setMdpTransitions(int mdpTransitions) {
		this.mdpTransitions = mdpTransitions;
	}

	public int getMdpChoices() {
		return mdpChoices;
	}

	public void setMdpChoices(int mdpChoices) {
		this.mdpChoices = mdpChoices;
	}
}
