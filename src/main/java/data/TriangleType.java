package data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum TriangleType{

    EQUILATERAL("equilateral"),
    ISOSCELES("isosceles"),
    SCALANE("scalane");

    @Getter
    private String description;

}

