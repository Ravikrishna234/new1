import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
class users {
	String username;
	ArrayList<String> followers;
	users(String user, String[] u) {
		this.username = user;
		this.followers = new ArrayList<String>(Arrays.asList(u));
	}
	public String getusername() {
		return this.username;
	}
	// public String getfollowers() {
	// 	return this.followers;
	// }
	public String toString() {
		String s = username + " " + followers;
		return s;
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
	public void commonconnections(String a, String b) {
		String[] fcommon = new String[50];
		String[] tcommon = new String[50];
		int f_size = 0;
		int t_size = 0;
		for(int i = 0; i < user.size(); i++) {
			if(user.get(i).username.equals(a)) {
				for(int j = 0; j < user.get(i).followers.size(); j++) {
				fcommon[f_size++] = user.get(i).followers.get(j);
			}
		}
		t_size = f_size;
		for(int l = 0; l < user.size(); l++) {
			if(user.get(l).username.equals(b)) {
				for(int p = 0; p < user.get(l).followers.size(); p++) {
					fcommon[t_size++] = user.get(l).followers.get(p);
				}
			}
		}
		System.out.println(Arrays.toString(fcommon));
		for(int c = 0; c < fcommon.length; c++) {
			for(int t = 1; t < c; t++) {
				if(fcommon[c] == fcommon[t]) {
					if(fcommon[c] != null) {
						tcommon[t_size++] = fcommon[c];
					}
				}
			}
		}
		System.out.println(Arrays.toString(tcommon));
			 	}

			 	}
	public void getconnections(String a) {
		for(int i = 0; i < user.size(); i++) {
			if(user.get(i).username.equals(a)) {

				System.out.println(user.get(i).followers);
			}
		}
	}
	public void userprint() {
		for(users u : user) {
		System.out.println(u);
	}
	}
}
class social {
	public static void main(String[] args) {
		connections cnts = new connections();
		Scanner s = new Scanner(System.in);
		while(s.hasNext()) {
		String str = s.nextLine().replace("("," ").replace(")","").replace(";"," ");
		String[] token = str.split(" ");
		//System.out.println(token[0]);
		//System.out.println(token[1]);
		String[] tokens;
		switch(token[0]) {
			case "addconnections" :
				tokens = token[1].split(",",2);
				String[] followers = tokens[1].split(",");
				//System.out.println(followers[0]);
				//System.out.println(followers[1]);
				users uobj = new users(tokens[0],followers);
				cnts.addusers(uobj);
				break;
			case "getconnections" :
				cnts.getconnections(token[1]);
				break;
		    case "commonconnections":
		    	tokens = token[1].split(",");
		    	//System.out.println(tokens[0]);
		    	//System.out.println(tokens[1]);
		    	cnts.commonconnections(tokens[0],tokens[1]);
		//System.out.println(str[1]);
		//String[] tokens = str[0].split(" is connected to ");
		//String[] connects = tokens[1].split(",");
		//users uobj = new users(tokens[0],connects);
		//cnts.addusers(uobj);
			}
      }
	}
}