import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
class userException extends Exception {
	userException(final String s) {
		super(s);
	}
}
class users {
	String username;
	ArrayList<String> followers;
	users(String user, String[] u) {
		this.username = user;
		this.followers = new ArrayList<String>(Arrays.asList(u));
	}
}
class connections {
	private ArrayList<users> user;
	connections() {
		user = new ArrayList<users>();
	}
	public void addusers(users u) {
		boolean x = false;
		for(int i = 0; i < user.size(); i++) {
		if(user.get(i).username.equals(u.username)) {
			for(int j = 0; j < u.followers.size(); j++) {
				user.get(i).followers.add(u.followers.get(j));
				x = true;
			}
			}
		}
		if(!x) {
			user.add(u);
		}
	}
	public void addconnections(users u) {
		user.add(u);
	}
	public void network() {
			for(int i = 0; i < user.size(); i++) {
				System.out.print(user.get(i).username + ":" + user.get(i).followers + ", ");
			}
			System.out.println();
}
public void getCommonConnections(String a, String b) throws userException{
		ArrayList<String> list1;
		ArrayList<String> list2;
		list1 = new ArrayList<String>();
		list2 = new ArrayList<String>();
		for(int i = 0; i<user.size(); i++) {
			if(user.get(i).username.equals(a)){
				list1 = getconnections(a);
				// System.out.println(list1);
			}
			if(user.get(i).username.equals(b)) {
				list2 = getconnections(b);
				// System.out.println(list2);
			}
	    }
	    ArrayList<String> s;
	    s = new ArrayList<String>();
	    for(String i : list1) {
	    	if (list2.contains(i)) {
	    		 s.add(i);
	    	}

	    }

	    System.out.println(s);
	}
public ArrayList<String> getconnections(String a) throws userException {
		boolean x = false;
		for(int i = 0; i < user.size(); i++) {
			if(user.get(i).username.equals(a)) {
				x =true;
				return user.get(i).followers;
			}
		}
		if(!x) {
			throw new userException("Not a user in network");
		}
		return null;
}
}
class socialnetwork {
	public static void main(String[] args) {
		connections cnts = new connections();
		Scanner s = new Scanner(System.in);

		String[] tokens;
		String[] followers;
		while(s.hasNext()) {
			String[] st = s.nextLine().split(" ");
			switch(st[0]) {
				case "Create" :
				int num = Integer.parseInt(st[1]);
				for(int i = 0; i < num; i++) {
				String[] token = s.nextLine().split(" is connected to ");
				tokens = token[1].split("\\.");
				followers = tokens[0].split(", ");
				// System.out.println(token.length);
				// System.out.println(followers[0]);
				// System.out.println(followers[1]);
				// System.out.println(followers[2]);
				// System.out.println(followers[3]);
				users uobj = new users(token[0],followers);
				cnts.addusers(uobj);
				}
				break;
				case "Network":
				cnts.network();
				break;
				case "addConnections":
				followers = st[2].split(" ");
				//System.out.println(followers[0]);
				//users ub = new users(st[1]);
				users ub = new users(st[1],followers);
				cnts.addconnections(ub);
				break;
				case "getConnections":
				try {
				System.out.println(cnts.getconnections(st[1]));
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
				break;
				case "CommonConnections":
				try {
				cnts.getCommonConnections(st[1],st[2]);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			}

		}
	}
}