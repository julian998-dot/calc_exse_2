package casa;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PanelOjos extends JPanel {
    
    private Vec2 mousePos = new Vec2(0, 0);
    
    private OJOS OI= new OJOS(150 - 50, 200, 50, 20);
    private OJOS OD = new OJOS(150 + 58, 200, 50, 20);
    
    
    public PanelOjos() {
        setPreferredSize(new Dimension(300, 300));
        addMouseMotionListener(new MouseHandler());
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        OI.draw(g, mousePos);
        OD.draw(g, mousePos);
        
    }

    private class MouseHandler extends MouseAdapter {
        @Override
        public void mouseMoved(MouseEvent e) {
            mousePos.setX(e.getX());
            mousePos.setY(e.getY());
            repaint();
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                PanelOjos view = new PanelOjos();
                JFrame frame = new JFrame();
                
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(view);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setResizable(false);
                view.requestFocus();
            }

        });
    }
    
}
