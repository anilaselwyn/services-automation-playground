import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import java.nio.file.Paths;

public class CloneGithubRepo {

    public static void main(String[] args) {

        String repoUrl = "https://github.com/anilaselwyn/services-automation-playground.git";
        String cloneDirectoryPath = "/Users/anilaselwyn/Downloads/blah";
        try {
            System.out.println("Cloning " + repoUrl + " into " + repoUrl);
            Git.cloneRepository()
                    .setURI(repoUrl)
                    .setDirectory(Paths.get(cloneDirectoryPath).toFile())
                    .call();
            System.out.println("Cloning complete");
        } catch (GitAPIException e) {
            System.out.println("Cloning incomplete. Error during cloning");
            e.printStackTrace();
        }
    }
}
