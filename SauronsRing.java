public class SauronsRing extends Ring {
    private boolean visibility;

    private SauronsRing(){
        super("Saurons Ring");
    }

    public void wear(){
        this.visibility=false;
    }

    public void remove(){
        this.visibility=true;
    }

}

