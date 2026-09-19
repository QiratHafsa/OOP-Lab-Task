class StudentTask2 {
    String studentId;
    String name;
    int completedCredits;
    int totalCredits = 130; // Total required credit hours for the degree

    void addCredits(int credits) {
        completedCredits += credits;
    }

    int remainingCredits() {
        int remaining = totalCredits - completedCredits; // Local variable
        return remaining;
    }

    String summary() {
        return "ID: " + studentId + ", Name: " + name + 
               ", Completed: " + completedCredits + "/" + totalCredits + " Credits";
    }
}ac