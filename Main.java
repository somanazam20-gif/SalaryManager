public class Main {

    public static int calculateSalary(int hours, int rate) {
        return hours * rate;
    }

    public static String getCategory(int salary) {
        if (salary >= 50000) return "High";
        else if (salary >= 35000) return "Medium";
        else return "Low";
    }

    public static boolean isValid(int hours) {
        return hours >= 0 && hours <= 60;
    }

    public static void main(String[] args) {
        String[] names = {"Hina", "Omar", "Zara", "Bilal"};
        int[] hours    = {40, 25, 70, 55};
        int rate = 1000;

        int validCount = 0;
        int totalSalary = 0;

        for (int i = 0; i < names.length; i++) {
            if (!isValid(hours[i])) {
                System.out.println("Invalid hours for " + names[i]);
                continue;
            }
            int salary = calculateSalary(hours[i], rate);
            String category = getCategory(salary);
            System.out.println(names[i] + ": " + hours[i] + " hours, Rs " + salary + " " + category);
            validCount++;
            totalSalary += salary;
        }

        double averageSalary = (double) totalSalary / validCount;
        System.out.println("Valid employees: " + validCount);
        System.out.println("Total salary: " + totalSalary);
        System.out.println("Average salary: " + averageSalary);
    }
}