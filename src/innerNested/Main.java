package innerNested;

public class Main {
    // создаем точку вызова
    public static void main(String[] args){
        Parcel parcel = new Parcel();
        Parcel.Destination destination = parcel.new Destination();
        destination.doSmth();


    }
}
