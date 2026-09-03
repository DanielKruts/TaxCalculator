import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Used Claude to extract the data from the resource, How to Compute Withholding for State and County Income Tax in the resource
 *  directory. Pdf was taken from the Indiana Government's official website. 
 * 
 * All values were double checked and confirmed were true, I have gone in and marked the values that are labeled as
 *  having been changed since the last departmental notice.
 */

public class CountyTaxRates {
    public static final double STATE_RATE = 0.0295;
    public static final Map<String, Double> RATES = new LinkedHashMap<>();

    static {
        RATES.put("Adams", 0.016);
        RATES.put("Allen", 0.0159);
        RATES.put("Bartholomew", 0.0175);
        RATES.put("Benton", 0.0179);
        RATES.put("Blackford", 0.025);
        RATES.put("Boone", 0.017);
        RATES.put("Brown", 0.025234);
        RATES.put("Carroll", 0.024733); // rate changed since last notice
        RATES.put("Cass", 0.0295);
        RATES.put("Clark", 0.02);
        RATES.put("Clay", 0.0235);
        RATES.put("Clinton", 0.0265);
        RATES.put("Crawford", 0.0165);
        RATES.put("Daviess", 0.015);
        RATES.put("Dearborn", 0.014);
        RATES.put("Decatur", 0.0245);
        RATES.put("DeKalb", 0.0213);
        RATES.put("Delaware", 0.015);
        RATES.put("Dubois", 0.012);
        RATES.put("Elkhart", 0.02);
        RATES.put("Fayette", 0.0282);
        RATES.put("Floyd", 0.0189);
        RATES.put("Fountain", 0.021);
        RATES.put("Franklin", 0.017);
        RATES.put("Fulton", 0.0288);
        RATES.put("Gibson", 0.013);
        RATES.put("Grant", 0.0275); // rate changed since last notice
        RATES.put("Greene", 0.0235); // rate changed since last notice
        RATES.put("Hamilton", 0.011);
        RATES.put("Hancock", 0.0194);
        RATES.put("Harrison", 0.01);
        RATES.put("Hendricks", 0.017);
        RATES.put("Henry", 0.0202);
        RATES.put("Howard", 0.0235); // rate changed since last notice
        RATES.put("Huntington", 0.0195);
        RATES.put("Jackson", 0.021);
        RATES.put("Jasper", 0.02864);
        RATES.put("Jay", 0.025);
        RATES.put("Jefferson", 0.0103);
        RATES.put("Jennings", 0.025);
        RATES.put("Johnson", 0.014);
        RATES.put("Knox", 0.017);
        RATES.put("Kosciusko", 0.01);
        RATES.put("LaGrange", 0.0165);
        RATES.put("Lake", 0.015);
        RATES.put("LaPorte", 0.0145);
        RATES.put("Lawrence", 0.0175);
        RATES.put("Madison", 0.0225);
        RATES.put("Marion", 0.0202);
        RATES.put("Marshall", 0.0125);
        RATES.put("Martin", 0.025);
        RATES.put("Miami", 0.0254);
        RATES.put("Monroe", 0.0214);
        RATES.put("Montgomery", 0.0265);
        RATES.put("Morgan", 0.0272);
        RATES.put("Newton", 0.01);
        RATES.put("Noble", 0.0175);
        RATES.put("Ohio", 0.02);
        RATES.put("Orange", 0.0175);
        RATES.put("Owen", 0.025);
        RATES.put("Parke", 0.0265);
        RATES.put("Perry", 0.014);
        RATES.put("Pike", 0.012);
        RATES.put("Porter", 0.005);
        RATES.put("Posey", 0.0145);
        RATES.put("Pulaski", 0.0285);
        RATES.put("Putnam", 0.023);
        RATES.put("Randolph", 0.03);
        RATES.put("Ripley", 0.0238);
        RATES.put("Rush", 0.0215);
        RATES.put("St. Joseph", 0.0175);
        RATES.put("Scott", 0.0216);
        RATES.put("Shelby", 0.017); // rate changed since last notice
        RATES.put("Spencer", 0.008);
        RATES.put("Starke", 0.0171);
        RATES.put("Steuben", 0.0199);
        RATES.put("Sullivan", 0.017);
        RATES.put("Switzerland", 0.0145);
        RATES.put("Tippecanoe", 0.0128);
        RATES.put("Tipton", 0.026);
        RATES.put("Union", 0.0275); // rate changed since last notice
        RATES.put("Vanderburgh", 0.0125);
        RATES.put("Vermillion", 0.015);
        RATES.put("Vigo", 0.02);
        RATES.put("Wabash", 0.029);
        RATES.put("Warren", 0.0212);
        RATES.put("Warrick", 0.01);
        RATES.put("Washington", 0.02);
        RATES.put("Wayne", 0.0125);
        RATES.put("Wells", 0.021);
        RATES.put("White", 0.0232);
        RATES.put("Whitley", 0.016829);
    }
}