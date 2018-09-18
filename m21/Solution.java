import java.util.Scanner;
class foodlog {
    private String fooditem;
    private double quantity;
    private String date;
    private String time;
    foodlog() {

    }
    foodlog(String fooditem1, int quantity1, String date1, String time1) {
        this.fooditem = fooditem1;
        this.quantity = quantity1;
        this.date = date1;
        this.time = time1;
    }
    public String getFooditem() {
        return this.fooditem;
    }
    public double getQuantity() {
        return this.quantity;
    }
    public String getDate() {
        return this.date;
    }
    public String getTime() {
        return this.time;
    }
}
class waterlog {
    private double quantity;
    private String date;
    private String time;
    waterlog() {

    }
    waterlog(double quantity1, String date1, String time1) {
        this.quantity = quantity1;
        this.date = date1;
        this.time  = time1;
    }
    public double getQuantity() {
        return this.quantity;
    }
    public String getdate() {
        return this.date;
    }
    public String gettime() {
        return this.time;
    }
}
class weight {
    private double weight;
    private String date;
    private String fat;
    weight() {

    }
    weight(double weight1, String fat1, String date1) {
        this.weight = weight1;
        this.date = date1;
        this.fat = fat1;

    }
    public double getWeight() {
        return this.weight;
    }
    public String getFat() {
        return this.fat;
    }
    public String getDate() {
        return this.date;
    }
}
class sleep {
    private String dst;
    private String det;
    private String date;
    sleep() {

    }
    sleep(String dst1, String det1, String date1) {
        this.dst = dst1;
        this.dst = det1;
        this.date = date1;
    }

    public String getdst() {
        return dst;
    }
    public  String getDate() {
        return date;
    }

    public String getdet() {
        return det;
    }
}
class physicalAct {
    private String actname;
    private String start;
    private String end;
    private String date;
    // private String note;
    physicalAct() {

    }
    physicalAct(String actname1, String start1, String end1, String date1) {
        this.start = start1;
        this.end = end1;
        this.actname = actname1;
        this.date = date1;
        // this.note = note1;
    }
    public String getActname() {
        return this.actname;
    }
    public String getStart() {
        return this.start;
    }
    public String getEnd() {
        return this.end;
    }
    public String getdate() {
        return this.date;
    }
}

public class Solution {
    private Solution() { }
    public static void main(String[] args) {
        client p = new client();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] tokens = line.split(" ",2);
            switch(tokens[0]){
                case "food":
                String[] info = tokens[1].split(",");
                p.food(info[0], Integer.parseInt(info[1]), info[2], info[3]);
                break;
                case "water":
                String[] in = tokens[1].split(",");
                p.drinking(Integer.parseInt(in[0]), in[1], in[2]);
                break;
                case "physicalactivity":
                String[] arr = tokens[1].split(",");
                p.physical(arr[0], arr[1], arr[2], arr[3]);
                break;
                case "weight":
                String[] we = tokens[1].split(",");
                p.weight(Integer.parseInt(we[0]), we[1],we[2]);
                break;
                case "sleep":
                String[] sl = tokens[1].split(",");
                p.sleep(sl[0],sl[1], sl[2]);
                break;
                case "summary":
                p.print();
                break;
                case "foodlog":
                p.foodlog();
                break;
                case "waterlog":
                p.waterlog();
                break;
                case "weightlog":
                p.weightlog();
                break;
                case "activitylog":
                p.activitylog();
                break;
                case "sleeplog":
                p.sleeplog();
                break;
            }
        }
    }
}
