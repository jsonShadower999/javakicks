// //
//revise it!!!
// grp by dept and extract max salried emp of all dept if many return 1
// List<Employee> emps = Arrays.asList(
//     new Employee("A", 80000,"finance"),
//     new Employee("B", 45000,"Automation"),
//     new Employee("C", 75000,"crm maintinance")
// );
// emps.stream().collect(Collectors.groupingBy(Employee::department),(a,b)->b.salary>a.salary);

  // Group by department and find the highest paid in each department
        Map<String, Optional<Employee>> maxPerDept = emps.stream()
            .collect(Collectors.groupingBy(
                Employee::department,
                Collectors.maxBy(Comparator.comparing(Employee::salary))
            ));

        // From the department-wise top earners, find the single highest-paid employee
        Optional<Employee> topEmployee = maxPerDept.values().stream()
            .filter(Optional::isPresent)
            .map(Optional::get)
            .max(Comparator.comparing(Employee::salary));



