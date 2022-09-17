package bengkelmotor;

public class Repair implements Selection{
    
    @Override
    public void maintenance() {
        System.out.println("\nPemeliharaan dipilih\n");
        
    }
    
    @Override
    public void repair() {
        System.out.println("\nPerbaikan dipilih\n");
    }
}
