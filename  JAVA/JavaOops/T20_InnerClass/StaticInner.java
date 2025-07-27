
class Computer {
    private String brand;
    private String model;

    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
    static class Specs {
        Computer computer; // Reference to the outer class
        private String processor;
        private int ram;

        public Specs(String processor, int ram) {
            this.processor = processor;
            this.ram = ram;
        }

        void displaySpecs() {
            System.out.println("Processor: " + processor);
            System.out.println("RAM: " + ram + "GB");
        }

        void displayComputerDetails() {
            // Cannot access outer class instance variables directly
            // System.out.println("Brand: " + brand); // This would cause an error
            // System.out.println("Model: " + model); // This would cause an error
        }
    }

}

public class StaticInner {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell", "XPS 13");
        computer.displayDetails();
        Computer.Specs specs = new Computer.Specs("Intel i7", 16);
        specs.displaySpecs();
        specs.displayComputerDetails();

        /*
         * Exactly! ✅ You're right.
         * 
         * 🔹 A static inner class in Java:
         * Does NOT belong to an instance of the outer class.
         * It doesn’t have access to instance variables or instance methods of the outer
         * class directly.
         * It can only access static members (fields or methods) of the outer class.
         * 
         */
    }
}
