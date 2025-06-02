List<Employee> emps = Arrays.asList(
    new Employee("A", 80000,"finance"),
    new Employee("B", 45000,"Automation"),
    new Employee("C", 75000,"crm maintinance")
);
//Names of employees with salary > 70k
List<Employee> res_emps = emps.stream().filter(e->e.salary>70000).collect(Collectors.toList());

// i need only names
emps.stream().filter(e->e.salary>70000).map(Employee::getName).collect(Collectors.toList());