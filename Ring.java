public abstract class Ring {
    protected String name;

    Ring(String name){
        this.name=name;
    }

    abstract void wear();
    abstract void remove();
}
