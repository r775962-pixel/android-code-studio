package openjdk.tools.sjavac.server;

public class CompilationSubResult {
    public enum Result {
        OK,
        ERROR,
        WARNING
    }

    public final Result status;

    public CompilationSubResult(Result status) {
        this.status = status;
    }
}
