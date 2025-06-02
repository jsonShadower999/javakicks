Map<String, Optional<Employee>> topByDept = emps.stream()
    .collect(Collectors.groupingBy(
        Employee::department,
        Collectors.maxBy(Comparator.comparing(
            e -> e.orders.stream().mapToDouble(Order::getAmount).sum()
        ))
    ));
