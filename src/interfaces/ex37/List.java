package interfaces.ex37;

import java.util.ArrayList;

public class List implements Printable {
        public ArrayList<String> names = new ArrayList<>();

        public void print(){
                System.out.println(names);
        }
}
