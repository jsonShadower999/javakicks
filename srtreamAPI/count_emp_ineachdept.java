List<Employee> emps = Arrays.asList(
    new Employee("A", 80000,"finance"),
    new Employee("B", 45000,"Automation"),
    new Employee("C", 75000,"crm maintinance")
);
Map<String,Long> cntdept=emps.stream()
.collect(Collectors.groupingBy(Employee::department),Collectors.couting());

//  Map<String, Optional<Employee>> maxPerDept = emps.stream()
//             .collect(Collectors.groupingBy(
//                 Employee::department,
//                 Collectors.maxBy(Comparator.comparing(Employee::salary))
//             ));