package org.example.Interfaces.Interface_Challenge;


enum Geometry {LINE, POINT, POLYGON}

enum PointMarker{CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE}

enum LineMarker {DASHED, DOTTED, SOLID}

public interface Mappable {
    String JSON_PROPERTY = """
           "properties": {%s} """;

    String getLable();
    Geometry getShape();
    String getMarker();

    default String toJSON(){
        return """
               "type": "%s", "label": "%s", "marker": "%s" """.formatted(getShape(), getLable(), getMarker());
    }

    static void mapIt(Mappable mappable){
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }
}
