package bengkelmotor;

public class Maintenance {
    
    private final Selection work;
    
    public Maintenance(Selection maint){
       this.work = maint;
    }
    
    void perbaikan(){
        this.work.repair();
    }
    
    void pemeliharaan(){
        this.work.maintenance();
    }
}
