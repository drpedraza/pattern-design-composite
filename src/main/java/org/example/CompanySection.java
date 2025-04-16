package org.example;

import java.util.ArrayList;
import java.util.List;

public class CompanySection implements  ChurrosCompany {
    private String sectionName;
    private List<ChurrosCompany> employees;

    // Constructor que va a inicializar el array de churros
    // y nos va a indicar el nombre de la seccion
    CompanySection(String section){
        sectionName = section;
        employees = new ArrayList<ChurrosCompany>();
    }

    // metodo para regresar el nombre de la seccion
    @Override
    public String getSectionName() {
        return sectionName;
    }

    // esto es un composite vamos a agregarle a la
    // implementacion de addsection una manera de agregar nuevas secciones,
    // utiliza un objeto que hereda de la interfaz.
    @Override
    public void addSection(ChurrosCompany churro) {
        employees.add(churro);
    }

    // metodo para generar la jerarquia de cada una de las secciones
    @Override
    public void generateHierarchy() {
        System.out.println(sectionName);
        for (int i = 0; i < employees.size(); i++) {
            employees.get(i).generateHierarchy();
        }
        System.out.println("/" + sectionName);
    }
}
