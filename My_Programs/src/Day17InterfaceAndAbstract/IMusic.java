package Day17InterfaceAndAbstract;

public interface IMusic {
	public void AMusic() ;
	
	default void SMusic() {
		System.out.println("samsung music");
		}
	
	}

