package mypackage;

public interface Food {
	
	default int eat1(int x) {
		return x+1;
	}

}
