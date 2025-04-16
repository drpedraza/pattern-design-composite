package org.example;

public interface ChurrosCompany {
    // obtener el nombre de la seccion
    String getSectionName();
    // agregar mas subsecciones a la seccion que ya tenemos es decir agregas mas composite al composite que tenemos.
    void addSection(ChurrosCompany churro);
    // generar la jerarquia
    void generateHierarchy();
}
