class client {
    foodlog[] foodinfo = new foodlog[10];
    int size1=0;
    waterlog[] waterinfo = new waterlog[10];
    int size2=0;
    physicalAct[] physicalActinfo = new physicalAct[10];
    int size3=0;
    weight[] weightinfo = new weight[10];
    int size4=0;
    sleep[] sleepinfo = new sleep[10];
    int size5=0;
    public void food(String item, int q, String date, String time){
        foodlog f = new foodlog(item, q, date, time);
        foodinfo[size1++] = f;
    }
    public void drinking(int quantity, String time, String date) {
        waterlog w = new waterlog(quantity, time, date);
        waterinfo[size2++] = w;
    }
    public void physical(String name, String stime, String etime, String date){
        physicalAct a = new physicalAct(name, stime, etime, date);
        physicalActinfo[size3++] = a;
    }
    public void weight(int kg, String fat, String date) {
        weight w =new weight(kg, fat, date);
        weightinfo[size4++] = w;
    }
    public void sleep(String starttime, String endtime, String date) {
        sleep s =new sleep(starttime,endtime, date);
        sleepinfo[size5++] = s;
    }
    public void foodlog() {
        String s1 = "Food\n";
            for(int i = 0; i< size1;i++) {
                s1 += "Date:"+ foodinfo[i].getDate() + "\n" + "Time:" + foodinfo[i].getTime() + "\n" + "Name:" + foodinfo[i].getFooditem() + "\n" + "Quantity:" + foodinfo[i].getQuantity() + "\n";
             System.out.println(s1);
            }

    }
    public void waterlog() {
        String s2 = "Water\n";
        for(int i = 0; i< size2;i++) {
            s2 += "Date:"+ waterinfo[i].getdate() + "\n" + "Quantity:" + waterinfo[i].getQuantity() + "\n";
            System.out.println(s2);
        }
    }
    public void sleeplog() {
        String s3 = "Sleep\n";
        for(int i = 0; i< size5;i++) {
            s3 += "Date:" + sleepinfo[i].getDate() + "\n" + "Starttime:" + sleepinfo[i].getdst() + "\n" + "Endtime" + sleepinfo[i].getdet() + "\n";
            System.out.println(s3);
        }
    }
    public void weightlog() {
        String s4 = "Weight\n";
        for(int i = 0; i< size4;i++) {
            s4 += "Weight" + "\n" +"Date:" + weightinfo[i].getDate() + "\n" + "Weight:" + weightinfo[i].getWeight() + "\n" + "Fat:" + weightinfo[i].getFat() + "\n";
            System.out.println(s4);
        }
    }
    public void activitylog() {
        String s5 = "Activities\n";
        for(int i = 0; i< size3;i++) {
            s5 += "PhysicalActivity\n" + "name:" + physicalActinfo[i].getActname() + "\n" + "Date:"+ physicalActinfo[i].getdate() + "\n"
            + "Starttime:" + physicalActinfo[i].getStart() + "\n" + "Endtime:" + physicalActinfo[i].getEnd() + "\n";
            System.out.println(s5);
        }
    }

    public void print() {
        String a1 = "";
        String a2 = "";
        String a3 = "";
        String a4 = "";
        String a5 = "";
        for(int i = 0; i< size1;i++) {
            // System.out.println(foodinfo[i].getfoodname()+" "+foodinfo[i].getquantity()+" "+foodinfo[i].gettime());
            a1 += "Food\n" + "Date:"+ foodinfo[i].getDate() + "\n" + "Time:" + foodinfo[i].getTime() + "\n" + "Name:" + foodinfo[i].getFooditem() + "\n" + "Quantity:" + foodinfo[i].getQuantity() + "\n";
             System.out.println(a1);
        }
        for(int i = 0; i< size2;i++) {
            // System.out.println(waterinfo[i].getwaterquantity());
            a2 += "Water\n" + "Date:"+ waterinfo[i].getdate() + "\n" + "Quantity:" + waterinfo[i].getQuantity() + "\n";
            System.out.println(a2);
        }
        for(int i = 0; i< size3;i++) {
            // System.out.println(activityinfo[i].getactivity_name()+" "+activityinfo[i].getstarttime()+" "+activityinfo[i].getendtime()+" "+activityinfo[i].getdate());
            a3 += "PhysicalActivity\n" + "name:" + physicalActinfo[i].getActname() + "\n" + "Date:"+ physicalActinfo[i].getdate() + "\n"
            + "Starttime:" + physicalActinfo[i].getStart() + "\n" + "Endtime:" + physicalActinfo[i].getEnd() + "\n";
            System.out.println(a3);
        }
        for(int i = 0; i< size4;i++) {
            // System.out.println(weightinfo[i].getweight()+" "+weightinfo[i].getfat()+" "+weightinfo[i].getdate());
            a4 += "Weight" + "\n" +"Date:" + weightinfo[i].getDate() + "\n" + "Weight:" + weightinfo[i].getWeight() + "\n" + "Fat:" + weightinfo[i].getFat() + "\n";
            System.out.println(a4);
        }
        for(int i = 0; i< size5;i++) {
            // System.out.println(sleepinfo[i].getdatestime()+" "+sleepinfo[i].getdateetime());
            a5 += "Sleep" + "\n" + "Date:" + sleepinfo[i].getDate() + "\n" + "Starttime:" + sleepinfo[i].getdst() + "\n" + "Endtime" + sleepinfo[i].getdet() + "\n";
            System.out.println(a5);
        }
    }

 }