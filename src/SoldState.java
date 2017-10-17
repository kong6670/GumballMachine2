
public class SoldState implements State {
	GumballMachine gumballMachine;
	
	 public SoldState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;}
	@Override
	public void intsertQuarten() {
		// TODO Auto-generated method stub
		System.out.println("Please wait, we're already gumball");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Sorry, alredy turned the crank");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Turning twice doesn't get you another gumball!");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		gumballMachine.relesaeBall();
		if(gumballMachine.getcount()>0){
			gumballMachine.setState(gumballMachine.getNoQuarterState());
			}else {
			System.out.println("Oops, out of gumballs!");
	}
}
}
