import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiPredicate;

public class PredicateDemo {

    public static void main(String[] args) {
        BiPredicate<Config, Config> displayOrganism = (config1, config2) -> config1.isDisplayOrganism()!=config2.isDisplayOrganism();
        BiPredicate<Config, Config> displayOrganismQty = (config1, config2) -> config1.isDisplayOrganismQty()!=config2.isDisplayOrganismQty();
        BiPredicate<Config, Config> displayMcFarland = (config1, config2) -> config1.isDisplayMcFarland()!=config2.isDisplayMcFarland();
        Map<BiPredicate, String> predicateToLabelMap = new HashMap();
        predicateToLabelMap.put(displayOrganism, "displayOrganism");
        predicateToLabelMap.put(displayOrganismQty, "displayOrganismQty");
        predicateToLabelMap.put(displayMcFarland, "displayMcFarland");

        Set<String> inconsitentFields = new HashSet();

        Config c1 = new Config();
        c1.setDisplayMcFarland(true);
        Config c2 = new Config();

        predicateToLabelMap.forEach((p,s) -> { if(p.test(c1, c2)) inconsitentFields.add(s); });

        System.out.println(inconsitentFields);
    }
}

class Config {
    private boolean displayOrganism;
    private boolean displayOrganismQty;
    private boolean displayMcFarland;

    public void setDisplayMcFarland(boolean displayMcFarland) {
        this.displayMcFarland = displayMcFarland;
    }

    public boolean isDisplayMcFarland() {
        return displayMcFarland;
    }

    public void setDisplayOrganism(boolean displayOrganism) {
        this.displayOrganism = displayOrganism;
    }

    public boolean isDisplayOrganism() {
        return displayOrganism;
    }

    public void setDisplayOrganismQty(boolean displayOrganismQty) {
        this.displayOrganismQty = displayOrganismQty;
    }

    public boolean isDisplayOrganismQty() {
        return displayOrganismQty;
    }
}
