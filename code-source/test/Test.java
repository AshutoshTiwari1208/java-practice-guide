package test;

public class Test{
	public static void main(String args[]){
		payroll.Policy payObj = new payroll.Policy();
		payroll.senior.Policy paySrObj = new payroll.senior.Policy();

		eng.Policy engObj = new eng.Policy();
		eng.senior.Policy engSrObj = new eng.senior.Policy();

		payObj.showPol();
		paySrObj.showPol();

		engObj.showPol();
		engSrObj.showPol();
	}
}