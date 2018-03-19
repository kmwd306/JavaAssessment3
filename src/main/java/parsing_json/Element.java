package parsing_json;

import java.util.ArrayList;

public class Element {
    private String name;
    private String appearance;
    private double atomic_mass;
    private String category;
    private String color;
    private double boil;
    private String discovered_by;
    private double melt;
    private String named_by;
    private int number;
    private int period;
    private String phase;
    private String source;
    private String spectral_img;
    private String symbol;
    private String summary;
    private int xpos;
    private int ypos;
    private ArrayList<Integer> shells = new ArrayList<>();
    private double molar_heat;
    private double density;


    public Element(String name, String appearance, double atomic_mass, double v, String category, String color, double boil, String discovered_by, double melt, double v1, String named_by, int number, int period, String phase, String source, String spectral_img, String symbol, String summary, int xpos, int ypos, ArrayList<Integer> shells) {

    this.name = name;
    this.appearance = appearance;
    this.atomic_mass = atomic_mass;
    this.category = category;
    this.color = color;
    this.boil = v;
    this.discovered_by=discovered_by;
    this.melt=melt;
    this.named_by=named_by;
    this.number=number;
    this.period=period;
    this.phase=phase;
    this.source=source;
    this.spectral_img=spectral_img;
    this.symbol=summary;
    this.xpos=xpos;
    this.ypos=ypos;
    this.shells.add(1);
    this.summary=symbol;
    this.molar_heat=v1;
    this.density=boil;

    }

    public String getName() {
        return name;
    }

    public String getAppearance() {
        return appearance;
    }

    public double getAtomic_mass() {
        return atomic_mass;
    }

    public String getCategory() {
        return category;
    }

    public String getColor() {
        return color;
    }

    public double getBoil() {
        return boil;
    }

    public double getDensity() {
        return density;
    }

    public String getDiscovered_by() {
        return discovered_by;
    }

    public double getMelt() {
        return melt;
    }

    public double getMolar_heat() {
        return molar_heat;
    }

    public String getNamed_by() {
        return named_by;
    }

    public int getNumber() {
        return number;
    }

    public int getPeriod() {
        return period;
    }

    public String getPhase() {
        return phase;
    }

    public String getSource() {
        return source;
    }

    public String getSpectral_img() {
        return spectral_img;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getSummary() {
        return summary;
    }

    public int getXpos() {
        return xpos;
    }

    public int getYpos() {
        return ypos;
    }

    public ArrayList<Integer> getShells() {
        return shells;
    }

}
