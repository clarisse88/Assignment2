package za.ac.cput;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void TestAddEmployeeWithCollection(){
        Collection<Employee> employeeCollection = new LinkedList<>();
        Employee emp1 = new Employee(100,"Marco","Mulondayi",18,"M");
        Employee emp2 = new Employee(101,"Roger","Mulondayi",19,"F");
        employeeCollection.add(emp1);
        employeeCollection.add(emp2);
        int size = EmployeeControler.addEmployee(employeeCollection);
        assertEquals(2,size);

    }

    @Test
    void TestRemoveEmployeeWithCollection(){
        Collection<Employee> employeeCollection = new LinkedList<>();
        Employee emp1 = new Employee(100,"Marco","Mulondayi",18,"M");
        Employee emp2 = new Employee(101,"Roger","Mulondayi",19,"F");
        employeeCollection.add(emp1);
        employeeCollection.add(emp2);
        int size = EmployeeControler.removeEmployee(employeeCollection,emp1);
        assertEquals(1,size);

    }
    @Test
    void TestFindEmployeeWithCollection(){
        Collection<Employee> employeeCollection = new LinkedList<>();
        Employee emp1 = new Employee(100,"Marco","Mulondayi",18,"M");
        Employee emp2 = new Employee(101,"Roger","Mulondayi",19,"F");
        employeeCollection.add(emp1);
        employeeCollection.add(emp2);
        boolean result = EmployeeControler.findEmployeeId(employeeCollection,emp1);
        assertEquals(true,result);

    }

    @Test
        void TestAddEmployeeWithMap(){
            Map<Integer,Employee> employeeMap;
            employeeMap = new HashMap<>();
            Employee emp1 = new Employee(100,"Marc","Mutombo",23,"M");
            Employee emp2 = new Employee(101,"Sandra","Mulondayi",39,"F");
            employeeMap.put(1,emp1);
            employeeMap.put(2, emp2);
            int size = EmployeeControler.addEmployeeMap(employeeMap,emp1);
            assertEquals(2,size);

        }

        @Test
        void TestRemoveEmployeeWithMap(){

            Map<Integer,Employee> employeeMap;
            employeeMap = new HashMap<>();
            Employee emp1 = new Employee(100,"Marc","Mutombo",23,"M");
            Employee emp2 = new Employee(101,"Sandra","Mulondayi",39,"F");
            employeeMap.put(1,emp1);
            employeeMap.put(2, emp2);
            int size = EmployeeControler.RemoveEmployee(employeeMap,emp1);
            assertEquals(1,size);

        }
        @Test
        void TestFindEmployeeWithMap(){
            Map<Integer,Employee> employeeMap;
            employeeMap = new HashMap<>();
            Employee emp1 = new Employee(100,"Marco","Mulondayi",18,"M");
            Employee emp2 = new Employee(101,"Roger","Mulondayi",19,"F");
            employeeMap.put(1, emp1);
            employeeMap.put(2,emp2);
            boolean result = EmployeeControler.findEmployeeId(employeeMap,emp1);
            assertEquals(true,result);

        }
        @Test
        void TestAddEmployeeWithList() {
            List<Employee> employeeList = new ArrayList<>();
            Employee emp1 = new Employee(100, "Marc", "Mutombo", 23, "M");
            Employee emp2 = new Employee(101, "Sandra", "Mulondayi", 39, "F");
            employeeList.add(emp1);
            employeeList.add(emp2);
            employeeList.add(emp2);
            int size = EmployeeControler.addEmployee(employeeList);
            assertEquals(3, size);
        }
        @Test
            void TestRemoveEmployeeWithList(){
                List<Employee> employeeList = new ArrayList<>();
                Employee emp1 = new Employee(100,"Marc","Mutombo",23,"M");
                Employee emp2 = new Employee(101,"Sandra","Mulondayi",39,"F");
                employeeList.add(emp1);
                employeeList.add(emp2);
                int size = EmployeeControler.removeEmployee(employeeList,emp1);
                assertEquals(1,size);

        }
    @Test
    void TestFindEmployeeWithList(){
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee(100,"Marco","Mulondayi",18,"M");
        Employee emp2 = new Employee(101,"Roger","Mulondayi",19,"F");
        employeeList.add(emp1);
        employeeList.add(emp2);
        boolean result = EmployeeControler.findEmployeeId(employeeList,emp1);
        assertEquals(true,result);
    }
    @Test
    void TestAddEmployeeWithSet() {
        Set<Employee> employeeSet = new HashSet<>();
        Employee emp1 = new Employee(100, "Marc", "Mutombo", 23, "M");
        Employee emp2 = new Employee(101, "Sandra", "Mulondayi", 39, "F");
        employeeSet.add(emp1);
        employeeSet.add(emp1);
        employeeSet.add(emp2);
        employeeSet.add(emp2);
        int size = EmployeeControler.addEmployee(employeeSet);
        assertEquals(2, size);
    }
    @Test
    void TestRemoveEmployeeWithSet() {

        Set<Employee> employeeSet = new HashSet<>();
        Employee emp1 = new Employee(100, "Marc", "Mutombo", 23, "M");
        Employee emp2 = new Employee(101, "Sandra", "Mulondayi", 39, "F");
        employeeSet.add(emp1);
        employeeSet.add(emp2);
        int size = EmployeeControler.removeEmployee(employeeSet,emp1);
        assertEquals(1, size);
    }
    @Test
    void TestFindEmployeeWithSet() {

        Set<Employee> employeeSet = new HashSet<>();
        Employee emp1 = new Employee(100, "Marc", "Mutombo", 23, "M");
        Employee emp2 = new Employee(101, "Sandra", "Mulondayi", 39, "F");
        employeeSet.add(emp1);
        employeeSet.add( emp2);
        boolean result = EmployeeControler.findEmployeeId(employeeSet,emp1);
        assertEquals(true,result);
    }

}














