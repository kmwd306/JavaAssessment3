package parsing_json;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ElementCollection extends ArrayList<Element> {



    public Element findByAtomicNumber(int atomic_number) {

        for(Element e: this){
            if(e.getNumber() == atomic_number)
                return e;
        }
    return null;
        //PseudoCode
        //Loop through Arraylist and , call method getNumber
        //this references the array object
        //return the Object Element with the atomic_number (same for name)
    }

    public Element findByName(String name) {

        for(Element e: this){
            if(e.getName().equals(name))
                return e;
        }
        return null;
    }

    public ElementCollection where(String fieldName, Object value) {
        //TODO use field name? I initially had it checking for fieldName in matcher
        //Tried to use (?=field) in my pattern but didn't work, still nullpointexceptioin

        ElementCollection elementCollection = new ElementCollection();

        Pattern checkNameRegex = Pattern.compile("(?=field)" + fieldName);
        Matcher regexNameMatcher;

        Method[] allMethods = Element.class.getMethods();
        Method method = null;//get a nullpointexception because of <- ??

        for(Method m : allMethods){
            regexNameMatcher = checkNameRegex.matcher(m.getName());
            if(regexNameMatcher.find(0)){
                method = m;
            }
        }
        try{
            //states that might throw exceptions
            for(Element e: this){
                if(method.invoke(e).equals(value)){
                    elementCollection.add(e);
                }
            }
            //allMethods = elementCollection.findByName();
        }catch(Exception e){
            //handler action
            e.printStackTrace();
        }
        return elementCollection;
    }
}

//PseudoCode (for where method)
//create a new instance of EC because we have nothing to check attributes for
//Regex using Pattern and Matching, checked the above to make sure it ran on the site online.
//Methods[] returns an array containing Method obj's reflecting Element
//Method method allows for invoking later on.
//if we don't find the match, we return null..that index equals null in better terms
//then we try/catch for the exceptions - because there seems to be a nullpointerexception i cant figure out to save my life
//loop through the arraylist
//if method is invoked and it equals value then add index e to element collection
//catch exceptions
//no return new element collections
