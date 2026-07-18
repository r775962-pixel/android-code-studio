package openjdk.tools.sjavac.server;

import openjdk.tools.javac.main.Main.Result;
import java.net.URI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CompilationSubResult {
    public final Result result;
    public final String stdout;
    public final String stderr;
    public final Map<String, Set<URI>> packageArtifacts;
    public final Map<String, Map<String, Set<String>>> packageDependencies;
    public final Map<String, Map<String, Set<String>>> packageCpDependencies;
    public final Map<String, Object> packagePubapis;
    public final Map<String, Object> dependencyPubapis;

    public CompilationSubResult(Result result) {
        this(result, "", "", new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>());
    }

    public CompilationSubResult(Result result, String stdout, String stderr,
                                Map<String, Set<URI>> packageArtifacts,
                                Map<String, Map<String, Set<String>>> packageDependencies,
                                Map<String, Map<String, Set<String>>> packageCpDependencies,
                                Map<String, Object> packagePubapis,
                                Map<String, Object> dependencyPubapis) {
        this.result = result;
        this.stdout = stdout;
        this.stderr = stderr;
        this.packageArtifacts = packageArtifacts;
        this.packageDependencies = packageDependencies;
        this.packageCpDependencies = packageCpDependencies;
        this.packagePubapis = packagePubapis;
        this.dependencyPubapis = dependencyPubapis;
    }
}
