package db;

public class DbIntegrityException extends RuntimeException {
    
    private static final long serialVersionUID = 2L;

    public DbIntegrityException(String msg){
        super(msg);
    }
}
