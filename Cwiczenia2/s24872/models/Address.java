package pl.s24872.models;

public class Address {
    String country;
    String city;
    String street;
    int house;
    int flat;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if(country == null){
            throw new RuntimeException("Nazwa kraju nie może być nullem");
        }
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(city == null){
            throw new RuntimeException("Nazwa miasta nie może być nullem");
        }

        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if(street == null){
            throw new RuntimeException("Ulica nie może być nullem");
        }
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        if(house <= 0){
            throw new RuntimeException("Numer domu nie może być mniejszy lub równy 0");
        }
        this.house = house;
    }

    public int getFlat() {
        return flat;
    }

    public void setFlat(int flat) {
        if(flat <= 0){
            throw new RuntimeException("Numer mieszkania nie może być mniejszy lub równy 0");
        }
        this.flat = flat;
    }
}
