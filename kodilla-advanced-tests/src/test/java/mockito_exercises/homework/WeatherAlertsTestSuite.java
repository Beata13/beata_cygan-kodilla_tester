package mockito_exercises.homework;

import com.kodilla.mockito_exercises.homework.Alert;
import com.kodilla.mockito_exercises.homework.User;
import com.kodilla.mockito_exercises.homework.WeatherAlert;
import com.kodilla.notifications.Client;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;

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
    public void shouldAddTwoUsersToTheSameLocalisation() {
        WeatherAlert weatherAlert = new WeatherAlert();
        User user = Mockito.mock(User.class);
        User user1 = Mockito.mock(User.class);
        weatherAlert.addUser(user1, "Warsaw");
        Assertions.assertEquals(2, weatherAlert.getUsersNumber("Warsaw"));

    }

    @Test
    public void shouldSendAlertForLocalisation() {
        WeatherAlert weatherAlert = new WeatherAlert();
        User user = Mockito.mock(User.class);
        User user1 = Mockito.mock(User.class);
        weatherAlert.addUser(user, "Warsaw");
        weatherAlert.addUser(user1, "Warsaw");
        Alert alert = Mockito.mock(Alert.class);
        weatherAlert.sendAlert(alert, "Warsaw");
        Mockito.verify(user, times(1)).receive(alert);
        Mockito.verify(user1, times(1)).receive(alert);
    }

    @Test
    public void shouldSendAlertForUserFromOneLocalisation() {
        WeatherAlert weatherAlert = new WeatherAlert();
        User user = Mockito.mock(User.class);
        User user1 = Mockito.mock(User.class);
        weatherAlert.addUser(user, "London");
        weatherAlert.addUser(user1, "Warsaw");
        Alert alert = Mockito.mock(Alert.class);
        weatherAlert.sendAlert(alert, "Warsaw");
        Mockito.verify(user, never()).receive(alert);
        Mockito.verify(user1, times(1)).receive(alert);
    }

    @Test
    public void shouldRemoveUserFromLocalisation() {
        WeatherAlert weatherAlert = new WeatherAlert();
        User user = Mockito.mock(User.class);
        Alert alert = Mockito.mock(Alert.class);
        weatherAlert.addUser(user, "London");
        weatherAlert.unsubscribeAlert(user, "London");
        weatherAlert.sendAlert(alert,"London");
        Mockito.verify(user, never()).receive(alert);
    }

    @Test
    public void shouldRemoveUserFromDifferentLocalisations() {
        WeatherAlert weatherAlert = new WeatherAlert();
        User user = Mockito.mock(User.class);
        Alert alert = Mockito.mock(Alert.class);
        weatherAlert.addUser(user, "London");
        weatherAlert.addUser(user, "Warsaw");
        weatherAlert.unsubscribeAlert(user, "London");
        weatherAlert.sendAlert(alert,"Warsaw");
        weatherAlert.sendAlert(alert,"London");
        Mockito.verify(user, times(1)).receive(alert);
    }
}