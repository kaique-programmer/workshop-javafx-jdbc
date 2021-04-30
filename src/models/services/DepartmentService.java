package models.services;

import model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {
    public List<Department> findAll() {
        List<Department> list = new ArrayList<>();
        list.add(new Department(1, "Note"));
        list.add(new Department(2, "Board"));
        list.add(new Department(3, "Book"));
        return list;
    }
}
