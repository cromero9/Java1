
public class LongDistanceBill extends PhoneBill {

	private double callRate;
	public LongDistanceBill(double monthlyRate) {
		
		super(monthlyRate);
		
	}

	public double getCallRate() {
		return callRate;
	}

	public void setCallRate(double callRate) {
		this.callRate = callRate;
	}

	@Override
	public double calculateBill(int time) {
		
		return callRate * time + getMonthlyRate();
	}
	
	
	

}
