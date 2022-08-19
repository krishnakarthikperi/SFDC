package Session2;

import java.util.*;

class User{
	String name;
	String password;
	static ArrayList<Client> clientList = new ArrayList<>();
	static ArrayList<Visitor> visitorList = new ArrayList<>();
	static {
	clientList.add(new Client("admin","admin"));
	visitorList.add(new Visitor("admin","admin"));
	}
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(getClass() != obj.getClass()) {return false;}
		User u = (User) obj;
		if(this.name==u.name) {return true;}
		return false;
	}
	public static void registerUser() {
		Scanner usrip = new Scanner(System.in);
		System.out.println("Please enter new username");
		String username = usrip.nextLine();
		System.out.println("Please enter your password");
		String password = usrip.nextLine();
		System.out.println("Do you want to signup as Client or Visitor. \n Choose among the following options. \n1.Client\n2.Visitor");
		int userChoice = usrip.nextInt();
		usrip.close();
		if(userChoice==1) {
			Client uClient = new Client(username,password);
			if(clientList.contains(uClient)) {System.out.println("User already exists!!");return;}
			clientList.add(uClient); 
		}
		else if(userChoice==2) {
			Visitor uVisitor = new Visitor(username,password);										
			if(visitorList.contains(uVisitor)) {System.out.println("User already exists!!");return;}
			visitorList.add(uVisitor); 				
		}
	}
	public static Object loginUser() {
		Scanner usrip = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter your username");
			String username = usrip.nextLine();
			System.out.println("Please enter your password");
			String password = usrip.nextLine();
			System.out.println("Do you want to login as Client or Visitor. \n Choose among the following options. \n1.Client\n2.Visitor");
			int userChoice = usrip.nextInt();
			//usrip.close();
			if(userChoice==1) {
				Client u = new Client(username,password);
				if(clientList.contains(u)) return u;
			}
			else if(userChoice==2) {
				Visitor u = new Visitor(username,password);										
				if(visitorList.contains(u)) return u;
			}
			else {System.out.println("Enter correct details!!");}
		}
	}
	
	
	
}

class Client extends User{
	public Client(String name, String password) {
		super(name, password);
	}
	
	public void deleteTask(Task t1) {
		
		for(Task t:Task.tasks) {
			if(t1.equals(t)) {
				t.name=null;
				t.username=null;
				t.description=null;
				break;
			}
		}
	}
	
	public Task updateTask(Task t1){
		for(Task t:Task.tasks) {
			if(t1.equals(t)) {
				Scanner usrip = new Scanner(System.in);
				System.out.println("Enter new name for the task");
				t.name= usrip.nextLine();
				System.out.println("Enter new description for the task");
				t.description = usrip.nextLine();
				usrip.close();
				return t;
			}
		}
		return t1;
	}
	
	public Task createTask() {
		Scanner usrip = new Scanner(System.in);
		System.out.println("Please enter name of the task");
		String name = usrip.nextLine();
		System.out.println("Please enter description of the task");
		String description = usrip.nextLine();
		System.out.println("Please enter username to whom the task is assigned");
		String username = usrip.nextLine();
		usrip.close();
		return new Task(name,description,username);
	}
	
	public void getMenu() {
		int exitCode=1;
		while(exitCode==1) {
			System.out.println("Select from the following options. \n1.Create Task \n2.View Tasks \n3.Update Task");
			Scanner usrip = new Scanner(System.in);
			int choice = usrip.nextInt();
			if(choice==1) {
				this.createTask();
				System.out.println("Enter 0 to exit or 1 to continue");
				exitCode = usrip.nextInt();
			}
			else if(choice ==2) {
				System.out.println("Please enter username to retrieve records");
				String username = usrip.nextLine();
				Task.getTasks(username);
				System.out.println("Enter 0 to exit or 1 to continue");
				exitCode = usrip.nextInt();
			}
			else if(choice ==3) {
				System.out.println("Please enter name of the task to be updated");
				String name = usrip.nextLine();
				System.out.println("Please enter username to whom the task is assigned to");
				String username = usrip.nextLine();
				this.updateTask(new Task(name,null,username));
				System.out.println("Enter 0 to exit or 1 to continue");
				exitCode = usrip.nextInt();
			}

		}
	}

}

class Visitor extends User{
	public Visitor(String name, String password) {
		super(name, password);
	}
	public Task createTask(String username) {
		Scanner usrip = new Scanner(System.in);
		System.out.println("Please enter name of the task");
		String name = usrip.nextLine();
		System.out.println("Please enter description of the task");
		String description = usrip.nextLine();
		usrip.close();
		return new Task(name,description,username);
	}
	public void getMenu() {
		int exitCode=1;
		while(exitCode==1) {
			System.out.println("Select from the following options. \n1.Create Task \n2.View Tasks");
			Scanner usrip = new Scanner(System.in);
			int choice = usrip.nextInt();
			if(choice==1) {
				this.createTask(this.name);
				System.out.println("Enter 0 to exit or 1 to continue");
				exitCode = usrip.nextInt();
			}
			else if(choice ==2) {
				Task.getTasks(this.name);
				System.out.println("Enter 0 to exit or 1 to continue");
				exitCode = usrip.nextInt();
			}
		}
	}
}

class Task{
	String name;
	String description;
	String username;
	static Task[] tasks = new Task[100];
	
	public Task(String name,String description, String username) {
		super();
		this.name= name;
		this.description = description;
		this.username = username;
		for(Task t1:tasks) {
			if(t1.name==name && t1.username == username) {
				return;
			}
		}
		for(Task t:tasks) {
			if(t==null) {
				t.name=name;
				t.description=description;
				t.username=username;
				break;
			}
		}
	}

	
	@Override
	public boolean equals(Object obj) {
		if(getClass() != obj.getClass()) {return false;}
		Task t = (Task) obj;
		if(this.name==t.name && this.username==t.username) {return true;}
		return false;
	}

	public static void getTasks(String username) {
		String[][] userTasks = new String[100][2];
		int j=0;
		for(Task t:Task.tasks) {
			if(t.username == username) {
				userTasks[j][1]=t.name;
				userTasks[j][2]=t.description;
				j++;
			}
		}
		System.out.println(userTasks);
	}
}

public class ToDoManager {

	public static void main(String[] args) {
		Scanner usrip1 = new Scanner(System.in);
		System.out.println("Welcome to To-Do Manager: \n Please LogIn or SignUp to Continue. \n Choose among the following options. \n1.Login\n2.SignUp");
		int loginChoice = usrip1.nextInt();
		Object user=null;
		if(loginChoice==1) {
			user = User.loginUser();
		}
		else if(loginChoice==2) {
			User.registerUser(); 
			System.out.println("Registration completed\n Please login now!");
			user = User.loginUser();
		}
		if(user.getClass() == Client.class) {
			Client fUser = (Client) user;
			fUser.getMenu();
		}
		else if(user.getClass()==Visitor.class) {
			Visitor fUser = (Visitor) user; 
			fUser.getMenu();
		}
		
	}
}
