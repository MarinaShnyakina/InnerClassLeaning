package methonInner;

import java.util.ArrayList;
import java.util.List;

public class Sample {


    public void createNewPerson(String name){
        String  nameFIO = name;

        class GenericName{
            List<String> names = new ArrayList<String>(); // ArrayList - расширяемый массив

            public GenericName(){
                for(String str : nameFIO.split(" ")) { // split - разделаем слово по пробелам
                    names.add(str);
                }
            }

            public String getFirstname() {
                return names.get(0);
            }
            public String getLastname() {
                return names.get(names.size() - 1);
            }

        }

        GenericName gname = new GenericName();
        System.out.println("Person: " + gname.getFirstname().charAt(0) + "." + gname.getLastname());


    }
}
