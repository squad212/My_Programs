package Day17InterfaceAndAbstract;

public abstract class Honda implements ICar{
	int b = 40;
	public void Start() {
		
		System.out.println("Honda starts");
	}
	
	public void Stop() {
		System.out.println("Honda stops");
	}
	
	public void makeTurn() {
		System.out.println("Right Turn");
	}

}
