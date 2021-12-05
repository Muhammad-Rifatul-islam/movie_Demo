package bd.edu.rifat.model;

public class Production {

    private String houseName;
    private String addess;
    private double initialBudget;
    private double boxOfice;

    public Production() {
    }

    public Production(String houseName, String addess) {
        this.houseName = houseName;
        this.addess = addess;
    }

    public Production(double initialBudget, double boxOfice) {
        this.initialBudget = initialBudget;
        this.boxOfice = boxOfice;
    }

    public Production(String houseName, String addess, double initialBuddget, double boxOfice) {
        this.houseName = houseName;
        this.addess = addess;
        this.initialBudget = initialBuddget;
        this.boxOfice = boxOfice;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getAddess() {
        return addess;
    }

    public void setAddess(String addess) {
        this.addess = addess;
    }

    public double getInitialBudget() {
        return initialBudget;
    }

    public void setInitialBudget(double initialBudget) {
        this.initialBudget = initialBudget;
    }

    public double getBoxOfice() {
        return boxOfice;
    }

    public void setBoxOfice(double boxOfice) {
        this.boxOfice = boxOfice;
    }

    @Override
    public String toString() {
        return "Production{" +
                "houseName='" + houseName + '\'' +
                ", addess='" + addess + '\'' +
                ", initialBudget=" + initialBudget +"M" +
                ", boxOfice=" + boxOfice +"M" +
                '}';
    }
}
