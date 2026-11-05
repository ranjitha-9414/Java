
public class TextEditor extends Thread {

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		if(threadName.equals("Type")) {
			try {
				type();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(threadName.equals("Check")) {
			try {
				spellCheck();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (threadName.equals("Save")) {
			try {
				autoSave();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void type() throws InterruptedException {
		for(int i =1;i<=5;i++) {
			System.out.println("typing...");
			Thread.sleep(3000);
		}
	}
	
	void spellCheck() throws InterruptedException {
		for(int i =1;i<=5;i++) {
			System.out.println("Spell checking...");
			Thread.sleep(3000);
		}
	}
	void autoSave() throws InterruptedException {
		for(int i =1;i<=5;i++) {
			System.out.println("Auto saving...");
			Thread.sleep(3000);
		}
	}
}
