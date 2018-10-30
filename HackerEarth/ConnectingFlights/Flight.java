package ConnectingFlights;

public class Flight {
    String startCity;
    String endCity;
    String connectingCity;
    int numbeOfConnectingFlights;
    int cost;

    public Flight(String connectingCity, int numbeOfConnectingFlights, int cost) {
        this.connectingCity = connectingCity;
        this.numbeOfConnectingFlights = numbeOfConnectingFlights;
        this.cost = cost;
    }

    public Flight(String startCity, String endCity, int cost) {
        this.startCity = startCity;
        this.endCity = endCity;
        this.cost = cost;
    }

    public Flight(String startCity, String endCity, String connectingCity, int numbeOfConnectingFlights, int cost) {
        this.startCity = startCity;
        this.endCity = endCity;
        this.connectingCity = connectingCity;
        this.numbeOfConnectingFlights = numbeOfConnectingFlights;
        this.cost = cost;
    }

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    public String getEndCity() {
        return endCity;
    }

    public void setEndCity(String endCity) {
        this.endCity = endCity;
    }

    public String getConnectingCity() {
        return connectingCity;
    }

    public void setConnectingCity(String connectingCity) {
        this.connectingCity = connectingCity;
    }

    public int getNumbeOfConnectingFlights() {
        return numbeOfConnectingFlights;
    }

    public void setNumbeOfConnectingFlights(int numbeOfConnectingFlights) {
        this.numbeOfConnectingFlights = numbeOfConnectingFlights;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
