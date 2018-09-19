import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
class Food {
	private String food_name;
	private double quantity;
	private String date;
	private String time;
	Food(String fname, double quantity, String date, String time) {
		this.food_name = fname;
		this.quantity = quantity;
		this.time = time;
		this.date = date;
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
	public String getDate() {
		return this.date;
	}
}
class Water {
	double quantity;
	String date;
	String time;
	Water(double quantity,String date,String time) {
		this.quantity = quantity;
		this.date = date;
		this.time = time;
	}
	public double getQuantity() {
		return this.quantity;
	}
	public String gettimedate() {
		return this.date;
	}
	public String getTime() {
		return this.time;
	}
}
class Physical {
	String activity;
	String info;
	String date;
	String stime;
	String etime;
	Physical(String a, String d, String b, String s, String e) {
		this.activity = a;
		this.info = d;
		this.date = b;
		this.stime = s;
		this.etime = e;
	}
	public String getactivity() {
		return this.activity;
	}
	public String getinfo() {
		return this.info;
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
	String date;
	String stime;
	String etime;
	Sleep(String d, String s, String e) {
		this.date = d;
		this.stime = s;
		this.etime = e;
	}
	public String getDate() {
		return this.date;
	}
	public String getstime() {
		return this.stime;
	}
	public String getetime() {
		return this.etime;
	}
}
class Weight {
	String date;
	String time;
	String weight;
	String fat;
	Weight(String date, String time, String weight, String fat) {
		this.weight = weight;
		this.fat = fat;
		this.date = date;
		this.time = time;
	}
	public String gettimedate() {
		return this.date;
	}
	public String gettime() {
		return this.time;
	}
	public String getweight() {
		return this.weight;
	}
	public String getfat() {
		return this.fat;
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
	public void foodprint() {
		System.out.println("Food");
		for(int i = 0; i < food_size; i++) {
			System.out.println("Date:" + food[i].getDate());
			System.out.println("Time:" + food[i].gettimedate());
			System.out.println("Name:" + food[i].getfoodname());
			System.out.println("Quantity:" + food[i].getQuantity());
		}
	}
	public void waterprint() {
		System.out.println("Water");
		for(int i = 0; i < d_size; i++){
			System.out.println("Date: " + water[i].gettimedate());
			System.out.println("Quantity: " + water[i].getQuantity());
		}
	}
	public void physicalprint() {
		System.out.println("PhysicalActivity");
		for(int i = 0; i < physic_size; i++) {
			System.out.println("Name: " + physical[i].getactivity());
			System.out.println("Notes: " + physical[i].getinfo());
			System.out.println("Date: " + physical[i].gettimedate());
			System.out.println("Starttime: " + physical[i].getstime());
			System.out.println("Endtime: " + physical[i].getetime());
		}
	}
	public void sleepprint() {
		System.out.println("sleep");
		for(int i = 0; i < sleep_size; i++) {
			System.out.println("Date:" + sleep[i].getDate());
			System.out.println("Starttime:" + sleep[i].getstime());
			System.out.println("Endtime:" + sleep[i].getetime());
		}
	}
	public void weightprint() {
		System.out.println("Weight");
		for(int i = 0; i < mass_size; i++) {
			System.out.println("Date: " + weight[i].gettimedate());
			System.out.println("Time: " + weight[i].gettime());
			System.out.println("Weight: " + weight[i].getweight());
			System.out.println("Fat: " + weight[i].getfat());
		}
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
		while(s.hasNext()) {
			String[] tokens = s.nextLine().split(" ");
			switch(tokens[0]) {
				case "food" :
				String[] items = tokens[1].split(",");
				//System.out.println("*****"+items[1]);
				Food foodobj = new Food(items[0],Double.parseDouble(items[1]),items[2],items[3]);
				sm.addfood(foodobj);
				break;
				case "foodprint" :
				sm.foodprint();
				break;
				case "waterprint":
				sm.waterprint();
				break;
				case "physicalprint" :
				sm.physicalprint();
				break;
				case "weightprint":
				sm.weightprint();
				break;
				case "sleepprint":
				sm.sleepprint();
				break;
				case "water" :
				String[] items1 = tokens[1].split(",");
				Water waterobj = new Water(Double.parseDouble(items1[0]),items1[1],items1[2]);
				sm.addwater(waterobj);
				break;
				case "sleep":
				String[] items2 = tokens[1].split(",");
				Sleep sleepobj = new Sleep(items2[0],items2[1],items2[2]);
				sm.addsleep(sleepobj);
				break;

				case "physical":
				String[] items3 = tokens[1].split(",");
				Physical phyobj = new Physical(items3[0],items3[1],items3[2],items3[3],items3[4]);
				sm.addphysical(phyobj);
				break;
				case "weight":
				String[] items4 = tokens[1].split(",");
				Weight wobj = new Weight(items4[0],items4[1],items4[2],items4[3]);
				sm.addweight(wobj);
				break;
				case "show":
				if(tokens.length == 1) {
					sm.foodprint();
					sm.waterprint();
					sm.physicalprint();
					sm.weightprint();
					sm.sleepprint();
				} else {
				Date obj = new Date();
					SimpleDateFormat objSDF = new SimpleDateFormat("dd/MM/yyyy");
					sm.show(objSDF.format(obj));
				}
			}

			}

		}
	}