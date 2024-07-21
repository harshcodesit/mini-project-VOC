import java.util.*;

public class todoList {
    ArrayList<String> tasks = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
    // public void TodoList(){
    //     ArrayList<String> tasks = new ArrayList<String>();
    //     Scanner scanner = new Scanner(System.in);
    // }
    public void run(){
        boolean running = true;
        while(running){
            System.out.println("\n ------------------------TO DO LIST-----------------------\n");
            System.out.println("1: Add task");
            System.out.println("2: Delete task");
            System.out.println("3: List all tasks");
            System.out.println("4: Mark as done");
            System.out.println("5: quit");
            System.out.println("\n enter choice");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    deleteTask();
                    break;
                case 3:
                    showTask();
                    break;
                case 4:
                    mark();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                System.out.println("invalid choice");
                    break;
            }
        }
    }

    private void addTask(){
        System.out.println("\nEnter the task");
        String task = scanner.nextLine();
        scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully");

    }
    private void deleteTask(){
        System.out.println("\nEnter the task number");
        int num = scanner.nextInt();
        if(num>0 && num <=tasks.size()){
            tasks.remove(num-1);
            System.out.println("Task deleted successfully");

        }
        else{
            System.out.println("invalid task number");

        }
        
    }
    private void mark(){
        System.out.println("\nEnter the task number");
        int num = scanner.nextInt();
        if(num>0 && num <=tasks.size()){
            tasks.set((num-1),tasks.get(num - 1)+"  (completed)");
            System.out.println("Marked as done");
        }
        else{
            System.out.println("invalid task number");

        }
    }
    private void showTask(){
        if(tasks.isEmpty()){
            System.out.println("no task to display");
        }
        else{
            for(int i=0;i<tasks.size();i++){
                System.out.println((i+1)+ ". "+tasks.get(i));
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("start");
        todoList does = new todoList();
        does.run();
    }
}
