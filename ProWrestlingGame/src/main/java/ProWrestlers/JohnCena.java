package ProWrestlers;

//Implement the Entrance interface
public class JohnCena extends ProWrestler{

    public JohnCena(){
        super("John Cena", 94);
    }
    
    @Override
    public void signatureMove() {
        System.out.println("John Cena uses the Attitude Adjustment");
    }
    
}
