class Task3Demo {
    public static void main(String[] args) {
        StudentTask3 st = new StudentTask3();
        st.name = "Abeer Amina";

        // Testing overloaded methods
        st.enroll("CSC241");
        st.enroll("CSC241", 2);
        st.enroll(241);
    }
}