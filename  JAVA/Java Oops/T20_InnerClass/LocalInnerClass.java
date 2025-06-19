class Library {

    public void organizeBooks() {
        class Book {
            String title;

            Book(String title) {
                this.title = title;
            }

            void display() {
                System.out.println("Book Title: " + title);
            }
        }

        Book b1 = new Book("Sing is King");
        b1.display();

    }
}

/*
 * Create Outer Class with Method Containing Local Class
 * Problem Statement:
 * Create a CounterManager class with a method countUp that uses a local class
 * Counter to count up to a specified number.
 * Detailed Instructions:
 * 1. Create the CounterManager class.
 * 2. Inside CounterManager, create a method countUp that takes an int maxCount
 * as a parameter.
 * 3. Inside the countUp method, create a local class Counter with a method
 * count().
 * 4. In the Counter class, implement the count () method to print numbers from
 * 1 to maxCount.
 * Use a for loop to print "Count:" + i
 * 5. After the local class definition, create a Counter object (reference
 * counter) and call its count () method.
 * Subtask 2
 * Demonstrate the Use of Local Class
 * Problem Statement:
 * Use the CounterManager class to count up to a specified number.
 * Detailed Instructions:
 * In the main () method:
 * 1. Create a CounterManager object (reference manager).
 * 2. Call the countUp method with the argument 5.
 */

class CounterManager {
    void countUp(int maxCount) {
        class Counter {
            void count() {
                for(int i=1;i<=maxCount;i++) {
                    System.out.println("Count: "+ i);
                }
            }
        }
        Counter counter = new Counter();
        counter.count();
    }
}

//another example

class MessagePrint {
    void printMessage(String message) {
        class Printer {
            void display() {
                System.out.println("Message: "+ message);
            }
        }

        Printer printer = new Printer();
        printer.display();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        Library l1 = new Library();
        l1.organizeBooks();

        CounterManager manager = new CounterManager();
        manager.countUp(10);

        MessagePrint messagePrint = new MessagePrint();
        messagePrint.printMessage("Hii i am learning local inner class");
    }
}
