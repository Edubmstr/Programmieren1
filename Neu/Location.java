package Neu;

public class Location {
    public String city;
    public String street;
    public int postcode;
    public int number;

    public Location(String city, int postcode, String street, int number){
        this.city = city;
        this.street = street;
        this.postcode = postcode;
        this.number = number;
    }

    public String toString(){
        return this.city + " " + this.postcode + " " + this.street + " " + this.number;
    }
}


