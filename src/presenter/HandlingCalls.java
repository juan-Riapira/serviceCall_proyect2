package presenter;

import java.time.LocalDate;

import model.CellPlan;
import model.Phone;
import model.ServicePhone;

public class HandlingCalls {
	private ServicePhone servicePhone;

	public HandlingCalls() {

	}

	public boolean addPhone(String imei, String number, LocalDate manufacturingDate, String description, int minutes)
			throws Exception {

		return false;
	}

	public String findPhone(String imai) {
	
		return "" ;
	}

	public int addMinutes(String imei, int minutes) {

		return 0;
	}

	public boolean registry(String imei, String number, int minutes) {
		return false;
	}
}
