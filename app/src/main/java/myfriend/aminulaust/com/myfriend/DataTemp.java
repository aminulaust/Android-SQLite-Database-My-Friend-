package myfriend.aminulaust.com.myfriend;


public class DataTemp {

    private int id;
    private String name;
    private String day;
    private String contact;

    public DataTemp(String n, String d , String c){
        name = n;
        day = d;
        contact=c;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }
}
