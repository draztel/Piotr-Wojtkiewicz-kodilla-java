package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    Continent continent;

    public final List<Continent> continentList() {
        continentList().add(continent);
        return continentList();
    }
}
