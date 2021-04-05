package com.venkat.basic.SetDemo;

public class Employee implements Comparable
{
    public String empName;
    public int empID;

    public Employee(String empName, int empID)
    {
        this.empName = empName;
        this.empID = empID;
    }

    @Override
    public int compareTo(Object o)
    {
        int empID = this.empID;
        String empName = this.empName;
        int empID2 = ((Employee)o).empID;
        String empName2 = ((Employee)o).empName;

        if(empID == empID2 && empName == empName2)
        {
            return 0;
        }
        return 1;
    }
}
