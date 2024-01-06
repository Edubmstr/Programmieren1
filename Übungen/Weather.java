package Übungen;

public class Weather {
    private double[][][] weatherData;

    public Weather(double[][][] data){
        this.weatherData = data;
    }

    public double yearAverage(int type){
        return switch (type) {
            case 0 -> (yearAveragetemp());
            case 1 -> (yearAverageRain());
            default -> 0;
        };
    }

    public Weather convertUs(){
        for (int i = 0; i < weatherData.length; i++) {
            for (int j = 0; j < weatherData[i].length; j++) {
               weatherData[i][j][0] = weatherData[i][j][0] / 3.785411784;
               weatherData[i][j][1] = weatherData[i][j][1] * 1.8 + 32;
            }
        }
        return new Weather(weatherData);
    }

    private double yearAveragetemp(){
        return getAverage(1);
    }

    private double yearAverageRain(){
        return getAverage(0);
    }

    private double getAverage(int index){
        double avg = 0;
        int counter = 0;
        for (int i = 0; i < weatherData.length; i++) {
            for (int j = 0; j < weatherData[i].length; j++) {
                avg += weatherData[i][j][index];
                counter++;
            }
        }
        return avg / counter;
    }
}
