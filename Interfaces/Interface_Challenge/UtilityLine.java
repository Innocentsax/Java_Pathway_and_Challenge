package org.example.Interfaces.Interface_Challenge;

import java.awt.*;

enum UtilityType {ELECTRICAL, FIBER_OPTIC, GAS, WATER}
public class UtilityLine implements Mappable {
    private String name;
    private UtilityType type;

    public UtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLable() {
        return name + " (" + type + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String getMarker() {
        return switch (type){
            case ELECTRICAL -> Color.RED + " " + LineMarker.DASHED;
            case FIBER_OPTIC -> Color.GREEN + " " + LineMarker.DOTTED;
            case GAS -> Color.ORANGE + " " + LineMarker.SOLID;
            case WATER -> Color.BLUE + " " + LineMarker.SOLID;
            default -> Color.BLACK + " " + LineMarker.SOLID;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                ,"name" : "%s", "utility": :%s" """.formatted(name, type);
    }
}
