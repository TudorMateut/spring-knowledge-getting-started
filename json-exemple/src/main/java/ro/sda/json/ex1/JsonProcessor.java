package ro.sda.json.ex1;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class JsonProcessor {
    public static void main(String[] args) {
        System.out.println(userToJson("Tudor", 21));

        System.out.println(new JSONObject(new User("Messi", 34)));

        List<User> userList = List.of(new User("Mbappe", 23), new User("Haaland", 21),
                new User("Foden", 20));

        System.out.println(userArrayToJson(userList));
    }

    private static JSONObject userToJson(String name, int age) {
        JSONObject obj = new JSONObject();

        obj.put("name", name);
        obj.put("age", age);

        return obj;
    }

    public static JSONArray userArrayToJson(List<User> list) {
        JSONArray jsonArray = new JSONArray();

        for (User u : list) {
            jsonArray.put(new JSONObject(u));
        }

        //list.forEach(user -> jsonArray.put(new JSONArray(user)));

        return jsonArray;
    }
}
