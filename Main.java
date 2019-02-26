// Sangwon Song
// CMPE202 SJSU Spring 2019
// Lab1
public class Main {
	public static void main(String[] args) {

        GumballMachine gumballMachine1 = new GumballMachine(15, 25, new int[]{25});
        GumballMachine gumballMachine2 = new GumballMachine(15, 50, new int[]{25});
        GumballMachine gumballMachine3 = new GumballMachine(15, 50, new int[]{5,10,25});

        //Test the first machine
        System.out.println("Machine 1 Testing");
        gumballMachine1.insertQuarter(10);
        gumballMachine1.turnCrank();
        gumballMachine1.insertQuarter(25);
        gumballMachine1.turnCrank();

        System.out.println();

        //Test the second machine
        System.out.println("Machine 2 Testing");
        gumballMachine2.insertQuarter(10);
        gumballMachine2.insertQuarter(5);
        gumballMachine2.turnCrank();
        gumballMachine2.insertQuarter(25);
        gumballMachine2.insertQuarter(25);
        gumballMachine2.turnCrank();

        System.out.println();

        //Test the third machine
        System.out.println("Machine 3 Testing");
        gumballMachine3.insertQuarter(25);
        gumballMachine3.turnCrank();
        gumballMachine3.insertQuarter(10);
        gumballMachine3.insertQuarter(10);
        gumballMachine3.insertQuarter(5);
        gumballMachine3.turnCrank();
        gumballMachine3.insertQuarter(25);
        gumballMachine3.insertQuarter(25);
        gumballMachine3.turnCrank();

	}
}

