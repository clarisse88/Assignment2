package za.ac.cput;

import java.util.*;

public class EmployeeControler {
   // add collection
    public static int addEmployee(Collection collection){
        int collectionSize = collection.size();
        return collectionSize;
    }
    // remove collection
    public static int removeEmployee(Collection collection, Employee employee){
        collection.remove(employee);
        int size = collection.size();
        return size;
    }
    //find collection
    public static boolean findEmployeeId(Collection collection, Employee employee){

      boolean result=  collection.contains(employee);
      return result;
   }
   //add Map

    public static int addEmployeeMap(Map<Integer,Employee> employeeMap, Employee employee){
        employeeMap.put(1 ,employee);
        int mapSize = employeeMap.size();
        return mapSize;
    }
    //remove Map
    public static int RemoveEmployee(Map<Integer,Employee> employeeMap, Employee employee){
        employeeMap.remove(1 ,employee);
        int mapSize = employeeMap.size();
        return mapSize;
    }
    //find Map
    public static boolean findEmployeeId(Map<Integer,Employee> employeeMap, Employee employee){

        boolean result=  employeeMap.containsKey(1);
        return result;
    }
    //add list
    public static int addEmployee(List employeeList) {
        int Size = employeeList.size();
        return Size;
    }
    // remove list

    public static int removeEmployee(List employeeList,Employee employee) {
        employeeList.remove(employee);
        int size = employeeList.size();
        return size;
    }
    //find list
    public static boolean findEmployeeId(List employeeList, Employee employee) {

        boolean result = employeeList.contains(employee);
        return result;
    }
    //add Set
    public static int addEmployeeSet(Set<Integer> employeeSet, Employee employee) {

        int Size = employeeSet.size();
        return Size;
    }
    //remove Set

    public static int removeEmployee(Set employeeSet, Employee employee) {
        employeeSet.remove(employee);
        int size = employeeSet.size();
        return size;
    }
    //find Set

    public static boolean findEmployeeId(Set employeeSet, Employee employee){

        boolean result= employeeSet.contains(employee);
        return result;
    }


}
