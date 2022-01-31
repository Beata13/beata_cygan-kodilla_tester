package mockito_exercises.homework;

import com.kodilla.mockito_exercises.homework.Alert;
import com.kodilla.mockito_exercises.homework.User;
import com.kodilla.mockito_exercises.homework.WeatherAlert;
import com.kodilla.notifications.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherAlertsTestSuite {
    @Test
    public void shouldAddUserToLocalisation() {
        WeatherAlert weatherAlert = new WeatherAlert();
        User user = Mockito.mock(User.class);
        weatherAlert.addUser(user, "Warsaw");
              Assertions.assertEquals(1, weatherAlert.getUsersNumber("Warsaw"));
    }
    @Test
    public void shouldAddUserToDifferentsLocalisations() {
        WeatherAlert weatherAlert = new WeatherAlert();
        User user = Mockito.mock(User.class);
        weatherAlert.addUser(user, "Warsaw");
        weatherAlert.addUser(user, "London");
        Assertions.assertEquals(1, weatherAlert.getUsersNumber("Warsaw"));
        Assertions.assertEquals(1, weatherAlert.getUsersNumber("London"));
    }
    @Test
    public void shouldAddUserTwoUsersToTheSameLocalisation() {
        WeatherAlert weatherAlert = new WeatherAlert();
        User user = Mockito.mock(User.class);
        User user1 = Mockito.mock(User.class);
        weatherAlert.addUser(user, "Warsaw");
        weatherAlert.addUser(user1, "Warsaw");
        Assertions.assertEquals(2, weatherAlert.getUsersNumber("Warsaw"));

    }
    }

