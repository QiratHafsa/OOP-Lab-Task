public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.studentId = "BAI-001";
        s1.name = "Abeer Amina";
        s1.completedCredits = 14;

        Student s2 = new Student();
        s2.studentId = "BAI-002";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 6;

        Student s3 = new Student();
        s3.studentId = "BAI-003";
        s3.name = "Abdul Rehman Azam";
        s3.completedCredits = 10;

        System.out.println("--- Before Change ---");
        System.out.println(s1.name + " Credits: " + s1.completedCredits);
        System.out.println(s2.name + " Credits: " + s2.completedCredits);
        System.out.println(s3.name + " Credits: " + s3.completedCredits);

        // Modify only one object
        s2.completedCredits = 36;

        System.out.println("\n--- After Changing s2 ---");
        System.out.println(s1.name + " Credits: " + s1.completedCredits);
        System.out.println(s2.name + " Credits: " + s2.completedCredits);
        System.out.println(s3.name + " Credits: " + s3.completedCredits);

        /*
         * Explanation:
         * The objects s1, s2, and s3 occupy separate memory locations.
         * Modifying s2.completedCredits changes only the instance field of s2, 
         * leaving s1 and s3 unaffected.
         */
    }
}