package Day17InterfaceAndAbstract;

public interface ICar {
	int a = 50;
	//to do list
	public void Start();
	public void Stop();
	public void Drive();

	default void makeTurn() {
		System.out.println("Right Turn");
		
	}
		
}
