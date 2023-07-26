package Services;

import java.util.ArrayList;
import java.util.Iterator;

public class Service {
    ArrayList<String> words = new ArrayList<>();
    Iterator<String> it = new Iterator<String>() {

        public void addWords(){
            words.add("luz");
            words.add("mate");
            words.add("frío");
        }

        public void removeLuz(){
            while (it.hasNext()){
                if (it.equals("luz")){ it.remove();}
            }
        }

        public void showList(){
            words.toString();
        }
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public String next() {
            return null;
        }
    }
}
