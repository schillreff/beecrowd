// The company ABC decided to give a salary increase to its employees,
// according to the following table:

// Salary	Readjustment Rate
// 0 - 400.00
// 400.01 - 800.00
// 800.01 - 1200.00
// 1200.01 - 2000.00
// Above 2000.00

// 15%
// 12%
// 10%
// 7%
// 4%

// Read the employee's salary, calculate and print the new employee's salary,
//  as well the money earned and the increase percentual obtained by the employee,
//  with corresponding messages in Portuguese, as the below example.
// Input
// The input contains only a floating-point number, with 2 digits after
// the decimal point.

// Output
// Print 3 messages followed by the corresponding numbers (see example)
// informing the new salary, the among of money earned (both must be shown
// with 2 decimal places) and the percentual obtained by the employee. Note:
// Novo salario:  means "New Salary"
// Reajuste ganho: means "Money earned"
// Em percentual: means "In percentage"

// Input Sample	Output Sample
// 400.00

// Novo salario: 460.00
// Reajuste ganho: 60.00
// Em percentual: 15 %

// 800.01

// Novo salario: 880.01
// Reajuste ganho: 80.00
// Em percentual: 10 %

// 2000.00

// Novo salario: 2140.00
// Reajuste ganho: 140.00
// Em percentual: 7 %

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))

    val salary = reader.readLine().toDouble()

    val percentage: Int

    if (salary <= 400.0) {
        percentage = 15
    } else if (salary <= 800.0) {
        percentage = 12
    } else if (salary <= 1200.0) {
        percentage = 10
    } else if (salary <= 2000.0) {
        percentage = 7
    } else {
        percentage = 4
    }

    val readjustment = salary * (percentage / 100.0)
    val newSalary = salary + readjustment

    System.out.printf("Novo salario: %.2f%n", newSalary)
    System.out.printf("Reajuste ganho: %.2f%n", readjustment)
    println("Em percentual: $percentage %")
}
