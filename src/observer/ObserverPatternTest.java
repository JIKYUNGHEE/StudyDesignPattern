package observer;

public class ObserverPatternTest {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer observer1 = new CurrentConditionDisplay(weatherData, 1);
        Observer observer2 = new CurrentConditionDisplay(weatherData, 2);
        Observer observer3 = new CurrentConditionDisplay(weatherData, 3);

        weatherData.setMeasurements(30, 65, 30.4f);
        weatherData.setMeasurements(29, 64, 30.5f);
        weatherData.setMeasurements(30, 64, 30.6f);
    }
}