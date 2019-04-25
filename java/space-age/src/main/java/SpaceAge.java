class SpaceAge {

    private double seconds;
    private double orbital;
    private double secondsOfYearOnEarth = 31557600;
    private double orbitalEarth = 1;
    private double orbitalMercury = 0.2408467;
    private double orbitalVenus = 0.61519726;
    private double orbitalMars = 1.8808158;
    private double orbitalJupiter = 11.862615;
    private double orbitalSaturn = 29.447498;
    private double orbitalUranus = 84.016846;
    private double orbitalNeptune = 164.79132;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    private double getSeconds() {
        return secondsOfYearOnEarth * orbital;
    }

    double onEarth() {
        orbital = orbitalEarth;
        return Math.round((seconds / getSeconds())*100.0)/100.0;
    }

    double onMercury() {
        orbital = orbitalMercury;
        return Math.round((seconds / getSeconds())*100.0)/100.0;
    }

    double onVenus() {
        orbital = orbitalVenus;
        return Math.round((seconds / getSeconds())*100.0)/100.0;
    }

    double onMars() {
        orbital = orbitalMars;
        return Math.round((seconds / getSeconds())*100.0)/100.0;
    }

    double onJupiter() {
        orbital = orbitalJupiter;
        return Math.round((seconds / getSeconds())*100.0)/100.0;
    }

    double onSaturn() {
        orbital = orbitalSaturn;
        return Math.round((seconds / getSeconds())*100.0)/100.0;
    }

    double onUranus() {
        orbital = orbitalUranus;
        return Math.round((seconds / getSeconds())*100.0)/100.0;
    }

    double onNeptune() {
        orbital = orbitalNeptune;
        return Math.round((seconds / getSeconds())*100.0)/100.0;
    }

}
