class AIExperimentDemo {

    void modifyExperiment(AIExperiment exp) {
        exp.runEpochs(5); 
    }

    public static void main(String[] args) {
        System.out.println("=== PROGRAM STARTED ===");

        AIExperimentDemo demo = new AIExperimentDemo();

        AIExperiment exp1 = new AIExperiment();
        exp1.experimentName = "CNN Model";
        exp1.completedEpochs = 10;
        exp1.targetEpochs = 50;

        AIExperiment exp2 = new AIExperiment();
        exp2.experimentName = "RNN Model";
        exp2.completedEpochs = 5;
        exp2.targetEpochs = 30;

        System.out.println("--- Initial Status ---");
        System.out.println(exp1.status());
        System.out.println(exp2.status());

        exp1.runEpochs(10);
        exp2.runEpochs(5, 2);

        System.out.println("\n--- State After Running Epochs ---");
        System.out.println(exp1.status() + " | Remaining: " + exp1.remainingEpochs());
        System.out.println(exp2.status() + " | Remaining: " + exp2.remainingEpochs());

        System.out.println("\n--- Helper Method Mutation Check ---");
        System.out.println("Before Helper: " + exp1.completedEpochs);
        demo.modifyExperiment(exp1);
        System.out.println("After Helper: " + exp1.completedEpochs);
        
        System.out.println("=== PROGRAM FINISHED ===");
    }
}