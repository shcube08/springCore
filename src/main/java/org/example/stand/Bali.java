package org.example.stand;

import java.util.*;

public class Bali {
    private List<String> name;
    private Map<String,String> pillu;
    private  Properties prop;

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    public Map<String, String> getPillu() {
        return pillu;
    }

    public void setPillu(Map<String, String> pillu) {
        this.pillu = pillu;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bali{" +
                "name=" + name +
                ", pillu=" + pillu +
                '}';
    }
}
