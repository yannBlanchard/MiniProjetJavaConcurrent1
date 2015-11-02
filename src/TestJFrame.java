import javax.swing.SwingUtilities;

public class TestJFrame {
	public static void main(String[] args) {

		SimpleFenetre fenetre = new SimpleFenetre("Main affichage");
		int i=0;
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {				
				fenetre.setVisible(true);// On la rend visible
			}
		});
		while (1 == 1) {
			System.out.println("hello"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fenetre.updateMessage("hello"+i+"\n");
			i++;
		}
	}
}
