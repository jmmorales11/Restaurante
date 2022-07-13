
package controlador;

/**
 *
 * @author Jeimy
 */
public class ControladorBebidas {
    public static void goToMainScreen(JFrame jFrameToClose){
        FrmQuitoSubwayPlanner frmQuitoSubwayPlanner = new FrmQuitoSubwayPlanner();
        jFrameToClose.setVisible(false);
        frmQuitoSubwayPlanner.setVisible(true);
    } 
}
