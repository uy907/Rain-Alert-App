import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class RainAlertApp

private static final String API_KEY = "87e35bbcf832f11d2c5f5e90bf318527\n";
private static final String CITY = "Amsterdam,nl";
    public static void main (String[] args){
        try{
            String response=getWeatherData(CITY);
            if (response!=null){
                boolean isRaining=checkForRain(response);
                if (isRaining){

                    System.out.
                }
            }
        }
    }




{
}
