import javax.swing.*;

public class RandomGuess
{
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null,"this Number is" + (1+ (int)(Math.random()*100)));
    }
}
