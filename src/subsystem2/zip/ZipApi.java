package subsystem2.zip;

public class ZipApi {

	private static ZipApi instance = new ZipApi();

	private ZipApi() {
		super();
	}

	public static ZipApi getInstance() {
		return instance;
	}
	
	public String getCity(String zip) {
		return "São Paulo";
	}
	
	public String getState(String zip) {
		return "SP";
	}
}
