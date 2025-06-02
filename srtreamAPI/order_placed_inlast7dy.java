//last 7 days 
//today-7days=orderlist
LocalDate weekBeforeToday = LocalDate.now().minusDays(7);
LocalDate today=LocalDate.now();
orders.stream().filter(o->o.orderDate.isAfter(weekBeforeToday).isBefore(today));
