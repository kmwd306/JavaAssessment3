package parsing_json;

//import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

//import javax.lang.model.util.Elements;
//import java.util.Arrays;


public class ElementCollectionInitializer {

    public static ElementCollection generate() {

        Gson gson = new Gson();

        try {
            ArrayList<Element> elements = gson.fromJson(new FileReader("/Users/katricewilliams-dredden/Dev/JavaAssessment3/src/main/resources/periodic_table.json"));
            ElementCollection elementCollection = new ElementCollection();
            elementCollection.addAll(elements);

            return elementCollection;
        }catch (FileNotFoundException e){
            System.out.println("File was not found.");

        }

        return null;
    }

    private static class Gson {
        public ArrayList<Element> fromJson(FileReader fileReader) {
            return null;
        }
    }
}
//PseudoCode
//tried importing GSON and even adding depending manually to pom file. Did not work.
