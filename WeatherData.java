import java.util.ArrayList;
public class WeatherData
{
    private ArrayList<Double> temperatures;
    public WeatherData(ArrayList<Double> temps){
        temperatures = temps;
    }

    public String toString (){
        return temperatures.toString();
    }

    public void cleanData(double lower, double upper){
        for(int i = 0; i < temperatures.size(); i++){
            if (temperatures.get(i) < lower || temperatures.get(i) > upper){
                temperatures.remove(i);
                i--;
            }
        }
    }
    public int longestHeatWave(double threshold) {
        int heatWave =0;
        int max = 0;

        for (double t: temperatures){
            if (t > threshold){
                heatWave++;
                if (heatWave > max) max = heatWave;
            }
            else heatWave = 0;
        }
    
    return max;
    }
}
