import java.util.Scanner;

public class DiagnosticTestCalculator {

    public static double calculatePositiveProbability(double prevalence, double sensitivity, double specificity) {
        double falsePositiveRate = 1 - specificity;
        return (sensitivity * prevalence) / (sensitivity * prevalence + falsePositiveRate * (1 - prevalence));
    }

    public static double calculateNegativeProbability(double prevalence, double sensitivity, double specificity) {
        double falseNegativeRate = 1 - sensitivity;
        return (1 - falseNegativeRate * prevalence) / ((1 - falseNegativeRate) * prevalence + specificity * (1 - prevalence));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the prevalence of the disease (0-1): ");
        double prevalence = scanner.nextDouble();

        System.out.println("Enter the sensitivity of the test (0-1): ");
        double sensitivity = scanner.nextDouble();

        System.out.println("Enter the specificity of the test (0-1): ");
        double specificity = scanner.nextDouble();

        double positiveProbability = calculatePositiveProbability(prevalence, sensitivity, specificity);
        double negativeProbability = calculateNegativeProbability(prevalence, sensitivity, specificity);

        System.out.printf("Probability of having the disease if tested positive: %.2f%%\n", positiveProbability * 100);
        System.out.printf("Probability of not having the disease if tested negative: %.2f%%\n", negativeProbability * 100);
        
    }
}
