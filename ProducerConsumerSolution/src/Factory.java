
public class Factory {

	int x;
	boolean isProduced = false;
	synchronized public void setData(int x) throws InterruptedException {
		if(isProduced == true) {
			wait();//producer t1
		}
		this.x = x;
		System.out.println("I have put " + x + " to Factory");
		isProduced = true;
		notify();
	}
	
	synchronized public void getData() {
		if(isProduced== false) {
			try {
				wait();//consumer t2
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("I have taken " + x + " From Factory. ");
		isProduced = false;
		notify();
	}
}
