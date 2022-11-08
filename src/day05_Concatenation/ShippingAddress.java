package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {
        String name = "Ahmet Doruk",
               buildingname = "1123B",
               streetname = "Janes Branch Dr",
               city = "McLean",
               state= "VA",
               zipcode = "22031A";


        //System.out.println( name + "\n" + buildingname + " " + streetname + "\n" + city + ", " + state + " " + zipcode );

        String address =  name + "\n" + buildingname + " " + streetname + "\n" + city + ", " + state + " " + zipcode;

        System.out.println(address);
    }

}
