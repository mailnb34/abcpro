package com.mai.abcpro;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.mai.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_employee_management);

        TableLayout tableLayout = findViewById(R.id.employee_table);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("M001", "John", "Manager"));
        employeeList.add(new Employee("M002", "Linda", "Manager"));
        employeeList.add(new Employee("M003", "Peter", "Manager"));
        employeeList.add(new Employee("D001", "Bob", "Developer"));
        employeeList.add(new Employee("D002", "Xera", "Developer"));
        employeeList.add(new Employee("D003", "Rosa", "Developer"));
        employeeList.add(new Employee("D004", "Keven", "Developer"));
        employeeList.add(new Employee("D005", "Thomas", "Developer"));
        employeeList.add(new Employee("D006", "Edison", "Developer"));
        employeeList.add(new Employee("DD001", "Charlie", "Designer"));
        employeeList.add(new Employee("DD002", "Lisa", "Designer"));
        employeeList.add(new Employee("DD003", "Myra", "Designer"));
        employeeList.add(new Employee("DD004", "Kay", "Designer"));
        employeeList.add(new Employee("DD005", "Min", "Designer"));
        employeeList.add(new Employee("DD006", "Alice", "Designer"));
        employeeList.add(new Employee("DD007", "Matcha", "Designer"));
        employeeList.add(new Employee("DD008", "Valid", "Designer"));
        employeeList.add(new Employee("C001", "Mie", "Content"));
        employeeList.add(new Employee("C002", "Negav", "Content"));
        employeeList.add(new Employee("C003", "Issac", "Content"));
        employeeList.add(new Employee("C004", "Hurrykng", "Content"));
        employeeList.add(new Employee("C005", "Aza", "Content"));
        employeeList.add(new Employee("C006", "Yeolan", "Content"));
        employeeList.add(new Employee("C007", "Jungkook", "Content"));

        for (Employee emp : employeeList) {
            TableRow row = new TableRow(this);

            TextView idView = new TextView(this);
            idView.setText(emp.getId());
            idView.setPadding(8, 8, 8, 8);

            TextView nameView = new TextView(this);
            nameView.setText(emp.getName());
            nameView.setPadding(8, 8, 8, 8);

            TextView positionView = new TextView(this);
            positionView.setText(emp.getPosition());
            positionView.setPadding(8, 8, 8, 8);

            row.addView(idView);
            row.addView(nameView);
            row.addView(positionView);

            tableLayout.addView(row);
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
