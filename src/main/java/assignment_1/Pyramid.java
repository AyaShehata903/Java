
package assignment_1;

public class Pyramid {
    private double height;
    private String moden_name;
    private String pharaoh;
    private String site;

    public Pyramid(String height, String moden_name, String pharaoh, String site) {
        try{
            this.height = Double.valueOf(height.replaceAll("s",""));
        } catch(Exception e){
            this.height = -1;
        }
        
        this.moden_name = moden_name;
        this.pharaoh = pharaoh;
        this.site = site;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setModen_name(String moden_name) {
        this.moden_name = moden_name;
    }

    public void setPharaoh(String pharaoh) {
        this.pharaoh = pharaoh;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public double getHeight() {
        return height;
    }

    public String getModen_name() {
        return moden_name;
    }

    public String getPharaoh() {
        return pharaoh;
    }

    public String getSite() {
        return site;
    }

    @Override
    public String toString() {
        return "Pyramid{" + "height=" + height + ", moden_name=" + moden_name + ", pharaoh=" + pharaoh + ", site=" + site + '}';
    }
    
    
}
