package exercise1;

public class UnsupportedFunctionException extends RuntimeException{

    public static void main(String[] args) throws Exception {
        throw new UnsupportedFunctionException("지원x" ,100);

    }

    private final int ERR_CODE;

    public UnsupportedFunctionException(){
        super("UnsupportedFunctionException.");
        this.ERR_CODE=100;
        // this("지원 x" ,100);
    }

    public UnsupportedFunctionException(String message, int ERR_CODE){
        super(message);
        this.ERR_CODE= ERR_CODE;
    }

    public int getERR_CODE() {
        return ERR_CODE;
    }

    @Override
    public String getMessage() {
        return "[" + this.getERR_CODE() + "]" + super.getMessage();
    }
}
