package com.kodilla.mockito_exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeatherAlert {
    private Map<String,List <User>> users = new HashMap<>();

    public void addUser(User user, String localisation) {
        if (!users.containsKey(localisation)) {
            List<User> usersList = new ArrayList<>();
            usersList.add(user);
            users.put(localisation, usersList);
        }
        else {
            users.get(localisation).add(user);

        }
    }
        public int getUsersNumber(String localisation){
       if (!users.containsKey(localisation)){
           return 0;
       }

        return users.get(localisation).size();

    }


}
