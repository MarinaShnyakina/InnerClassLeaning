package innerNested;

import java.sql.SQLOutput;

public class Parcel {
    private String recepient;
    private int mass;
    /// ...

    class Destination {
        private String street;
        private int homeNumber;
        private int roomNumber;

        public void doSmth(){
            System.out.println(mass);
        }
    }


    }



    /// ...


