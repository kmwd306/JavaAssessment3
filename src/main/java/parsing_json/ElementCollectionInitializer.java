package parsing_json;

import com.google.gson.Gson;

import javax.lang.model.util.Elements;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;


public class ElementCollectionInitializer {

    public static ElementCollection generate() {
        Gson gson = new Gson();


        try {
            Elements[] elements = gson.fromJson(new FileReader("/Users/katricewilliams-dredden/Dev/JavaAssessment3/src/main/resources/periodic_table.json")) ;
            ElementCollection elementCollection = new ElementCollection();
            elementCollection.addAll(Arrays.asList(elements));

            return elementCollection;
        }catch (FileNotFoundException e){
            System.out.println("File was not found.");

        }

        return null;
    }
}
//Arrays.asList(elements)