import java.util.ArrayList;
import java.util.Scanner;

// ~ stores subcategory attributes
class Subcategory {
    // ~ encapsulation
    private final String name;
    private final float carbon_emission_per_unit;
    private final String unit;

    // ~ setter for subcategory's variables/attributes
    public Subcategory(String name, float carbon_emission_per_unit, String unit) {
        this.name = name;
        this.carbon_emission_per_unit = carbon_emission_per_unit;
        this.unit = unit;
    }

    // ~ getters for subcategory's variables/attributes
    public String getName() {
        return name;
    }
    public float getCarbon_emission_per_unit() {
        return carbon_emission_per_unit;
    }

    public String getUnit() {
        return unit;
    }
}

// ~ stores category attributes (abstraction)
abstract class Category {
    // ~ encapsulation
    protected ArrayList<Subcategory> subcategories;

    // ~ abstraction
    public abstract float calculate_total_carbon_emission(int subcategoryIndex, float amount);

    // ~ getter for subcategories array list
    public ArrayList<Subcategory> getAll_subcategories() {
        return subcategories;
    }
}

// ~ lists transportation's subcategories (inherits from category)
class Transportation extends Category {
    public Transportation() {
        subcategories = new ArrayList<>();
        subcategories.add(new Subcategory("Car", 0.18f, "kgCO2/km"));
        subcategories.add(new Subcategory("Bus", 0.11f, "kgCO2/km"));
        subcategories.add(new Subcategory("Train", 0.04f, "kgCO2/km"));
        subcategories.add(new Subcategory("Bicycle", 0.00f, "kgCO2/km"));
        subcategories.add(new Subcategory("Walking", 0.00f, "kgCO2/km"));
        subcategories.add(new Subcategory("Motorcycle", 0.15f, "kgCO2/km"));
        subcategories.add(new Subcategory("Airplane", 0.25f, "kgCO2/km"));
        subcategories.add(new Subcategory("Electric Car", 0.05f, "kgCO2/km"));
        subcategories.add(new Subcategory("Jeepney", 0.14f, "kgCO2/km"));
        subcategories.add(new Subcategory("Tricycle", 0.13f, "kgCO2/km"));
    }

    // ~ overriding
    @Override
    public float calculate_total_carbon_emission(int subcategoryIndex, float amount) {
        Subcategory subcategory = subcategories.get(subcategoryIndex);
        return subcategory.getCarbon_emission_per_unit() * amount;
    }
}

// ~ lists food's subcategories (inherits from category)
class Food extends Category {
    public Food() {
        subcategories = new ArrayList<>();
        subcategories.add(new Subcategory("Beef", 27.00f, "kgCO2/kg"));
        subcategories.add(new Subcategory("Chicken", 6.10f, "kgCO2/kg"));
        subcategories.add(new Subcategory("Pork", 12.00f, "kgCO2/kg"));
        subcategories.add(new Subcategory("Fish", 5.00f, "kgCO2/kg"));
        subcategories.add(new Subcategory("Eggs", 4.80f, "kgCO2/kg"));
        subcategories.add(new Subcategory("Vegetables", 1.20f, "kgCO2/kg"));
        subcategories.add(new Subcategory("Fruits", 1.50f, "kgCO2/kg"));
        subcategories.add(new Subcategory("Water", 0.00f, "kgCO2/L"));
        subcategories.add(new Subcategory("Beverages (e.g., Soft Drinks, Juice)", 0.50f, "kgCO2/L"));
        subcategories.add(new Subcategory("Dairy", 9.00f, "kgCO2/kg"));
        subcategories.add(new Subcategory("Grains", 4.00f, "kgCO2/kg"));
        subcategories.add(new Subcategory("Processed Foods", 5.00f, "kgCO2/kg"));
    }

    // ~ overriding
    @Override
    public float calculate_total_carbon_emission(int subcategoryIndex, float amount) {
        Subcategory subcategory = subcategories.get(subcategoryIndex);
        return subcategory.getCarbon_emission_per_unit() * amount;
    }
}

// ~ lists household's subcategories (inherits from category)
class Household extends Category {
    public Household() {
        subcategories = new ArrayList<>();
        subcategories.add(new Subcategory("Appliance Usage", 0.30f, "kgCO2/kWh"));
        subcategories.add(new Subcategory("Laundry", 0.85f, "kgCO2/kg"));
        subcategories.add(new Subcategory("Air Conditioning", 27.00f, "kgCO2/h"));
        subcategories.add(new Subcategory("Internet Usage", 0.20f, "kgCO2/h"));
        subcategories.add(new Subcategory("Waste Disposal", 0.50f, "kgCO2/kg"));
        subcategories.add(new Subcategory("Water Usage", 0.00f, "kgCO2/L"));
        subcategories.add(new Subcategory("Vehicle Fuel Usage", 2.30f, "kgCO2/L"));
        subcategories.add(new Subcategory("Charging (Electronic Device)", 0.10f, "kgCO2/h"));
        subcategories.add(new Subcategory("Cooking/Heating (Gas Usage)", 5.00f, "kgCO2/h"));
        subcategories.add(new Subcategory("Electronic Device Usage", 0.20f, "kgCO2/h"));
    }

    // ~ overriding
    @Override
    public float calculate_total_carbon_emission(int subcategoryIndex, float amount) {
        Subcategory subcategory = subcategories.get(subcategoryIndex);
        return subcategory.getCarbon_emission_per_unit() * amount;
    }
}

// ~ imitates clear screen by looping blank spaces
class Clear_Screen {
    public static void clear() {
        for (int count = 0; count < 50; count ++) {
            System.out.println();
        }
    }
}

// ~ class for viewing and deleting logs
class View_Logs {
    Scanner input = new Scanner(System.in);

    // ~ variables for three categories' total carbon emission and combined 
    float transportation_carbon_emission = 0.00f;
    float food_carbon_emission = 0.00f;
    float household_carbon_emission = 0.00f;
    float total_carbon_emission = 0.00f;

    // ~ setters
    public void setTransportation_carbon_emission (float val){
        this.transportation_carbon_emission = val;
    }

    public void setFood_carbon_emission(float val) {
        this.food_carbon_emission = val;
    }

    public void setHousehold_carbon_emission(float val) {
        this.household_carbon_emission = val;
    }

    public void setTotal_carbon_emission(float val) {
        this.total_carbon_emission = val;
    }

    // ~ getters
    public float getTransportation_carbon_emission () {
        return transportation_carbon_emission;
    }

    public float getFood_carbon_emission() {
        return food_carbon_emission;
    }

    public float getHousehold_carbon_emission() {
        return household_carbon_emission;
    }

    public float getTotal_carbon_emission() {
        return total_carbon_emission;
    }
    
    private final ArrayList<String> logs = new ArrayList<>();
    Verify_Inputs inputs = new Verify_Inputs();

    // ~ methods for storing user's activity log(s) and format
    public void add_log(String what_category, String name, float quantity, float total, float carbon, String unit) {
        String log_placeholder = what_category + " - " + name + " - " + quantity + " - " + total +  " ~ " + carbon + " " + unit;
        logs.add(log_placeholder);
    }

    public String transfer_category_name (String category_name) {
        return category_name;
    }

    public float transfer_total_emission (float total_emission) {
        return total_emission;
    }

    // ~ displays stored log(s) if any exists
    public void display_all_logs() {
        if (logs.isEmpty()) {
            System.out.println("* =================================================================== *");
            System.out.println("|\t\t\t   There's no log(s).\t\t\t      |");
            System.out.println("* =================================================================== *");
            System.out.print("Press enter to continue...");
            input.nextLine();
        } else {
            System.out.println("* ============================================================================= *");
            System.out.println("|\t\t\t\tUser Log(s)\t\t\t\t\t|");
            System.out.println("* ============================================================================= *");
            System.out.println("|\t\t\t\t\t\t\t\t\t\t|");

            System.out.println(" No  : Name : Quantity : Carbon Emission Per Unit");
            int count = 1;
            for (String log : logs) {
                System.out.println(" (" + ( count ++) + ") : " + log);
            }
            System.out.println("|\t\t\t\t\t\t\t\t\t\t|");
            System.out.println("* ============================================================================= *\n");
            System.out.println("* ---------------------------------- Options ---------------------------------- *");
            
            System.out.println("(1) Delete Log");
            System.out.println("(2) Delete All Log(s)");
            System.out.println("(3) Exit");

            int choose = inputs.verify_input(1, 3, "\nChoose: ");

            // ~ options
            switch(choose) {
                case 1:
                    // ~ deletes a specific chosen log and updates the total carbon emission value
                    System.out.println("\n* ---------------------------------- Choose ---------------------------------- *");
                    int delete_log = inputs.verify_input(1, logs.size(), "Choose a number to delete: ");
                    int commit = delete_log - 1;
                    String log_delete = logs.get(commit);
                    System.out.println("* ============================================================================= *");
                    System.out.println("|\t\t\tLog number (" + delete_log + ") has been deleted.\t\t\t|");
                    System.out.println("* ============================================================================= *");
                    System.out.print("Press enter to continue...");
                    String pause = input.nextLine();

                    String[] log_parts = log_delete.split(" - "); 
                    String category_name = log_parts[0];  
                    float total_emission = Float.parseFloat(log_parts[3].split(" ~ ")[0]);

                    // ~ re-calculates the total carbon emission for each category and combined
                    if (category_name.equals("Transportation")) {
                        float current_value = getTransportation_carbon_emission();
                        float current_value1 = getTotal_carbon_emission();

                        float insert = current_value - total_emission;
                        float insert1 = current_value1 - total_emission;

                        setTransportation_carbon_emission(insert);
                        setTotal_carbon_emission(insert1);

                    } else if (category_name.equals("Food")) {
                        float current_value = getFood_carbon_emission();
                        float current_value1 = getTotal_carbon_emission();

                        float insert = current_value - total_emission;
                        float insert1 = current_value1 - total_emission;

                        setFood_carbon_emission(insert);
                        setTotal_carbon_emission(insert1);

                    } else if (category_name.equals("Household")) {
                        float current_value = getHousehold_carbon_emission();
                        float current_value1 = getTotal_carbon_emission();

                        float insert = current_value - total_emission;
                        float insert1 = current_value1 - total_emission;

                        setHousehold_carbon_emission(insert);
                        setTotal_carbon_emission(insert1);

                    }

                    logs.remove(commit);         

                    break;
                case 2:
                    // deletes all of the log(s) and resets the total carbon emission to 0.00
                    System.out.println("* ============================================================================= *");
                    System.out.println("|\tThis option will delete all log(s) in your dashboard.\t\t\t|");
                    System.out.println("* ============================================================================= *\n");
                    System.out.println("* ---------------------------------- Options ---------------------------------- *");

                    System.out.println("Do you want to continue?");
                    System.out.println("(1) Yes");
                    System.out.println("(2) No");
                    int askyesorno = inputs.verify_input(1, 2, "\nConfirm: ");

                    if (askyesorno == 1) {
                        logs.clear();
                        System.out.println("* ============================================================================= *");
                        System.out.println("|\t\t\tAll of the log(s) has been deleted.\t\t\t|");
                        System.out.println("* ============================================================================= *");
                        setTotal_carbon_emission(0.00f);
                        setTransportation_carbon_emission(0.00f);
                        setFood_carbon_emission(0.00f);
                        setHousehold_carbon_emission(0.00f);
                        logs.clear();
                        System.out.print("Press enter to continue...");
                        String pause_again = input.nextLine();

                    } else {
                        System.out.println("* ============================================================================= *");
                        System.out.println("|\t\t\t   The deletion was cancelled.\t\t\t     |");
                        System.out.println("* ============================================================================= *");
                        System.out.println("Press enter to continue...");
                        String pause_again_again = input.nextLine();
                        break;
                    }
            }
        }
    }
}

// ~ error handling for both integer and float values
class Verify_Inputs {
    // ~ encapsulation
    private final Scanner input = new Scanner(System.in);

    // ~ for float
    public float verify_input_float(String prompt) {
        float amount = 0.0f;
        boolean valid = false;

        while (!valid) {
            System.out.print(prompt);
            if (input.hasNextFloat()) {
                amount = input.nextFloat();
                if (amount > 0) {
                    valid = true;
                } else {
                    System.out.println("~ Invalid input. Please enter a positive number. ~");
                }
            } else {
                System.out.println("~ Invalid input. Please enter a valid number. ~");
                input.nextLine();
            }
        }
        return amount;
    }

    // ~ for integer
    public int verify_input(int min, int max, String prompt) {
        int choice = 0;
        boolean valid = false;
        
        while (!valid) {
            System.out.print(prompt);
            if (input.hasNextInt()) {
                choice = input.nextInt();
                if (choice >= min && choice <= max) {
                    valid = true;
                } else {
                    System.out.println("~ Invalid input. Please enter a value between " + min + " and " + max + ". ~");
                }
            } else {
                System.out.println("~ Invalid input. Please enter an integer. ~");
                input.nextLine();
            }
        }
        return choice;
    }    
}

// ~ main
public class Perfoot {
    // ~ template for categories
    private static void sort_category(Verify_Inputs inputs, Category category, View_Logs view, String category_name) {
        System.out.println("* ================================================================== *");
        System.out.println("\t\t    ~ " + category_name + " Subcategory ~");
        System.out.println("* ================================================================== *");
        System.out.println("|\t\t\t\t\t\t\t\t     |");

        // Display subcategories and emissions
        ArrayList<Subcategory> subcategories = category.getAll_subcategories();
        System.out.println(" No  : Category : Name  :  Carbon Emission Per Unit");

        for (int i = 0; i < subcategories.size(); i++) {
            Subcategory subcategory = subcategories.get(i);
            System.out.println(" (" + (i + 1) + ") : " + subcategory.getName() + " : " + subcategory.getCarbon_emission_per_unit() + " " + subcategory.getUnit());
        }
        System.out.println("|\t\t\t\t\t\t\t\t     |");
        System.out.println("* ================================================================== *\n");
        System.out.println("* ----------------------------- Choose ----------------------------- *");

        int subcategory_choice = inputs.verify_input(1, subcategories.size(), "Select one: ");
        float amount = inputs.verify_input_float("Enter Amount: ");

        float emission = category.calculate_total_carbon_emission(subcategory_choice - 1, amount);
        view.setTotal_carbon_emission(view.getTotal_carbon_emission() + emission);
        view.add_log(category_name, subcategories.get(subcategory_choice - 1).getName(), amount, emission, 
                     subcategories.get(subcategory_choice - 1).getCarbon_emission_per_unit(), subcategories.get(subcategory_choice - 1).getUnit());

        if (category_name.equals("Transportation")) {
            view.setTransportation_carbon_emission(view.getTransportation_carbon_emission() + emission);
        } else if (category_name.equals("Food")) {
            view.setFood_carbon_emission(view.getFood_carbon_emission() + emission);
        } else if (category_name.equals("Household")) {
            view.setHousehold_carbon_emission(view.getHousehold_carbon_emission() + emission);
        }
    }

    public static void main(String[] args) {
        Verify_Inputs inputs = new Verify_Inputs();
        Transportation transportation = new Transportation();
        Food food = new Food();
        Household household = new Household();
        View_Logs view = new View_Logs();
        Scanner input = new Scanner(System.in);
        String username = "";         

        // ~ introduction page of the program
        while (true) {
            Clear_Screen.clear();
            System.out.println("* ============================================================================= *");
            System.out.println("|\t\t\t\tWelcome to Perfoot!\t\t\t\t|");
            System.out.println("* ============================================================================= *");
            System.out.println("|\t\t\t\t\t\t\t\t\t\t|");
            System.out.println("|\tPerFoot is a personal footprint tracker that helps you\t\t\t|");
            System.out.println("|\tmonitor your environmental impact by estimating the carbon footprint\t|");
            System.out.println("|\tof your daily activities. This categorizes your activities into\t\t|");
            System.out.println("|\tTransportation, Food, and Household, providing insights into\t\t|");
            System.out.println("|\thow each choice contributes to your carbon emissions.\t\t\t|");
            System.out.println("|\t\t\t\t\t\t\t\t\t\t|");
            System.out.println("* ============================================================================= *\n");
            System.out.println("* ---------------------------------- Options ---------------------------------- *");
            System.out.println("(1) Enter");
            System.out.println("(2) Quit");

            int decide = inputs.verify_input(1, 2, "\nChoose: ");

            // ~ leaves the program
            if (decide == 2) {
                System.out.println("* ============================================================================= *");
                System.out.println("|\t\t\t   Thank you for using Perfoot!\t\t\t\t|");
                System.out.println("* ============================================================================= *\n");
                break;
            }

            // ~ proceeds to username creation and dashboard
            if (decide == 1) {
                float total_carbon_emission = 0.00f;
                boolean gateway = true;
               

                // ~ prompts the user to create an username
                if (username.equals("")) {
                System.out.println("\n* ------------------------------ Create Username ------------------------------ *\n");
                System.out.print("Username: ");
                username = input.nextLine();

                    while (username.equals("")) {
                        System.out.println("~ Try again! Username cannot be blank or empty. ~");
                        System.out.print("Username: ");
                        username = input.nextLine();
                    }
                }

                // ~ dashboard and options
                while (true) {
                    Clear_Screen.clear();
                    System.out.println("\t\t\t ~ " + username + "'s Dashboard ~");
                    System.out.println("* ================================================================== *");
                    System.out.println("|\t\t\tTotal carbon emission:\t\t\t     |");
                    System.out.println("\t\t\t   ~ " + view.getTotal_carbon_emission()  +" kgCO2 ~");
                    System.out.println("|\t\t\t\t\t\t\t\t     |");
                    System.out.println("* ================================================================== *");
                    System.out.println("|\t\t\tCategory Contributions\t\t\t     |");
                    System.out.println("\t\t   ~ Transportation : " + view.getTransportation_carbon_emission() + " kgCO2 ~");
                    System.out.println("\t\t   ~ Food: " + view.getFood_carbon_emission() + " kgCO2 ~");
                    System.out.println("\t\t   ~ Household: " + view.getHousehold_carbon_emission() + " kgCO2 ~");
                    System.out.println("|\t\t\t\t\t\t\t\t     |");
                    System.out.println("* ================================================================== *");
                    System.out.println("|\t\t\t\t\t\t\t\t     |");
                    System.out.println("|\tChoose a Category:\t\t\t\t\t     |");
                    System.out.println("|\t(1) Transportation\t\t\t\t\t     |");
                    System.out.println("|\t(2) Food\t\t\t\t\t\t     |");
                    System.out.println("|\t(3) Household\t\t\t\t\t\t     |");
                    System.out.println("|\t\t\t\t\t\t\t\t     |");
                    System.out.println("* ================================================================== *");
                    System.out.println("|\t\t\t\t\t\t\t\t     |");
                    System.out.println("|\t(4) View or Delete Log(s)\t\t\t\t     |");
                    System.out.println("|\t(5) Exit\t\t\t\t\t\t     |");
                    System.out.println("|\t\t\t\t\t\t\t\t     |");
                    System.out.println("* ================================================================== *");

                    int category_choice = inputs.verify_input(1, 5, "\nChoose one: ");

                    // ~ returns to the introduction page
                    if (category_choice == 5) {
                        break;
                    }

                    switch (category_choice) {
                        case 1:
                            // ~ lists the subcategories of transportation option
                            sort_category(inputs, transportation, view, "Transportation");
                            break;

                        case 2:
                            // ~ lists the subcategories of transportation option
                            sort_category(inputs, food, view, "Food");
                            break;

                        case 3:
                            // ~ lists the subcategories of household option
                            sort_category(inputs, household, view, "Household");
                            break;

                        case 4:
                            // ~ displays the logs
                            view.display_all_logs();
                            break;
                    }
                }
            }
        }
    }

}

/*
 * Object-Oriented Programming - Final Project
 * IT - 2102
 * Frankin C. Dela Torre
 */