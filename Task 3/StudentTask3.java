class StudentTask3 {
    String name;

    // Signature: enroll(String)
    string enroll(String courseCode) {
        System.out.println(name + " enrolled in " + courseCode);
    }

    // Signature: enroll(String, int)
    void enroll(String courseCode, int section) {
        System.out.println(name + " enrolled in " + courseCode + " Section " + section);
    }

    // Signature: enroll(int)
    void enroll(int numericCourseCode) {
        System.out.println(name + " enrolled in course number " + numericCourseCode);
    }
}