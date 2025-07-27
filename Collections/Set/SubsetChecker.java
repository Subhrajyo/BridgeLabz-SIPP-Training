import java.util.Set;

public class SubsetChecker {
    public static boolean isSubset(Set<Integer> subset, Set<Integer> superset) {
        return superset.containsAll(subset);
    }
}
