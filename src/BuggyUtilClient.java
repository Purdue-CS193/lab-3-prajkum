public class BuggyUtilClient {
    public static void main(String[] args) {
        // First test case in Main
        System.out.println("Example 1: Make My Username");
        System.out.println("In: first = " + "\"Sean\"" +
                ", last = " + "\"Flannery\"");
        String y = StringUtils.makePurdueUsername("Sean", "Flannery");
        System.out.println("Out: " + y);
    }
}
