import java.util.*;

public class SetOperationsMain {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println("Are Sets Equal: " + SetEqualityChecker.areSetsEqual(set1, set2));

        System.out.println("Union: " + SetUnionIntersection.getUnion(set1, set3));
        System.out.println("Intersection: " + SetUnionIntersection.getIntersection(set1, set3));
        System.out.println("Symmetric Difference: " + SetSymmetricDifference.getSymmetricDifference(set1, set3));

        Set<Integer> setToSort = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        System.out.println("Sorted List: " + SetSorter.convertToSortedList(setToSort));

        Set<Integer> subset = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> superset = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Is Subset: " + SubsetChecker.isSubset(subset, superset));
    }
}
