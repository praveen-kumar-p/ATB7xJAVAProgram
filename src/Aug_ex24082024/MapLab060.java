package Aug_ex24082024;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapLab060 {
    public static void main(String[] args) {

        //Map -- Is the Key and value pair
        // The Key should be Unique [Means Key should not be Same]
        // Can't have the Duplicate Keys
        // It is a Interface


        Map m = new HashMap();  // Output will not be in Order
        Map m1 = new LinkedHashMap(); // Output will be Order
        Map m2 = new TreeMap(); // Output will be in First letter assending
        m.put("name", "Praveen");
        m.put("RollNo", "018");
        m.put("Phone", "9972944018");
        m.put("Company", "YMTS");
        System.out.println(m);

    }
}
