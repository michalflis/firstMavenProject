public class WindowMessage extends Message{

    String className = this.getClass().getSimpleName();

    @Override
    public String getMessage() {

        return "This is class " + className;

    }

}
