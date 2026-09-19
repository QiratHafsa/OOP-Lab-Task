class AIExperiment {
    // Fields: Variables that hold object state
    String experimentName;
    int completedEpochs;
    int targetEpochs;

    // Method 1: Increases completedEpochs by a given number
    void runEpochs(int epochs) {
        completedEpochs += epochs;
    }

    // Method 2 (Overload): Increases completedEpochs by regular + bonus steps
    void runEpochs(int epochs, int bonusEpochs) {
        completedEpochs += (epochs + bonusEpochs);
    }

    // Method 3: Calculates remaining epochs using a local variable
    int remainingEpochs() {
        int remaining = targetEpochs - completedEpochs; // Local variable
        return remaining;
    }

    // Method 4: Returns a summary string
    String status() {
        return "Experiment: " + experimentName + " | Epochs: " + completedEpochs + "/" + targetEpochs;
    }
}