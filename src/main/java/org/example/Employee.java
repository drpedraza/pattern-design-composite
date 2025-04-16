package org.example;

public class Employee implements ChurrosCompany {
    private String employeeName;

    // Constructor que va a inicializar el nombre del empleado
    Employee(String employee) {
        employeeName = employee;
    }

    // metodo para regresar el nombre del empleado
    @Override
    public String getSectionName() {
        return employeeName;
    }

    @Override
    public void addSection(ChurrosCompany churro) {
        throw new UnsupportedOperationException("Unimplemented method 'addSection'");
    }

    // metodo para generar la jerarquia de cada uno de los empleados
    @Override
    public void generateHierarchy() {
        System.out.println("-Employee: " + employeeName);
    }
}
