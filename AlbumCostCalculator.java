import java.util.Scanner;  

public class AlbumCostCalculator {  

    public static void main(String[] args) {  
        float totalCost = inputAlbumCosts(); // Call inputAlbumCosts to accumulate total cost  
        withinBudget(totalCost); // Call withinBudget to evaluate the budget  
    }  

    // Input album costs method  
    public static float inputAlbumCosts() {  
        Scanner scanner = new Scanner(System.in);  
        float total = 0;  
        float cost;  

        // Loop to input costs for five albums  
        for (int i = 1; i <= 5; i++) {  
            System.out.print("Enter the cost of album " + i + ": ");  
            cost = scanner.nextFloat();  
            total += cost; // Accumulate total cost  
        }  

        return total; // Return accumulated total cost  
    }  

    // Within budget method  
    public static void withinBudget(float totalCost) {  
        System.out.println("Total cost of albums: " + totalCost);  
        
        // Check if total cost is within budget  
        if (totalCost <= 100) {  
            System.out.println("You are within budget!");  
        } else {  
            System.out.println("You are over budget!");  
        }  

        averageCost(totalCost); // Call averageCost to compute average  
    }  

    // Average cost method  
    public static void averageCost(float totalCost) {  
        float average = totalCost / 5; // Calculate average  
        System.out.println("Average cost per album: " + average);  
    }  
}