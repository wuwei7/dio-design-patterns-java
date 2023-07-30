package one.digitalinnovation.dp.facade;

import subsystem1.crm.CrmService;
import subsystem2.zip.ZipApi;

public class Facade {

	public void moveClient(String name, String zip) {
		String city = ZipApi.getInstance().getCity(zip);
		String state = ZipApi.getInstance().getState(zip);
		
		CrmService.saveClient(name, zip, city, state);
	}
}
