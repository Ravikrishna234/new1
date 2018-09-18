import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
class Food {
	private String food_name;
	private double quantity;
	private String time;
	Food(String fname, double quantity, String time) {
		this.food_name = fname;
		this.quantity = quantity;
		this.time = time;
	}
	public String getfoodname() {
		return this.food_name;
	}
	public double getQuantity() {
		return this.quantity;
	}
	public String gettimedate() {
		return this.time;
	}
}
class Water {
	double quantity;
	String time;
	Water(double quantity,String time) {
		this.quantity = quantity;
		this.time = time;
	}
	public double getQuantity() {
		return this.quantity;
	}
	public String gettimedate() {
		return this.time;
	}
}
class Physical {
	String activity;
	String date;
	String stime;
	String etime;
	Physical(String a, String d, String s, String e) {
		this.activity = a;
		this.date = d;
		this.stime = s;
		this.etime = e;
	}
	public String getactivity() {
		return this.activity;
	}
	public String gettimedate() {
		return this.date;
	}
	public String getstime()
 {
 	return this.stime;
 } 	public String getetime() {
 		return this.etime;
 	}
}

class Sleep {
	String stime;
	String etime;
	Sleep(String s, String e) {
		this.stime = s;
		this.etime = e;
	}
	public String getstime() {
		return this.stime;
	}
	public String getetime() {
		return this.etime;
	}
}
class Weight {
	double weight;
	double fat;
	String date;
	Weight(double weight, double fat, String date) {
		this.weight = weight;
		this.fat = fat;
		this.date = date;
	}
	public String gettimedate() {
		return this.date;
	}
}
class summary {
	Food[] food;
	Water[] water;
	Physical[] physical;
	Weight[] weight;
	Sleep[] sleep;
	int food_size = 0;
	int d_size = 0;
	int physic_size = 0;
	int mass_size = 0;
	int sleep_size = 0;
	summary() {
		food = new Food[50];
		water = new Water[50];
		physical = new Physical[50];
		weight = new Weight[50];
		sleep = new Sleep[50];

	}
	public void addfood(Food f) {
		food[food_size++] = f;
	}
	public void addwater(Water w) {
		water[d_size++] = w;
	}
	public void addphysical(Physical p) {
		physical[physic_size++] = p;
	}
	public void addweight(Weight wt) {
		weight[mass_size++] = wt;
	}
	public void addsleep(Sleep s) {
		sleep[sleep_size++] = s;
	}
	public void show(String date) {
		int count = 0;
		for(int i = 0; i < food_size; i++) {
			String[] list = food[i].gettimedate().split("-");
			if(list[0].equals(date)) {
				System.out.println(food[i].getfoodname() + " " + list[1]);
				count = 1;
			}
		}
		if(count == 0) {
			System.out.println("no food present" + date);
		}
		int count1 = 0;
		for(int i = 0; i < d_size; i++) {
			String[] list = water[i].gettimedate().split("-");
			if(list[0].equals(date)) {
				System.out.println(water[i].getQuantity() + " " + list[1]);
				count1 = 1;
			}
		}
		if(count1 == 0) {
			System.out.println("no water present" + date);
		}
		int count2 = 0;
		for(int i = 0; i < physic_size; i++) {
			String[] list = physical[i].gettimedate().split("-");
			if(list[0].equals(date)) {
				System.out.println(physical[i].gettimedate() + " " + list[1]);
				count2 = 1;
			}
		}
		if(count2 == 0) {
			System.out.println("no physic"+ date);
		}
		int count3 = 0;
		for(int i = 0; i < mass_size; i++) {
			String[] list = weight[i].gettimedate().split("-");
			if(list[0].equals(date)) {
				System.out.println(weight[i].gettimedate() + " " + list[1]);
				count3 = 1;
			}
		}
		if(count3 == 0) {
			System.out.println("no weight gain" + date);
		}
		int count4 = 0;
		for(int i = 0; i < sleep_size; i++) {
			String[] list = sleep[i].getstime().split("-");
			if(list[0].equals(date)) {
				System.out.println(sleep[i].getstime() + " " + list[1]);
				count4 = 1;
			}
		}
		if(count4 == 0) {
			System.out.println("no sleep" + date);
		}
		}
}
class client {
	public static void main(String[] args) {
		summary sm = new summary();
		Scanner s = new Scanner(System.in);
		String line = s.nextLine();
		int lines = Integer.parseInt(line);
		for(int i = 0; i < lines ; i++) {
			String[] tokens = s.nextLine().split(" ");
			switch(tokens[0]) {
				case "food" :
				String[] items = tokens[1].split(",");
				//System.out.println("*****"+items[1]);
				Food foodobj = new Food(items[0],Double.parseDouble(items[1]),items[2]);
				sm.addfood(foodobj);
				break;
				case "water" :
				String[] items1 = tokens[1].split(",");
				Water waterobj = new Water(Double.parseDouble(items1[0]),items1[1]);
				sm.addwater(waterobj);
				break;
				case "sleep":
				String[] items2 = tokens[1].split(",");
				Sleep sleepobj = new Sleep(items2[0],items2[1]);
				sm.addsleep(sleepobj);
				break;
				case "physical":
				String[] items3 = tokens[1].split(",");
				Physical phyobj = new Physical(items3[0],items3[1],items3[2],items3[3]);
				sm.addphysical(phyobj);
				break;
				case "weight":
				String[] items4 = tokens[1].split(",");
				Weight wobj = new Weight(Double.parseDouble(items4[0]),Double.parseDouble(items4[1]),
					items4[2]);
				sm.addweight(wobj);
				break;
				case "show":
				if(tokens.length == 2) {
					sm.show(tokens[1]);
				} else {
				Date obj = new Date();
					SimpleDateFormat objSDF = new SimpleDateFormat("dd/MM/yyyy");
					sm.show(objSDF.format(obj));
				}
			}

			}

		}
	}