class PassByValueDemo {

    // Experiment A: Primitive parameter
    void changeNumber(int x) {
        System.out.println("   Inside changeNumber before: " + x);
        x = 99; // Changes local parameter copy
        System.out.println("   Inside changeNumber after: " + x);
    }

    // Experiment B: Object reference parameter (Field Mutation)
    void changeStudent(StudentTask4 st) {
        System.out.println("   Inside changeStudent before: " + st.completedCredits);
        st.completedCredits = 99; // Mutates shared object state
        System.out.println("   Inside changeStudent after: " + st.completedCredits);
    }

    // Experiment C: Object reference parameter (Reassignment)
    void replaceStudent(StudentTask4 st) {
        System.out.println("   Inside replaceStudent before: " + st.name);
        st = new StudentTask4(); // Local reference parameter is reassigned
        st.name = "Temporary";
        System.out.println("   Inside replaceStudent after: " + st.name);
    }

    public static void main(String[] args) {
        PassByValueDemo demo = new PassByValueDemo();

        // --- Experiment A: Primitive ---
        int num = 10;
        System.out.println("--- Experiment A (Primitive) ---");
        System.out.println("Caller Before: " + num);
        demo.changeNumber(num);
        System.out.println("Caller After: " + num);

        // --- Experiment B: Object Mutation ---
        StudentTask4 s1 = new StudentTask4();
        s1.name = "Ali";
        s1.completedCredits = 20;

        System.out.println("\n--- Experiment B (Object Mutation) ---");
        System.out.println("Caller Before: " + s1.completedCredits);
        demo.changeStudent(s1);
        System.out.println("Caller After: " + s1.completedCredits);

        // --- Experiment C: Object Reassignment ---
        System.out.println("\n--- Experiment C (Object Reassignment) ---");
        System.out.println("Caller Before: " + s1.name);
        demo.replaceStudent(s1);
        System.out.println("Caller After: " + s1.name);
    }
}